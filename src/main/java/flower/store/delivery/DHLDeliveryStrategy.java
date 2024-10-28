package flower.store.delivery;
public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(String item) {
        System.out.println("Delivered " + item + " via DHL");
    }
}