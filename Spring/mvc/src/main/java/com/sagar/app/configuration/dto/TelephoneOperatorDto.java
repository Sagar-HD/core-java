package com.sagar.app.configuration.dto;

import lombok.Data;

@Data
public class TelephoneOperatorDto {
    private String operatorName;
    private String countryCode;
    private String networkType;
    private String customerCare;
    private String plans;
    private String coverage;

}
