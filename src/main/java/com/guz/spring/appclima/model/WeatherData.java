package com.guz.spring.appclima.model;

import java.io.Serializable;

/*must be Serializable due the rest call*/
public class WeatherData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String name;
	double temp;
	String description;
	MainWeatherInfo main;
	String statusMessage;

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

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String status) {
		this.statusMessage = status;
	}

}
