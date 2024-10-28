package flower.store;

class Cammomile extends Flower {

    public Cammomile() {
        super(FlowerColor.WHITE, FlowerType.CAMMOMILE, 0.0, 0.0);
    }

    public Cammomile (double sepalLength, FlowerColor color, double price) {
        super(color, FlowerType.CAMMOMILE, price, sepalLength);
    }
}

