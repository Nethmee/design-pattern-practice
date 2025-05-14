package strategy.impl;

import strategy.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy {

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using Paypal.");
  }
}
