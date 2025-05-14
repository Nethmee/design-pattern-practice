package com.design.patterns.adapter;

import com.design.patterns.existing.OldThemometer;
import com.design.patterns.expected.TemperatureSensor;

public class ThemometerAdapter implements TemperatureSensor {

  private final OldThemometer oldThemometer;

  public ThemometerAdapter(OldThemometer oldThemometer) {
    this.oldThemometer = oldThemometer;
  }

  @Override
  public double getTemperatureInCelsius() {

    double adaptedValue = (oldThemometer.getTemperatureInFehrenheit() - 32) * 5 / 9;
    System.out.println("Converting Fahrenheit to Celsius");
    return adaptedValue;

  }


}
