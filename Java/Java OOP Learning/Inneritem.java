import java.util.*;

class item {
    private String name;
    private String type;
    private double price;

    public item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}

class Inventory {
    private ArrayList<item> Items;

    public Inventory() {
        Items = new ArrayList<>();
    }

    public void addItem(item items) {
        Items.add(items);
    }

    public void displayItems() {
        System.out.println("Inventory Items:");

        for (item i : Items) {
            System.out.println(i.getName() + " - " + i.getType() + " - " + i.getPrice());
        }
    }
}

public class Inneritem {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        System.out.print("Add how many items to the inventory? : ");
        int cnt = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (int i = 0; i < cnt; i++) {
            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Type:");
            String type = sc.nextLine();

            System.out.println("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume the newline

            item Item = new item(name, type, price);
            inventory.addItem(Item);
        }

        inventory.displayItems();
    }
}
