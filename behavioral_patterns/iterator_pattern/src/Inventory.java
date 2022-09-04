public interface Inventory {
    InventoryIterator createIterator();

    void addItem(Item item);

    void removeItem(Item item);
}
