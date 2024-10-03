package flower.store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerTypeTest {

    @Test
    void testChamomile() {
        assertEquals(FlowerType.CHAMOMILE, FlowerType.valueOf("CHAMOMILE"));
    }

    @Test
    void testRose() {
        assertEquals(FlowerType.ROSE, FlowerType.valueOf("ROSE"));
    }

    @Test
    void testTulip() {
        assertEquals(FlowerType.TULIP, FlowerType.valueOf("TULIP"));
    }
}
