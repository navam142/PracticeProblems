package staticfinal;

import java.util.*;

class Product {
    static double discount = 0.0;

    final int productID;

    String productName;
    double price;
    int quantity;

    private static int idCounter = 1000;

    Product(String productName, double price, int quantity) {
        this.productID = ++idCounter;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        if (newDiscount < 0 || newDiscount > 100) {
            System.out.println("Invalid discount! Must be between 0 and 100.");
            return;
        }
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    double getTotalPrice() {
        double total = price * quantity;
        double discountedAmount = total * (discount / 100);
        return total - discountedAmount;
    }

    void displayProduct() {
        System.out.println("Product ID   : " + productID);
        System.out.println("Name         : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Discount     : " + discount + "%");
        System.out.println("Final Amount : " + getTotalPrice());
        System.out.println("----------------------------------");
    }
}

public class ShoppingCartSystem {

    static void processProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            p.displayProduct();
        } else {
            System.out.println("Invalid object! Not a Product instance.");
        }
    }

    public static void main(String[] args) {

        Product.updateDiscount(10);

        Product p1 = new Product("Laptop", 60000, 1);
        Product p2 = new Product("Headphones", 2000, 2);

        processProductDetails(p1);
        processProductDetails(p2);

        String test = "Not a product";
        processProductDetails(test);
    }
}
