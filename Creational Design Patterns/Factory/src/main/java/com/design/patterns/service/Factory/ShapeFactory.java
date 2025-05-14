package com.design.patterns.service.Factory;

import com.design.patterns.service.Shape;
import com.design.patterns.service.impl.Circle;
import com.design.patterns.service.impl.Rectangle;

public class ShapeFactory {

  public Shape createShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    switch (shapeType.toLowerCase()) {

      case "circle":
        return new Circle();
      case "rectangle":
        return new Rectangle();
      default:
        throw new IllegalArgumentException("Unknown shape type: " + shapeType);

    }
  }
}
