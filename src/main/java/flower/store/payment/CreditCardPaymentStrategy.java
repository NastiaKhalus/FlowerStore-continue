package flower.store.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with Credit Card");
    }
}
