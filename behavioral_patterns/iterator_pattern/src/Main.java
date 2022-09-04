public class Main {
    public static void main(String[] args) {

        Inventory inventory = new HandHeldInventory();
        InventoryIterator inventoryIterator = inventory.createIterator();

        inventory.addItem(new Item("Item 1"));
        inventory.addItem(new Item("Item 2"));
        inventory.addItem(new Item("Item 3"));

        while (inventoryIterator.hasNext()) {
            Item item = inventoryIterator.next();
            System.out.println(item.getName());
        }
    }
}