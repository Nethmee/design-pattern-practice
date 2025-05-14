package strategy.impl;

import strategy.PaymentStrategy;

public class CachPayement implements PaymentStrategy {

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using cash.");
  }
}
