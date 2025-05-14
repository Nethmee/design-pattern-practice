package com.design.patterns.service.impl;

import com.design.patterns.service.Shape;

public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.println("drawing a rectangle");
  }
}
