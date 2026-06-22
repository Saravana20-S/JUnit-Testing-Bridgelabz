package com.bridgelabz.temperatureconversion;

public class TemperatureConversion {

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        double fahrenheit = 98.6;
        double celsius = 37;

        System.out.println(fahrenheit + "°F = "
                + fahrenheitToCelsius(fahrenheit) + "°C");

        System.out.println(celsius + "°C = "
                + celsiusToFahrenheit(celsius) + "°F");
    }
}