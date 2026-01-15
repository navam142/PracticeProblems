package classesandobjects.level2;

public class CartItem {
    String itemName;
    Integer price, quantity;

    CartItem(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class Cart {
    CartItem[] items;
    Integer itemCount = 0;
    Integer capacity;

    Cart(Integer capacity) {
        this.capacity = capacity;
        this.items = new CartItem[capacity];
    }

    public void addItem(CartItem item) {
        if (itemCount < capacity) {
            items[itemCount++] = item;
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public void displayCartItems() {
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Items in the cart:");
        for (int i = 0; i < itemCount; i++) {
            CartItem item = items[i];
            System.out.println("Item: " + item.itemName + ", Price: " + item.price + ", Quantity: " + item.quantity);
        }
    }

    public Integer calculateTotalPrice() {
        Integer totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].price * items[i].quantity;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        Cart myCart = new Cart(5);

        CartItem item1 = new CartItem("Laptop", 1200, 1);
        CartItem item2 = new CartItem("Mouse", 25, 2);
        CartItem item3 = new CartItem("Keyboard", 75, 1);

        myCart.addItem(item1);
        myCart.addItem(item2);
        myCart.addItem(item3);

        myCart.displayCartItems();
        System.out.println("Total price of items in cart: $" + myCart.calculateTotalPrice());

        CartItem item4 = new CartItem("Monitor", 300, 1);
        CartItem item5 = new CartItem("Webcam", 50, 1);
        CartItem item6 = new CartItem("Headphones", 100, 1);

        myCart.addItem(item4);
        myCart.addItem(item5);
        myCart.addItem(item6);
        myCart.displayCartItems();
    }
}