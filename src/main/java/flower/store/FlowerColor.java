package flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00"),
    YELLOW("#00FFFF"), WHITE("#FFFFFF");
    private final String rgb;

    FlowerColor(String rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return rgb;
    }
}
