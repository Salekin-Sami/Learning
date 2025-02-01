class Dog {
    private String name;
    private String breed;

    // Constructor to initialize name and breed
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods to modify name and breed
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to print dog's details
    public void printDetails() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        // Creating two Dog objects
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Bulldog");

        // Printing their initial details
        dog1.printDetails();
        dog2.printDetails();

        // Modifying the name and breed using setter methods
        dog1.setName("Rocky");
        dog1.setBreed("Labrador");

        dog2.setName("Charlie");
        dog2.setBreed("Poodle");

        // Printing the updated details
        dog1.printDetails();
        dog2.printDetails();
    }
}
