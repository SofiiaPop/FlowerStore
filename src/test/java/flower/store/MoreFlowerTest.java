package flower.store;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoreFlowerTest {

    private static final Random RANDOM_GENERATOR = new Random();

    @Test
    void testConstructor1() {
        double expSepalLength = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(10);
        double expPrice = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(50);

        FlowerColor color = FlowerColor.RED;
        FlowerType type = FlowerType.ROSE;

        Flower flower = new Flower(expSepalLength, color, expPrice, type);

        assertEquals(expSepalLength, flower.getSepalLength());
        assertEquals(expPrice, flower.getPrice());
        assertEquals(color.toString(), flower.getColor());
        assertEquals(type, flower.getFlowerType());
    }

    @Test
    void testCopyConstructor2() {
        double expSepalLength = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(10);
        double expPrice = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(50);

        FlowerColor color = FlowerColor.BLUE;
        FlowerType type = FlowerType.TULIP;

        Flower original = new Flower(expSepalLength, color, expPrice, type);
        Flower copy = new Flower(original);

        assertEquals(original.getSepalLength(), copy.getSepalLength());
        assertEquals(original.getPrice(), copy.getPrice());
        assertEquals(original.getColor(), copy.getColor());
        assertEquals(original.getFlowerType(), copy.getFlowerType());
    }

    @Test
    void testGetColor() {
        double expSepalLength = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(10);
        double expPrice = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(50);

        FlowerColor color = FlowerColor.YELLOW;

        Flower flower = new Flower(expSepalLength, color, expPrice, FlowerType.CHAMOMILE);

        assertEquals(color.toString(), flower.getColor());
    }
}
