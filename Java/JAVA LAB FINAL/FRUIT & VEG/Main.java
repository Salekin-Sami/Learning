public class Main {
    public static void main(String[] args) {
        // Create an Inventory object
        Inventory inventory = new Inventory();

        // Create some Item objects (fruits and vegetables)
        Item apple = new Item("Apple", "Fruit", 1.50);
        Item carrot = new Item("Carrot", "Vegetable", 0.80);
        Item banana = new Item("Banana", "Fruit", 0.90);

        // Add items to the inventory
        inventory.addItem(apple);
        inventory.addItem(carrot);
        inventory.addItem(banana);

        // Display all items in the inventory
        inventory.displayItems();
    }
}