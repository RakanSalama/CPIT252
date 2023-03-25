package Lab1.Activity7;

public class Product {
    private int id;
    private double price;
    private String name;
    private double weight;
    private int orderId;
    private String orderStatus;
    private static int quantity;

    public Product(int id, double price, String name, int orderId, String orderStatus) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.orderId = orderId;
        this.orderStatus = "created";
        this.quantity++;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void applySaleDiscount(double percentage) {
        this.price = this.price - ((percentage / 100) * this.price);
    }

    public final void addToShoppingCart() {
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public static int getTotalQuantity() {
        return Product.quantity;
    }

    public void getSellableStatus() {
        System.out.println("This product is sellable");
    }

    public String toString() {
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name + "\tPrice: SR" + this.price;
    }
}