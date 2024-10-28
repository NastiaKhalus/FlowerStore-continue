package flower.store.delivery;
public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(String item) {
        System.out.println("Delivered " + item + " by Post");
    }
}
