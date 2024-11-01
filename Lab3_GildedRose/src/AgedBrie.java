public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void update() {
        sellIn.decrease();
        quality.increase();
        if (sellIn.isLessThan(0)) {
            quality.increase();
        }
    }

    @Override
    public String getName() {
        return "Aged Brie";
    }
}