package com.design.patterns.strategy.impl;

import com.design.patterns.strategy.AuthenticationStrategy;

public class OLAPStrategy implements AuthenticationStrategy {

  @Override
  public boolean authenticate(String user) {
    System.out.println("Authenticating using OLAP strategy");
    return true;
  }
}
