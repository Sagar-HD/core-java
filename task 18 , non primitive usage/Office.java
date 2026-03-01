class Office {
    String location,size,staffCount,departments,facilities,equipment,workingHours,management,services,budget,
           design,technology,meetingRooms,internet,productivity,policies,culture,environment,security,maintenance;

    Office(String location,String size,String staffCount,String departments,String facilities,String equipment,String workingHours,String management,String services,String budget,
           String design,String technology,String meetingRooms,String internet,String productivity,String policies,String culture,String environment,String security,String maintenance){
        this.location=location; this.size=size; this.staffCount=staffCount; this.departments=departments; this.facilities=facilities;
        this.equipment=equipment; this.workingHours=workingHours; this.management=management;
        this.services=services; this.budget=budget; this.design=design; this.technology=technology;
        this.meetingRooms=meetingRooms; this.internet=internet; this.productivity=productivity;
        this.policies=policies; this.culture=culture; this.environment=environment;
        this.security=security; this.maintenance=maintenance;
    }
    void display(){
        System.out.println(location+" "+size+" "+staffCount+" "+departments+" "+facilities+" "+equipment+" "+workingHours+" "+management+" "+services+" "+budget+" "+design+" "+technology+" "+meetingRooms+" "+internet+" "+productivity+" "+policies+" "+culture+" "+environment+" "+security+" "+maintenance);
    }
}