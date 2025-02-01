import java.util.ArrayList;

class Inventory {
    private ArrayList<Item> items;

    // Constructor to initialize the list of items
    public Inventory() {
        items = new ArrayList<>();
    }

    // Method to add a new item to the inventory
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to display all items in the inventory
    public void displayItems() {
        for (Item item : items) {
            System.out.println("Name: " + item.getName() + ", Type: " + item.getType() + ", Price: $" + item.getPrice());
        }
    }
}