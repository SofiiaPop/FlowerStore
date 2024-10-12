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
    private double six = 6.0;
    private double fift = 15.0;
    private double four = 4.0;
    private double sev = 7.0;
    private double twelve = 12.0;
    private double twenty = 20.0;

    @BeforeEach
    void setUp() {
        List<Flower> inventory = Arrays.asList(
            new Flower(five, FlowerColor.RED, ten, FlowerType.ROSE),
            new Flower(six, FlowerColor.BLUE, fift, FlowerType.TULIP),
            new Flower(four, FlowerColor.YELLOW, twelve, FlowerType.CHAMOMILE),
            new Flower(sev, FlowerColor.RED, twenty, FlowerType.ROSE)
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
