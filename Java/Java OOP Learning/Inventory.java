import java.util.ArrayList;

// Product class to represent individual products
class Product {
    private String productName;
    private int quantity;
    private int lowInventoryThreshold;

    // Constructor to initialize product details
    public Product(String productName, int quantity, int lowInventoryThreshold) {
        this.productName = productName;
        this.quantity = quantity;
        this.lowInventoryThreshold = lowInventoryThreshold;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getLowInventoryThreshold() {
        return lowInventoryThreshold;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Quantity: " + quantity);
    }

    // Method to check if inventory is low
    public boolean isLowInventory() {
        return quantity <= lowInventoryThreshold;
    }

    // Method to add stock to the product
    public void addStock(int amount) {
        quantity += amount;
    }

    // Method to reduce stock of the product
    public void removeStock(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            System.out.println("Not enough stock of " + productName);
        }
    }
}

// Inventory class to manage a collection of products
class Inventory {
    private ArrayList<Product> products;

    // Constructor to initialize the inventory
    public Inventory() {
        products = new ArrayList<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " added to inventory.");
    }

    // Method to remove a product from the inventory
    public void removeProduct(String productName) {
        Product toRemove = null;
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                toRemove = product;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println(productName + " removed from inventory.");
        } else {
            System.out.println(productName + " not found in inventory.");
        }
    }

    // Method to check for low inventory
    public void checkLowInventory() {
        System.out.println("Checking for low inventory:");
        for (Product product : products) {
            if (product.isLowInventory()) {
                System.out.println(product.getProductName() + " is low on stock. Quantity: " + product.getQuantity());
            }
        }
    }

    // Method to display all products in inventory
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : products) {
            product.displayProductDetails();
        }
    }

    public static void main(String[] args) {
        // Create Inventory object
        Inventory inventory = new Inventory();

        // Create Product objects
        Product product1 = new Product("Laptop", 10, 5);
        Product product2 = new Product("Mouse", 50, 10);
        Product product3 = new Product("Keyboard", 7, 2);

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Display inventory
        inventory.displayInventory();

        // Check for low inventory
        inventory.checkLowInventory();

        // Remove some stock
        product1.removeStock(6);
        product2.removeStock(45);

        // Display inventory after stock reduction
        inventory.displayInventory();

        // Check for low inventory again
        inventory.checkLowInventory();

        // Remove a product from the inventory
        inventory.removeProduct("Mouse");

        // Display final inventory
        inventory.displayInventory();
    }
}
