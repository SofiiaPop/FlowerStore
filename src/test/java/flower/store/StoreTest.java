package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StoreTest {

    private Store store;
    private double five = 5.0;
    private double ten = 10.0;

    @BeforeEach
    void setUp() {
        List<Flower> inventory = Arrays.asList(
            new Flower( five, FlowerColor.RED, ten, FlowerType.ROSE),
            new Flower(6.0, FlowerColor.BLUE, 15.0, FlowerType.TULIP),
            new Flower(4.0, FlowerColor.YELLOW, 12.0, FlowerType.CHAMOMILE),
            new Flower(7.0, FlowerColor.RED, 20.0, FlowerType.ROSE)
        );
        store = new Store();
        store.setInventory(inventory);
    }

    @Test
    void testSearchByRedColor() {
        List<Flower> result = store.search("#FF0000");
        Assertions.assertEquals(2, result.size());
    }

    @Test
    void testSearchByBlueColor() {
        List<Flower> result = store.search("#0000FF");
        Assertions.assertEquals(1, result.size());
    }

    @Test
    void testSearchByNonExistentColor() {
        List<Flower> result = store.search("#00FF00");
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void testSearchCaseInsensitive() {
        List<Flower> result = store.search("#00FFFF");
        Assertions.assertEquals(1, result.size());
    }
}
