package flower.store;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class FlowerColorTest {

    @Test
    void testRedColor() {
        FlowerColor color = FlowerColor.RED;
        Assertions.assertEquals("#FF0000", color.toString());
    }

    @Test
    void testBlueColor() {
        FlowerColor color = FlowerColor.BLUE;
        Assertions.assertEquals("#0000FF", color.toString());
    }

    @Test
    void testGreenColor() {
        FlowerColor color = FlowerColor.GREEN;
        Assertions.assertEquals("#00FF00", color.toString());
    }

    @Test
    void testYellowColor() {
        FlowerColor color = FlowerColor.YELLOW;
        Assertions.assertEquals("#00FFFF", color.toString());
    }

    @Test
    void testWhiteColor() {
        FlowerColor color = FlowerColor.WHITE;
        Assertions.assertEquals("#FFFFFF", color.toString());
    }
}
