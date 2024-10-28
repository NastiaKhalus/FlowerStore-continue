package flower.store;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

// Flower.java
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Flower {
    private FlowerColor color;
    private FlowerType flowerType;
    private double price;
    private double sepalLength;

    public Flower(Flower flower) {  // Copy constructor for FlowerPack class
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    public Flower(FlowerType flowerType, FlowerColor color) {
        this.flowerType = flowerType;
        this.color = color;
        this.price = 10.0;
        this.sepalLength = 5.0;
    }

    public String getColorCode() {
        return color.getCode();
    }
}
