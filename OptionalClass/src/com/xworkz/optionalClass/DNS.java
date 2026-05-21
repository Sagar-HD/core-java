package com.xworkz.optionalClass;

import java.util.Optional;

public class DNS {
   private DomainIpDto[] server=new DomainIpDto[4];

public DNS(){
    this.server[0]=new DomainIpDto("facebook.com","162.198.23.45");
    this.server[1]=new DomainIpDto("google.com","163.198.23.45");
    this.server[2]=new DomainIpDto("instagram.com","12.198.23.45");
    this.server[3]=new DomainIpDto("xworkz.com","127.0.0.0");

}
public Optional<String> getIpbyDomainName(Optional<String> domain){
    if(domain.isPresent()){
        if(this.server!=null){
            for(DomainIpDto item : server){
                if(domain.get().equalsIgnoreCase(item.getDomainName())){
                    return Optional.ofNullable(item.getIpAddress());
                }
            }
        }
    }
    return Optional.empty();
}


}
