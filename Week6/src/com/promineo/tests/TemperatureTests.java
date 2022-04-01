package com.promineo.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.promineo.MinimumTemperatureViolation;
import com.promineo.Temperature;

class TemperatureTests {

	@Test
	void testConstructorTakesTempAsFahrenheit() {
		// Arrange - set up test environment
		double fahrenheit = 45;
		
		
		// Act - invoke system under test
		Temperature temperature = new Temperature(fahrenheit);	
		
		// Assert - test conditions
		assertEquals(fahrenheit,temperature.getFahrenheit());
		
	}

	@Test
	void testSetFahrenheitSetInternalTemperature() {
		double fahrenheit = 0;
		Temperature temperature = new Temperature(fahrenheit);
		
		temperature.setFahrenheit(212.0);
		
		assertEquals(212.0, temperature.getFahrenheit());
	}
	
	
	@Test
	void testConstructorWithTemperatureLessThan459_67ThrowsException() {
		//arrange
		double fahrenheit = -459.68;
			
		//act/assert
		try {
		Temperature temperature = new Temperature(fahrenheit);
			//fail
		fail("Expected minimum temp violation exception was not thrown");
		} catch (MinimumTemperatureViolation e) {
			//success
			assertEquals(fahrenheit, e.getTemperature());
		}
		
		//assert
		
	}
	
	@Test
	void testGetCelciusWith32FahrenheitReturns0Celcius() {
		//arrange
		
		double fahrenheit = 32;
		double expected = 0;
		Temperature temperature = new Temperature(fahrenheit);
		
		
		//act
		double actual = temperature.getCelsius();
		//assert
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testGetCelciusWith212FahrenheitReturns100Celcius() {
		//arrange
		
		double fahrenheit = 212;
		double expected = 100;
		Temperature temperature = new Temperature(fahrenheit);
		
		
		//act
		double actual = temperature.getCelsius();
		//assert
		assertEquals(expected, actual, 0.1);
		
	}
	
	
}
