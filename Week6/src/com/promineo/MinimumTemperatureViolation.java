package com.promineo;

public class MinimumTemperatureViolation extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private double temperature;
	
	public MinimumTemperatureViolation(double temperature) {
		super(temperature + " is less than absolute zero (-459.67°F)");
		this.setTemperature(temperature);
		
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

}
