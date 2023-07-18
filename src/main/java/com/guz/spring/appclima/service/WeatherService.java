package com.guz.spring.appclima.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.guz.spring.appclima.model.WeatherData;

@Service
public class WeatherService {
	@Value("${openweathermap.apiKey}")
	private String apiKey;

	//"https://api.openweathermap.org/data/2.5/weather?q=London&appid=88194819dd88f1bdf714baa636d67b1c&units=metric";
	//"https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";
	//"http://api.openweathermap.org/geo/1.0/direct?q={city}&limit=5&appid={apikey}";

	private static final String OPEN_WEATHER_BASE_URL="https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";


	public WeatherData getWeatherData(String city) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(OPEN_WEATHER_BASE_URL, WeatherData.class, city, apiKey);
	}

}
