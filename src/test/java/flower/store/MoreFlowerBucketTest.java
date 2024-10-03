package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
public class MoreFlowerBucketTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private int ten = 10;
    private int fifty = 50;
    private int one = 1;

    @Test
    void testAddFlowerPack() {
        FlowerColor color = FlowerColor.RED;
        FlowerType type = FlowerType.ROSE;
        double expSepalLength = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(ten);
        double expPrice = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(fifty);
        int quantity = RANDOM_GENERATOR.nextInt(ten) + one;

        FlowerPack flowerPack = new FlowerPack(new Flower(expSepalLength, color,
        expPrice, type), quantity);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);

        double expectedPrice = expPrice * quantity;
        Assertions.assertEquals(expectedPrice, flowerBucket.getPrice());
    }

    @Test
    void testGetPrice() {
        FlowerBucket flowerBucket = new FlowerBucket();
        double totalExpectedPrice = 0;

        for (int i = 0; i < 5; i++) {
            FlowerColor color = FlowerColor.values()
            [RANDOM_GENERATOR.nextInt(FlowerColor.values().length)];
            FlowerType type = FlowerType.values()
            [RANDOM_GENERATOR.nextInt(FlowerType.values().length)];
            double expSepalLength = RANDOM_GENERATOR.nextDouble()
            * RANDOM_GENERATOR.nextInt(ten);
            double expPrice = RANDOM_GENERATOR.nextDouble()
            * RANDOM_GENERATOR.nextInt(fifty);
            int quantity = RANDOM_GENERATOR.nextInt(ten) + one;

            FlowerPack flowerPack = new FlowerPack(new Flower(expSepalLength, color,
            expPrice, type), quantity);
            flowerBucket.add(flowerPack);
            totalExpectedPrice += expPrice * quantity;
        }

        Assertions.assertEquals(totalExpectedPrice, flowerBucket.getPrice());
    }
}
