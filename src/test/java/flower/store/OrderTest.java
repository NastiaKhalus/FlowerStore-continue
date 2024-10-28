package flower.store;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

public class OrderTest {

    @Test
    void testOrderCreationAndGetItems() {
        Item item1 = new Item("Rose", 5);
        Item item2 = new Item("Lily", 3);
        
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        Order order = new Order(items);
        assertEquals(items, order.getItems());
        assertEquals(2, order.getItems().size());
    }

    @Test
    void testSetItems() {
        Item item1 = new Item("Rose", 5);
        Item item2 = new Item("Lily", 3);
        List<Item> initialItems = List.of(item1, item2);
        
        Item item3 = new Item("Tulip", 10);
        List<Item> newItems = List.of(item3);
    
        Order order = new Order(initialItems);
        order.setItems(newItems);
        
        assertEquals(newItems, order.getItems());
        assertEquals(1, order.getItems().size());
        assertEquals("Tulip", order.getItems().get(0).getName());
    }
}

