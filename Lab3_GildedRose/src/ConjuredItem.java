public class ConjuredItem extends Item {
    private final Name name;

    public ConjuredItem(String name, int sellIn, int quality) {
        super(sellIn, quality);
        this.name = new Name(name);
    }

    @Override
    public void update() {
        sellIn.decrease();
        quality.decrease();
        quality.decrease();
        if (sellIn.isLessThan(0)) {
            quality.decrease();
            quality.decrease();
        }
    }

    @Override
    public String getName() {
        return name.toString();
    }
}