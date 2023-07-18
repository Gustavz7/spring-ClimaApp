package com.guz.spring.appclima.model;

import java.io.Serializable;

public class WeatherData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String name;
	double temp;
	String description;
	MainWeatherInfo main;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MainWeatherInfo getMain() {
		return main;
	}

	public void setMain(MainWeatherInfo main) {
		this.main = main;
	}

}
