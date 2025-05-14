import strategy.context.PaymentContext;
import strategy.impl.PaypalPayment;

public class StrategyMain {


  /* ------BUSINESS REQUIREMENT-------
   *
   * for a specific payment module, payment can be done through cache,credit card or paypal
   *
   *
   *
   *
   * */
  public static void main(String[] args) {
    System.out.println("====  Let's learn Strategy Design Pattern!  ====");

    PaymentContext paymentContext = new PaymentContext();
    paymentContext.setPaymentStrategy(new PaypalPayment());
    paymentContext.executePayment(1000);


  }
}
