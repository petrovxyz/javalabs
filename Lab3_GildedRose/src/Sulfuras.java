public class Sulfuras extends Item {
    public Sulfuras() {
        super(0, 80);
    }

    @Override
    public void update() {
        // нічого не робимо, оскільки даний товар незмінний
    }

    @Override
    public String getName() {
        return "Sulfuras, Hand of Ragnaros";
    }
}
