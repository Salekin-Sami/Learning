class Product:
    def __init__(self,name,price):
        self.name = name
        self.price = price
    def display_info(self):
        print(f'Product name: {self.name}\nProduct price: {self.price}')
class Cart:
    def __init__(self):
        self.bag = []
    def add_product(self,item):
        self.bag.append(item)
    def remove_product(self,item):
        for x in self.bag:
            if x.name == item:
                self.bag.remove(item)
                print("The item has been removed")
                return
        print("item not found")
    def view_cart(self):
        for item in self.bag:
            item.display_info()
    def calculate_total(self):
        sum = 0
        for x in self.bag:
            sum += x.price
        print(f"Sum is {self.sum}")    
item1 = Product("A", 10)
item2 = Product("B",20)
item3 = Product("C",30)

cart1 = Cart()
cart1.add_product(item1)
cart1.add_product(item2)
cart1.add_product(item3)


cart1.view_cart()
cart1.calculate_total()
cart1.remove_product("C")
