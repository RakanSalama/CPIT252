package Lab1.Activity4;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
            Product[] products = new Product[2];
            products[0]= new FoodProduct(3452, 10.0, "Cheddar Cheese", LocalDate.parse("2022-06-07"));
            products[1]= new ElectricProduct(4875, 30.0, "Extension cord", "220v");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
