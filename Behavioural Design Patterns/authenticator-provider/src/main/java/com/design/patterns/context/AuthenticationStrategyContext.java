package com.design.patterns.context;

import com.design.patterns.strategy.AuthenticationStrategy;

public class AuthenticationStrategyContext {

  AuthenticationStrategy strategy;

  public AuthenticationStrategyContext() {
    //default constructor
  }

  public void setStrategy(AuthenticationStrategy strategy) {
    this.strategy = strategy;
  }

  public boolean processAuthentication(String user) {
    return strategy.authenticate(user);
  }

}
