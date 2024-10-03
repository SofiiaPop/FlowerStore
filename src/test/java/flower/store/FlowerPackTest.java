package flower.store;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerPackTest {

    private static final Random RANDOM_GENERATOR = new Random();

    @Test
    void testFlowerPackCreation() {
        FlowerColor color = FlowerColor.RED;
        FlowerType type = FlowerType.ROSE;
        double expSepalLength = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(10);
        double expPrice = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(50);
        int count = RANDOM_GENERATOR.nextInt(10) + 1;

        Flower flower = new Flower(expSepalLength, color, expPrice, type);
        FlowerPack flowerPack = new FlowerPack(flower, count);

        assertEquals(count, flowerPack.getCount());
        assertEquals(expSepalLength, flowerPack.getFlower().getSepalLength());
        assertEquals(expPrice, flowerPack.getFlower().getPrice());
    }

    @Test
    void testGetPrice() {
        FlowerColor color = FlowerColor.BLUE;
        FlowerType type = FlowerType.TULIP;
        double expSepalLength = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(10);
        double expPrice = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(50);
        int count = RANDOM_GENERATOR.nextInt(10) + 1;

        Flower flower = new Flower(expSepalLength, color, expPrice, type);
        FlowerPack flowerPack = new FlowerPack(flower, count);

        double expectedPrice = expPrice * count;
        assertEquals(expectedPrice, flowerPack.getPrice());
    }
}
