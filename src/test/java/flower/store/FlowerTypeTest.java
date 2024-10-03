package flower.store;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class FlowerTypeTest {

    @Test
    void testChamomile() {
        Assertions.assertEquals(FlowerType.CHAMOMILE,
        FlowerType.valueOf("CHAMOMILE"));
    }

    @Test
    void testRose() {
        Assertions.assertEquals(FlowerType.ROSE, FlowerType.valueOf("ROSE"));
    }

    @Test
    void testTulip() {
        Assertions.assertEquals(FlowerType.TULIP, FlowerType.valueOf("TULIP"));
    }
}
