package com.design.patterns.hometheatre.subcomponents;

public class Amplifier {


  private int volumnIntensity;
  private boolean isOn;

  public void on() {
    isOn = true;
    System.out.println("Amplifier is on");
  }
  public void off() {
    isOn = false;
    System.out.println("Amplifier is off");
  }

  public void setVolumnIntensity(int volumnIntensity) {
    this.volumnIntensity = volumnIntensity;
    System.out.println("Amplifier volume is set to " + volumnIntensity);
  }
}
