package com.design.patterns;

import com.design.patterns.service.Factory.ShapeFactory;
import com.design.patterns.service.Shape;

public class FactoryMain {

  public static void main(String[] args) {
    System.out.println("==== Let's learn Factory Design Pattern ====");

    ShapeFactory shapeFactory = new ShapeFactory();
    //get a circle
    Shape shape1 = shapeFactory.createShape("circle");
    shape1.draw();

    //get a rectangle
    Shape shape2 = shapeFactory.createShape("rectangle");
    shape2.draw();
  }
}
