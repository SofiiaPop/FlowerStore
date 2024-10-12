package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StoreTest {

    private static final double FIVE = 5.0;
    private static final double TEN = 10.0;
    private static final double SIX = 6.0;
    private static final double FIFT = 15.0;
    private static final double FOUR = 4.0;
    private static final double SEV = 7.0;
    private static final double TWELVE = 12.0;
    private static final double TWENTY = 20.0;
    private Store store;

    @BeforeEach
    void setUp() {
        List<Flower> inventory = Arrays.asList(
            new Flower(FIVE, FlowerColor.RED, TEN, FlowerType.ROSE),
            new Flower(SIX, FlowerColor.BLUE, FIFT, FlowerType.TULIP),
            new Flower(FOUR, FlowerColor.YELLOW, TWELVE, FlowerType.CHAMOMILE),
            new Flower(SEV, FlowerColor.RED, TWENTY, FlowerType.ROSE)
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
    void testSearchByNonExisTENtColor() {
        List<Flower> result = store.search("#00FF00");
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void testSearchCaseInsensitive() {
        List<Flower> result = store.search("#00FFFF");
        Assertions.assertEquals(1, result.size());
    }
}
