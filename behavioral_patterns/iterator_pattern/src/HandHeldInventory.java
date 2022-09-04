import java.util.ArrayList;
import java.util.List;

public class HandHeldInventory implements Inventory {
    private List<Item> items;

    public HandHeldInventory() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public InventoryIterator createIterator() {
        return new HandHeldInventoryIterator(this);
    }

    public List<Item> getItems() {
        return items;
    }
}
