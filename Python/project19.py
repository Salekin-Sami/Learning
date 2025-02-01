import csv
class Restaurant:
    def __init__(self):
        self.menu = {}  # Dictionary to store menu items and prices
        self.order = {}  # Dictionary to store orders
# save menus in csv file
    def save_menu_to_csv(self, filename="menu.csv"):
        """Saves the menu items to a CSV file."""
        try:
            with open(filename, mode="w", newline="") as file:
                writer = csv.writer(file,delimiter='|')
                writer.writerow(["Item Name", "Price", "Quantity"])  # Header
                for item, (price, quantity) in self.menu.items():
                    writer.writerow([item, price, quantity])
            print(f"Menu saved to {filename} successfully!")
        except Exception as e:
            print(f"Error saving menu to file: {e}")

            
    def manage_menu(self):
        """Manages the menu by adding, removing, updating items, or saving to CSV."""
        while True:
            print("\nMenu Management:")
            print("1. Add Item")
            print("2. Remove Item")
            print("3. Update Item Price")
            print("4. View Menu")
            print("5. Close for day") 
            print("6. Exit Management")

            try:
                choice = int(input("Enter your choice: "))
                
                if choice == 1:  
                    item_name = input("Enter item name: ").strip().title()
                    if item_name in self.menu:
                        print("Item already exists in the menu!")
                        continue
                    price = float(input("Enter item price: "))
                    quantity = int(input("Enter item quantity: "))
                    self.menu[item_name] = [price, quantity]
                    print(f"Item '{item_name}' added successfully!")

                elif choice == 2:  
                    item_name = input("Enter item name to remove: ").strip().title()
                    if item_name in self.menu:
                        del self.menu[item_name]
                        print(f"Item '{item_name}' removed successfully!")
                    else:
                        print(f"Error: Item '{item_name}' not found in the menu.")

                elif choice == 3:  
                    item_name = input("Enter item name to update: ").strip().title()
                    if item_name in self.menu:
                        price = float(input(f"Enter new price for '{item_name}': "))
                        quantity = int(input(f"Enter new quantity for '{item_name}': "))
                        self.menu[item_name] = [price, quantity]
                        print(f"Price and quantity of '{item_name}' updated successfully!")
                    else:
                        print(f"Error: Item '{item_name}' not found in the menu.")

                elif choice == 4:  # View Menu
                    if not self.menu:
                        print("The menu is empty!")
                    else:
                        print("\nCurrent Menu:")
                        for item, pq in self.menu.items():
                            print(f"{item}: ${pq[0]:.2f} (Quantity: {pq[1]})")

                elif choice == 5:  # Save Menu to CSV
                    self.save_menu_to_csv()
                    
                elif choice == 6:  
                    break

                else:
                    print("Invalid choice. Please try again.")
            
            except ValueError:
                print("Error: Please enter a valid number.")

    def take_order(self):
        if not self.menu:
            print("The menu is empty. Please add items before taking orders.")
            return
        
        print("\nCurrent Menu:")
        for item, pq in self.menu.items():
            print(f"{item}: ${pq[0]:.2f}: {pq[1]}")
        
        while True:
            try:
                item_name = input("Enter item name to order (or 'done' to finish): ").strip().title()
                if item_name.lower() == 'done':
                    break
                
                if item_name not in self.menu:
                    print(f"Error: '{item_name}' is not available on the menu.")
                    continue
                
                quantity = int(input(f"Enter quantity for '{item_name}': "))
                self.menu[item_name][1] -= quantity
                if quantity <= 0 or quantity > self.menu[item_name]:
                    print("Error: Quantity must be greater than 0.")
                    continue
                
                # Add the order to the order dictionary
                if item_name in self.order:
                    self.order[item_name] += quantity
                else:
                    self.order[item_name] = quantity
                print(f"'{item_name}' x {quantity} added to the order.")
            
            except ValueError:
                print("Error: Please enter a valid number for quantity.")

    def calculate_bill(self):
        if not self.order:
            print("No items in the order. Please take an order first.")
            return
        
        print("\nOrder Summary:")
        subtotal = 0
        for item, quantity in self.order.items():
            price = self.menu[item]
            item_total = price * quantity
            subtotal += item_total
            print(f"{item} x {quantity} = ${item_total:.2f}")
        
        # Calculate tax and service charge
        tax = subtotal * 0.05
        service_charge = subtotal * 0.10
        total = subtotal + tax + service_charge
        
        print(f"\nSubtotal: ${subtotal:.2f}")
        print(f"Tax (5%): ${tax:.2f}")
        print(f"Service Charge (10%): ${service_charge:.2f}")
        print(f"Total: ${total:.2f}")
        
        # Clear the order after calculating the bill
        self.order.clear()

    def run(self):
        while True:
            print("\nRestaurant System:")
            print("1. Manage Menu")
            print("2. Take Order")
            print("3. Calculate Bill")
            print("4. Exit")
            
            try:
                choice = int(input("Enter your choice: "))
                if choice == 1:
                    self.manage_menu()
                elif choice == 2:
                    self.take_order()
                elif choice == 3:
                    self.calculate_bill()
                elif choice == 4:
                    print("Exiting... Thank you!")
                    break
                else:
                    print("Invalid choice. Please try again.")
            except ValueError:
                print("Error: Please enter a valid number.")

if __name__ == "__main__":
    restaurant = Restaurant()
    restaurant.run()
