package com.guz.spring.appclima.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.guz.spring.appclima.model.WeatherData;

@Service
public class WeatherService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${openweathermap.apiKey}")
	private String apiKey;

	// "https://api.openweathermap.org/data/2.5/weather?q=London&appid=88194819dd88f1bdf714baa636d67b1c&units=metric";
	// "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";
	// "http://api.openweathermap.org/geo/1.0/direct?q={city}&limit=5&appid={apikey}";

	private static final String OPEN_WEATHER_BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";

	public WeatherData getWeatherData(String city) {
		RestTemplate restTemplate = new RestTemplate();
		WeatherData weatherData = new WeatherData();
		try {
			weatherData = restTemplate.getForObject(OPEN_WEATHER_BASE_URL, WeatherData.class, city, apiKey);
			weatherData.setStatusMessage("OK");
		} catch (RestClientException e) {
			logger.error("Se ha producido un error en la llamada API a openweathermap.org", e);
			weatherData.setStatusMessage(e.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("error desconocido al obtener data desde openweathermap.org");
		}
		return weatherData;
	}

}
