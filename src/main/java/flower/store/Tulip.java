package flower.store;

class Tulip extends Flower {

    public Tulip() {
        super(FlowerColor.YELLOW, FlowerType.TULIP, 10.0, 5.0); // Added default values
    }

    public Tulip(double sepalLength, FlowerColor color, double price) {
        super(color, FlowerType.TULIP, price, sepalLength);
    }
}
