package CollectionInterface;

import java.time.LocalDate;

public class OrderDTO {
    private int orderId;
    private int customerId;
    private LocalDate orderDate;
    private String status;
    private double totalAmount;

    public OrderDTO() {
    }

    public OrderDTO(int orderId, int customerId, LocalDate orderDate, String status, double totalAmount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmount = totalAmount;
    }

   
}

