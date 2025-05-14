package com.design.patterns;

import com.design.patterns.context.AuthenticationStrategyContext;
import com.design.patterns.strategy.impl.OAuthStrategy;

public class AuthenticationProviderMain {

  public static void main(String[] args) {
    System.out.println("==== Let's build an Authentication Strategy Tool! ====");

    AuthenticationStrategyContext context = new AuthenticationStrategyContext();
    context.setStrategy(new OAuthStrategy());

    context.processAuthentication("Nethmee");
  }
}
