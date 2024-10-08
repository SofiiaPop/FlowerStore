package flower.store;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

class Store {
    @Getter @Setter
    private List<Flower> inventory;

    public Store() {
        this.inventory = new ArrayList<>();
    }

    public List<Flower> search(String color) {
        List<Flower> result = new ArrayList<>();
        for (Flower flower : inventory) {
            if (flower.getColor().equalsIgnoreCase(color)) {
                result.add(flower);
            }
        }
        return result;
    }
}