package com.xworkz.dto;

public class Version implements Comparable<Version>{
    private int majorNumber;
    private int minorNumber;
    private int patchNumber;

    public Version(int minorNumber, int majorNumber, int patchNumber) {
        this.minorNumber = minorNumber;
        this.majorNumber = majorNumber;
        this.patchNumber = patchNumber;
    }

    public int getMajorNumber() {
        return majorNumber;
    }

    public int getMinorNumber() {
        return minorNumber;
    }

    public int getPatchNumber() {
        return patchNumber;
    }

    @Override
    public String toString() {
        return "Version{" +
                "majorNumber=" + majorNumber +
                ", minorNumber=" + minorNumber +
                ", patchNumber=" + patchNumber +
                '}';
    }

    @Override
    public int compareTo(Version o) {
        int cmp=Integer.compare(this.getMajorNumber(),o.getMajorNumber());
        if(cmp!=0){
            return cmp;
        }
        cmp=Integer.compare(this.getMinorNumber(),o.getMinorNumber());
        if(cmp!=0){
            return cmp;
        }
        return Integer.compare(this.getPatchNumber(),o.getPatchNumber());
    }
}
