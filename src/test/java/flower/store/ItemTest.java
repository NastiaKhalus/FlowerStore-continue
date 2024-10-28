
package flower.store;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ItemTest {

    @Test
    void testItemCreationAndGetters() {
        Item item = new Item("Rose", 5);

        assertEquals("Rose", item.getName());
        assertEquals(5, item.getQuantity());
    }

    @Test
    void testSetters() {
        Item item = new Item("Lily", 3);
        item.setName("Daisy");
        item.setQuantity(7);
        assertEquals("Daisy", item.getName());
        assertEquals(7, item.getQuantity());
    }
}
