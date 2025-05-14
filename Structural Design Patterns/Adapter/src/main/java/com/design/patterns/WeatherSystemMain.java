package com.design.patterns;

import com.design.patterns.adapter.ThemometerAdapter;
import com.design.patterns.existing.OldThemometer;
import com.design.patterns.expected.TemperatureSensor;

public class WeatherSystemMain {

  public static void main(String[] args) {
    System.out.println("=== Let's learn adapter pattern ===");
    OldThemometer oldThemometer = new OldThemometer();
    TemperatureSensor adapter = new ThemometerAdapter(oldThemometer);
    WeatherDisplay weatherDisplay = new WeatherDisplay(adapter);
    weatherDisplay.displayTemperature();
  }
}
