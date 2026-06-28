package CollectionInterface;

public class SupplierDTO {
    private int supplierId;
    private String name;
    private String address;
    private String contactPerson;
    private String phone;

    public SupplierDTO() {
    }

    public SupplierDTO(int supplierId, String name, String address, String contactPerson, String phone) {
        this.supplierId = supplierId;
        this.name = name;
        this.address = address;
        this.contactPerson = contactPerson;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SupplierDTO{" +
                "supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

