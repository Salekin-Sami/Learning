class Item {
    private String name;
    private String type;
    private double price;


// Constructor to initialize attributes
    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}