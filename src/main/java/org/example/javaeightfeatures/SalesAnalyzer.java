package org.example.javaeightfeatures;
import java.util.*;
import java.util.stream.*;

class Sale {
    int productId;
    int quantity;
    double price;

    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

class ProductSales {
    int productId;
    double totalRevenue;

    public ProductSales(int productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public double getTotalRevenue() { return totalRevenue; }
}

public class SalesAnalyzer {
    public static List<ProductSales> top5ProductsByRevenue(List<Sale> sales) {

        return sales.stream()

                .filter(s -> s.getQuantity() > 10)

                .map(s -> new ProductSales(
                        s.getProductId(),
                        s.getQuantity() * s.getPrice()
                ))


                .sorted(Comparator
                        .comparingDouble(ProductSales::getTotalRevenue)
                        .reversed())

                .limit(5)

                .collect(Collectors.toList());
    }

}
