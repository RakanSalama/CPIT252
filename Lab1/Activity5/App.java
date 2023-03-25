package Lab1.Activity5;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Product[] products = {
                new Product(1234, 9.99, "water"),
                new FoodProduct(3452, 10.0, "Cheddar Cheese", LocalDate.parse("2022-06-07")),
                new ElectricProduct(4875, 30.0, "Extension cord", "220v")
        };
        for (Product p : products) {
            System.out.println(p);
            if (p instanceof ElectricProduct) {
                ElectricProduct ep = (ElectricProduct) p;
                ep.addToShoppingCart();
            }
        }
    }
}


