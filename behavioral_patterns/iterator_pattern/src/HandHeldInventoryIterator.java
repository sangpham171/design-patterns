public class HandHeldInventoryIterator implements InventoryIterator {
    private HandHeldInventory inventory;
    private int index;

    public HandHeldInventoryIterator(HandHeldInventory inventory) {
        this.inventory = inventory;
    }

    public boolean hasNext() {
        return index < inventory.getItems()
                                .size();
    }

    public Item next() {
        return inventory.getItems()
                        .get(index++);
    }
}
