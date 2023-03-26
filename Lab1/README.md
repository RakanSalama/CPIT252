# CPIT252 LAB1 
## 1. Instance and class variables
We can fix this code by changing the quantity into static.

    private static int quantity; 
######  output: 
![image](https://user-images.githubusercontent.com/98660298/227774224-e59f286b-a9fd-488a-ab7d-c4a4f2279e3d.png)

## 2. Testing
![image](https://user-images.githubusercontent.com/98660298/227773575-1e6bcc32-551b-4316-accc-23e8e3c992a9.png)

## 3. Inhertiance
The Product class should be abstract to prevent it from being instantiated directly.

    public abstract class Product {
    .........
     }

## 4-Polymorphism “Many Forms”

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
######  output :
![image](https://user-images.githubusercontent.com/98660298/227774171-1951c60b-9dd3-469b-a5eb-cea100d34383.png)
## 5. Controlling Changes
To prevent subclasses from overriding the addToShoppingCart() method of the Product class without changing its visibility, the method can be declared as final. This will prevent any subclasses from overriding the method, while still allowing the method to be visible and accessible.

    public final void addToShoppingCart() {
        System.out.println(this.name + " has been added to the shopping cart.");
    }
## 6. Abstraction
The Product class should be responsible for managing the product information, but not the order information. To fix this, the order information should be moved to a separate class. This class should be responsible for managing the order information, while the Product class should be responsible for managing the product information.

    public class Order {
        private int orderId;
        private String orderStatus;
    
    public Order(int orderId, String orderStatus) {
        this.orderId = orderId;
        this.orderStatus = "created";
    }
    public void setOrderStatus(String newStatus) {
        this.orderStatus = newStatus;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getOrderId() {
        return this.orderId;
       }
    }
## 7. Encapsulation
The weight data is exposed to changes outside the Product class when it is made public. The weight data should be made private and accessible through a public getter/setter method to fix this.

    public class Product {

      private double weight;

        public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
       }
    }
