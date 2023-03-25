package Lab1.Activity7;

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
