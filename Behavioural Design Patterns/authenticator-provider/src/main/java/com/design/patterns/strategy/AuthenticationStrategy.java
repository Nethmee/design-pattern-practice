package com.design.patterns.strategy;

public interface AuthenticationStrategy {

  public boolean authenticate(String user);
}
