package com.design.patterns.hometheatre.subcomponents;

public class Projector {

  boolean isOn;

  public void on() {
    System.out.println("Projector ON");
  }

  public void wideScreenMode() {
    System.out.println("Set to widescreen mode");
  }

  public void off() {
    System.out.println("Projector OFF");
  }
}
