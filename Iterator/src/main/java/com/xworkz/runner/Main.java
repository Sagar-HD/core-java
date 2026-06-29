package com.xworkz.runner;

import com.xworkz.SpaceProbeCreator;
import com.xworkz.dto.SpaceProbeDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;


public class Main {


    static List<SpaceProbeDTO> spaceProbes;

    static int getSuccessCount() {
       int count=0;
       for(SpaceProbeDTO sp:spaceProbes){
           if(sp!=null){
               if(sp.getStatus().equals("Completed")){
                   count++;
               }
           }
       }
       return count;
    }
    static int getSolarElectricCount() {
        int count=0;
        for(SpaceProbeDTO sp:spaceProbes){
            if(sp!=null){
                if(sp.getPropulsionType().equals("Solar Electric")){
                    count++;
                }
            }
        }
        return count;
    }
    static int removeFailedProbes(){
        int removedCount=0;
        Iterator<SpaceProbeDTO> itr=spaceProbes.iterator();
        while(itr.hasNext()){
            SpaceProbeDTO sp=itr.next();
            if(sp!=null && sp.getStatus().equals("Failed")){
                itr.remove();
                removedCount++;

            }
        }
        return removedCount;
    }
    static int removeLowFuelProbes(){
        int removedCount=0;
        Iterator<SpaceProbeDTO> itr=spaceProbes.iterator();
        while(itr.hasNext()){
            SpaceProbeDTO sp=itr.next();
            if(sp!=null && sp.getFuelRemaining()<=10){
                itr.remove();
                removedCount++;

            }
        }
        return removedCount;
    }
    static int getActiveAndSuccessProbesCount(){
        int count=0;
        for(SpaceProbeDTO sp:spaceProbes){
            if(sp!=null){
                if(sp.getStatus().equals("Completed")&&sp.isActive()){
                    count++;
                }
            }
        }
        return count;
    }
    static boolean isThereAEllipticalPathProbe(){

        for(SpaceProbeDTO sp:spaceProbes){
            if(sp!=null){
                if(sp.getTrajectoryPath().equals("Elliptical")){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean allProbeHaveValidCommunication(){
        for(SpaceProbeDTO sp:spaceProbes){
            if(sp!=null){
                //x-band means not valid just assumption for this question
                if(sp.getCommunicationFrequency().equals("X-Band")){
                    return false;
                }
            }
        }
        return true;
    }

    static  int getProbesCountActiveForMoreThan2Years(){
        int count=0;
        for(SpaceProbeDTO sp:spaceProbes){
            if(sp!=null){

                if(sp.getLaunchDate().plusYears(2).isBefore(LocalDateTime.now())){
                  count++;
                }
            }
        }
        return count;
    }
    static int removeProbesOfExcededDuration(){
        int removedCount=0;
        Iterator<SpaceProbeDTO> itr=spaceProbes.iterator();
        while(itr.hasNext()){
            SpaceProbeDTO sp=itr.next();
            if(sp.getLaunchDate().plusDays(sp.getMissionDurationDays()).isAfter(LocalDateTime.now())){
                itr.remove();
                removedCount++;
            }
        }
        return removedCount;
    }
    static int countOfActiveProbesWithCamera(){
        int count=0;
        for(SpaceProbeDTO sp:spaceProbes){
            if(sp!=null){

                if(sp.isActive()&&sp.getPrimaryInstrument().contains("Camera")||sp.getSecondaryInstrument().contains("Camera")){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        spaceProbes= SpaceProbeCreator.createSpaceProbes(500);
        //read methods
                 //success count
                  System.out.println(getSuccessCount());
                  //solar electric count
                  System.out.println(getSolarElectricCount());

        //Removal Questions
                   //remove falied
                   System.out.println(removeFailedProbes()+" probes removed");
                   //remove probes fuel less than 10
                   System.out.println(removeLowFuelProbes()+" probes removed");
        //Multiple Property Conditions
                    //probe count which are sucess and is active
                   System.out.println(getActiveAndSuccessProbesCount());
        //Conditional Check Questions
                  //Check if there's a probe with trajectoryPath "Elliptical"
                 System.out.println(isThereAEllipticalPathProbe());
                 //Check if all active probes have valid communicationFrequency
                 System.out.println(allProbeHaveValidCommunication());
        //Complex Iterator Operations
                      //Count probes that have been active for more than 2 years (based on launchDate)
                      System.out.println(getProbesCountActiveForMoreThan2Years());
                      //Remove probes that have exceeded their missionDurationDays
                      System.out.println(removeProbesOfExcededDuration()+" probes removed");

                      //Count probes where (primaryInstrument contains "Camera" OR secondaryInstrument contains "Camera") AND status = "Success"
                      System.out.println(countOfActiveProbesWithCamera());

    }
}
