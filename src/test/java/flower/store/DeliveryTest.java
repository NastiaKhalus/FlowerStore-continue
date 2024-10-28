package flower.store;

import flower.store.delivery.Delivery;
import flower.store.delivery.DeliveryStrategy;
import flower.store.delivery.DHLDeliveryStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DeliveryTest {

    @Test
    void testDeliveryStrategy() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Delivery delivery = new DeliveryStrategy();
        delivery.deliver("flowers");
        
        assertEquals("Delivered flowers by Post\n", outContent.toString());
    }

    @Test
    void testDHLDeliveryStrategy() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Delivery delivery = new DHLDeliveryStrategy();
        delivery.deliver("flowers");
        
        assertEquals("Delivered flowers via DHL\n", outContent.toString());
    }
}
