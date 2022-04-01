package com.promineo;

public class Temperature {
	public final static double ABSOLUTE_ZERO = -459.67;
	private double fahrenheit;

	public Temperature(double fahrenheit) {
		if (fahrenheit < ABSOLUTE_ZERO) {
			throw new MinimumTemperatureViolation(fahrenheit);
		}
		this.fahrenheit = fahrenheit;
	}

	public Double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double d) {
		this.fahrenheit = d;
	}

	public double getCelsius() {
		return (getFahrenheit()-32)/1.8;
	}

}
