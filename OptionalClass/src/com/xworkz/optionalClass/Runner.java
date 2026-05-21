package com.xworkz.optionalClass;

import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        DNS dns=new DNS();
        Optional<String> ip=dns.getIpbyDomainName(Optional.of("facebook.com"));
        if(ip.isPresent()) {
            System.out.println(ip.get());
        }

        Optional<String> ip2=dns.getIpbyDomainName(Optional.of("sagar.com"));
        if(ip2.isPresent()) {
            System.out.println(ip.get());
        }

    }
}
