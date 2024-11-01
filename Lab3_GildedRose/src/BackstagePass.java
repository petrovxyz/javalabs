public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void update() {
        sellIn.decrease();
        if (sellIn.isLessThan(0)) {
            quality.reset();
            return;
        }
        quality.increase();
        if (sellIn.isLessThan(10)) {
            quality.increase();
        }
        if (sellIn.isLessThan(5)) {
            quality.increase();
        }
    }

    @Override
    public String getName() {
        return "Backstage passes to a TAFKAL80ETC concert";
    }
}