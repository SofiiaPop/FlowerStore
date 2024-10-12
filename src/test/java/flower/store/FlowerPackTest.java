package flower.store;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import java.util.Random;


public class FlowerPackTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int TEN = 10;
    private static final int FIFTY = 50;
    private static final int ONE = 1;

    @Test
    void testFlowerPackCreation() {
        FlowerColor color = FlowerColor.RED;
        FlowerType type = FlowerType.ROSE;
        double expSepalLength = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(TEN);
        double expPrice = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(FIFTY);
        int count = RANDOM_GENERATOR.nextInt(TEN) + ONE;

        Flower flower = new Flower(expSepalLength, color, expPrice, type);
        FlowerPack flowerPack = new FlowerPack(flower, count);

        Assertions.assertEquals(count, flowerPack.getCount());
        Assertions.assertEquals(expSepalLength,
        flowerPack.getFlower().getSepalLength());
        Assertions.assertEquals(expPrice, flowerPack.getFlower().getPrice());
    }

    @Test
    void testGetPrice() {
        FlowerColor color = FlowerColor.BLUE;
        FlowerType type = FlowerType.TULIP;
        double expSepalLength = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(TEN);
        double expPrice = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(FIFTY);
        int count = RANDOM_GENERATOR.nextInt(TEN) + ONE;

        Flower flower = new Flower(expSepalLength, color, expPrice, type);
        FlowerPack flowerPack = new FlowerPack(flower, count);

        double expectedPrice = expPrice * count;
        Assertions.assertEquals(expectedPrice, flowerPack.getPrice());
    }
}
