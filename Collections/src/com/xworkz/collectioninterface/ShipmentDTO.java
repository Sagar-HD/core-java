package src.com.xworkz.collectioninterface;

import java.time.LocalDate;

public class ShipmentDTO {
    private int shipmentId;
    private int orderId;
    private String carrier;
    private String trackingNumber;
    private LocalDate deliveryDate;

    public ShipmentDTO() {
    }

    public ShipmentDTO(int shipmentId, int orderId, String carrier, String trackingNumber, LocalDate deliveryDate) {
        this.shipmentId = shipmentId;
        this.orderId = orderId;
        this.carrier = carrier;
        this.trackingNumber = trackingNumber;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "ShipmentDTO{" +
                "shipmentId=" + shipmentId +
                ", orderId=" + orderId +
                ", carrier='" + carrier + '\'' +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}

