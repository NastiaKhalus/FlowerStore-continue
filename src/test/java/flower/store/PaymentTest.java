package flower.store;

import flower.store.payment.Payment;
import flower.store.payment.CreditCardPaymentStrategy;
import flower.store.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PaymentTest {

    @Test
    void testCreditCardPayment() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Payment payment = new CreditCardPaymentStrategy();
        payment.pay(100.0);
        
        assertEquals("Paid 100.0 with Credit Card\n", outContent.toString());
    }

    @Test
    void testPayPalPayment() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Payment payment = new PayPalPaymentStrategy();
        payment.pay(50.0);
        
        assertEquals("Paid 50.0 via PayPal\n", outContent.toString());
    }
}
