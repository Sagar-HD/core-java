package com.xworkz.optionalClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
@Getter
public class DomainIpDto implements Serializable {
    private String domainName;
    private String ipAddress;
}
