package com.guz.spring.appclima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guz.spring.appclima.model.WeatherData;
import com.guz.spring.appclima.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;


	@GetMapping("/{city}")
	public WeatherData getWeather(@PathVariable String city) {
		return weatherService.getWeatherData(city);
	}
}
