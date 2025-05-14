package com.design.patterns.strategy.impl;

import com.design.patterns.strategy.AuthenticationStrategy;

public class OAuthStrategy implements AuthenticationStrategy {

  @Override
  public boolean authenticate(String user) {

    System.out.println("Authenticating using OAuth2 strategy");
    return true;
  }
}
