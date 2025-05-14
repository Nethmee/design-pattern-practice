package com.design.patterns.service.impl;

import com.design.patterns.service.Shape;

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("Drawing a Circle");
  }
}
