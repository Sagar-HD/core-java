package CollectionInterface;

import java.time.LocalDate;

public class InvoiceDTO {
    private int invoiceId;
    private int orderId;
    private double amount;
    private LocalDate dueDate;
    private String paymentStatus;

    public InvoiceDTO() {
    }

    public InvoiceDTO(int invoiceId, int orderId, double amount, LocalDate dueDate, String paymentStatus) {
        this.invoiceId = invoiceId;
        this.orderId = orderId;
        this.amount = amount;
        this.dueDate = dueDate;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "InvoiceDTO{" +
                "invoiceId=" + invoiceId +
                ", orderId=" + orderId +
                ", amount=" + amount +
                ", dueDate=" + dueDate +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}

