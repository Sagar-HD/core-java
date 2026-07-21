package com.xworkz.collectioninterface;

import java.time.LocalDate;

public class DiscountDTO {
    private int discountId;
    private String code;
    private String description;
    private double percentage;
    private LocalDate expiryDate;

    public DiscountDTO() {
    }

    public DiscountDTO(int discountId, String code, String description, double percentage, LocalDate expiryDate) {
        this.discountId = discountId;
        this.code = code;
        this.description = description;
        this.percentage = percentage;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "DiscountDTO{" +
                "discountId=" + discountId +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", percentage=" + percentage +
                ", expiryDate=" + expiryDate +
                '}';
    }
}

