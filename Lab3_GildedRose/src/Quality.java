public class Quality {
    private int value;

    public Quality(int value) {
        this.value = value;
    }

    public void increase() {
        if (value < 50) {
            value++;
        }
    }

    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    public void reset() {
        value = 0;
    }

    public boolean isLessThan(int threshold) {
        return value < threshold;
    }

    public boolean isGreaterThan(int threshold) {
        return value > threshold;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}