package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {
        flowerType = flower.flowerType;
        sepalLength = flower.sepalLength;
        color = flower.color;
        price = flower.price;
    }

    public String getColor() {
        return color.toString();
    }
}
