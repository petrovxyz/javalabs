import java.util.List;

public class ItemCollection {
    private final List<Item> items;

    public ItemCollection(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.update();
        }
    }

    public List<Item> getItems() {
        return List.copyOf(items);
    }
}
