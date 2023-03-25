package Lab1;

public class Order {
    private int orderId;
    private String orderStatus;
    
    public Order(int orderId, String orderStatus){
      this.orderId = orderId;
      this.orderStatus = "created";
    }
    
    public void changeOrderStatus(String newStatus){
        this.orderStatus = newStatus;
    }
    
    public String getOrderStatus(){
      return this.orderStatus;
    }
    
  }