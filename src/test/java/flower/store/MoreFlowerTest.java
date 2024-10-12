package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
public class MoreFlowerTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private int ten = 10;
    private int fifty = 50;

    @Test
    void testConstructorFirst() {
        double expSepalLength = RANDOM_GENERATOR.nextDouble() * RANDOM_GENERATOR.nextInt(ten);
        double expPrice = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(fifty);

        FlowerColor color = FlowerColor.RED;
        FlowerType type = FlowerType.ROSE;

        Flower flower = new Flower(expSepalLength, color, expPrice, type);

        Assertions.assertEquals(expSepalLength, flower.getSepalLength());
        Assertions.assertEquals(expPrice, flower.getPrice());
        Assertions.assertEquals(color.toString(), flower.getColor());
        Assertions.assertEquals(type, flower.getFlowerType());
    }

    @Test
    void testCopyConstructorSecond() {
        double expSepalLength = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(ten);
        double expPrice = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(fifty);

        FlowerColor color = FlowerColor.BLUE;
        FlowerType type = FlowerType.TULIP;

        Flower original = new Flower(expSepalLength, color, expPrice, type);
        Flower copy = new Flower(original);

        Assertions.assertEquals(original.getSepalLength(),
        copy.getSepalLength());
        Assertions.assertEquals(original.getPrice(), copy.getPrice());
        Assertions.assertEquals(original.getColor(), copy.getColor());
        Assertions.assertEquals(original.getFlowerType(), copy.getFlowerType());
    }

    @Test
    void testGetColor() {
        double expSepalLength = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(ten);
        double expPrice = RANDOM_GENERATOR.nextDouble()
        * RANDOM_GENERATOR.nextInt(fifty);

        FlowerColor color = FlowerColor.YELLOW;

        Flower flower = new Flower(expSepalLength, 
        color, expPrice, FlowerType.CHAMOMILE);

        Assertions.assertEquals(color.toString(), flower.getColor());
    }
}
