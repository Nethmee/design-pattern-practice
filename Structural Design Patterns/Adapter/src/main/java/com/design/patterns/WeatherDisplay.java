package com.design.patterns;

import com.design.patterns.expected.TemperatureSensor;

public class WeatherDisplay {

  //need to show the temperature got from the legacy sensor but to make it compatible, it should be read in Celsius

  TemperatureSensor temperatureSensor;

  public WeatherDisplay(TemperatureSensor temperatureSensor) {
    this.temperatureSensor = temperatureSensor;
  }

  public void displayTemperature() {
    temperatureSensor.getTemperatureInCelsius();
    System.out.println("Temperature in Celsius: " + temperatureSensor.getTemperatureInCelsius());
  }
}
