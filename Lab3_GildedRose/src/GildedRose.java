public class GildedRose {
    private final ItemCollection itemCollection;

    public GildedRose(ItemCollection itemCollection) {
        this.itemCollection = itemCollection;
    }

    public void updateQuality() {
        itemCollection.updateQuality();
    }
}