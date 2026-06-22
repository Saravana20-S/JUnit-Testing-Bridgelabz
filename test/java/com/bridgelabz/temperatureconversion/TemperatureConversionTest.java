package com.bridgelabz.temperatureconversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConversionTest {

    @Test
    void testCelsiusToFahrenheit() {

        assertEquals(
                212.0,
                TemperatureConversion.celsiusToFahrenheit(100),
                0.01
        );
    }

    @Test
    void testFahrenheitToCelsius() {

        assertEquals(
                0.0,
                TemperatureConversion.fahrenheitToCelsius(32),
                0.01
        );
    }

    @Test
    void testNormalBodyTemperature() {

        assertEquals(
                98.6,
                TemperatureConversion.celsiusToFahrenheit(37),
                0.1
        );
    }

    @Test
    void testNegativeTemperature() {

        assertEquals(
                -40.0,
                TemperatureConversion.fahrenheitToCelsius(-40),
                0.01
        );
    }

    @Test
    void testZeroCelsius() {

        assertEquals(
                32.0,
                TemperatureConversion.celsiusToFahrenheit(0),
                0.01
        );
    }
}