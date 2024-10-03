package flower.store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerColorTest {

    @Test
    void testRedColor() {
        FlowerColor color = FlowerColor.RED;
        assertEquals("#FF0000", color.toString());
    }

    @Test
    void testBlueColor() {
        FlowerColor color = FlowerColor.BLUE;
        assertEquals("#0000FF", color.toString());
    }

    @Test
    void testGreenColor() {
        FlowerColor color = FlowerColor.GREEN;
        assertEquals("#00FF00", color.toString());
    }

    @Test
    void testYellowColor() {
        FlowerColor color = FlowerColor.YELLOW;
        assertEquals("#00FFFF", color.toString());
    }

    @Test
    void testWhiteColor() {
        FlowerColor color = FlowerColor.WHITE;
        assertEquals("#FFFFFF", color.toString());
    }
}
