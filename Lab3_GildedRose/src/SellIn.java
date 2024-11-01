public class SellIn {
    private int value;

    public SellIn(int value) {
        this.value = value;
    }

    public void decrease() {
        value--;
    }

    public boolean isLessThan(int days) {
        return value < days;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}