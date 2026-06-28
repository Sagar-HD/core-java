package CollectionInterface;

public class InventoryDTO {
    private int itemId;
    private String productName;
    private int quantity;
    private String location;
    private String supplier;

    public InventoryDTO() {
    }

    public InventoryDTO(int itemId, String productName, int quantity, String location, String supplier) {
        this.itemId = itemId;
        this.productName = productName;
        this.quantity = quantity;
        this.location = location;
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "InventoryDTO{" +
                "itemId=" + itemId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", location='" + location + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}

