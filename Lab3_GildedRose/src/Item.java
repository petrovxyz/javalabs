public abstract class Item {
    protected SellIn sellIn;
    protected Quality quality;

    public Item(int sellIn, int quality) {
        this.sellIn = new SellIn(sellIn);
        this.quality = new Quality(quality);
    }

    public abstract void update();

    public abstract String getName();

    @Override
    public String toString() {
        return getName() + ", " + sellIn + ", " + quality;
    }
}