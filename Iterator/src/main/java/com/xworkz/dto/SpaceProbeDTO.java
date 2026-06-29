package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SpaceProbeDTO implements Serializable {

    private String probeId;
    private String missionName;
    private String targetCelestialBody;
    private String manufacturer;
    private double launchMass;
    private LocalDateTime launchDate;
    private LocalDateTime arrivalDate;
    private String propulsionType;
    private double powerOutput;
    private String communicationFrequency;
    private double distanceFromEarth;
    private double orbitalVelocity;
    private String primaryInstrument;
    private String secondaryInstrument;
    private int missionDurationDays;
    private boolean isActive;
    private String status;
    private double fuelRemaining;
    private String trajectoryPath;

    public SpaceProbeDTO() {
    }

    public SpaceProbeDTO(String probeId, String missionName, String targetCelestialBody, String manufacturer,
                         double launchMass, LocalDateTime launchDate, LocalDateTime arrivalDate,
                         String propulsionType, double powerOutput, String communicationFrequency,
                         double distanceFromEarth, double orbitalVelocity, String primaryInstrument,
                         String secondaryInstrument, int missionDurationDays, boolean isActive,
                         String status, double fuelRemaining, String trajectoryPath) {
        this.probeId = probeId;
        this.missionName = missionName;
        this.targetCelestialBody = targetCelestialBody;
        this.manufacturer = manufacturer;
        this.launchMass = launchMass;
        this.launchDate = launchDate;
        this.arrivalDate = arrivalDate;
        this.propulsionType = propulsionType;
        this.powerOutput = powerOutput;
        this.communicationFrequency = communicationFrequency;
        this.distanceFromEarth = distanceFromEarth;
        this.orbitalVelocity = orbitalVelocity;
        this.primaryInstrument = primaryInstrument;
        this.secondaryInstrument = secondaryInstrument;
        this.missionDurationDays = missionDurationDays;
        this.isActive = isActive;
        this.status = status;
        this.fuelRemaining = fuelRemaining;
        this.trajectoryPath = trajectoryPath;
    }

    public String getProbeId() {
        return probeId;
    }

    public void setProbeId(String probeId) {
        this.probeId = probeId;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getTargetCelestialBody() {
        return targetCelestialBody;
    }

    public void setTargetCelestialBody(String targetCelestialBody) {
        this.targetCelestialBody = targetCelestialBody;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getLaunchMass() {
        return launchMass;
    }

    public void setLaunchMass(double launchMass) {
        this.launchMass = launchMass;
    }

    public LocalDateTime getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDateTime launchDate) {
        this.launchDate = launchDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getPropulsionType() {
        return propulsionType;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public double getPowerOutput() {
        return powerOutput;
    }

    public void setPowerOutput(double powerOutput) {
        this.powerOutput = powerOutput;
    }

    public String getCommunicationFrequency() {
        return communicationFrequency;
    }

    public void setCommunicationFrequency(String communicationFrequency) {
        this.communicationFrequency = communicationFrequency;
    }

    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public void setDistanceFromEarth(double distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    public double getOrbitalVelocity() {
        return orbitalVelocity;
    }

    public void setOrbitalVelocity(double orbitalVelocity) {
        this.orbitalVelocity = orbitalVelocity;
    }

    public String getPrimaryInstrument() {
        return primaryInstrument;
    }

    public void setPrimaryInstrument(String primaryInstrument) {
        this.primaryInstrument = primaryInstrument;
    }

    public String getSecondaryInstrument() {
        return secondaryInstrument;
    }

    public void setSecondaryInstrument(String secondaryInstrument) {
        this.secondaryInstrument = secondaryInstrument;
    }

    public int getMissionDurationDays() {
        return missionDurationDays;
    }

    public void setMissionDurationDays(int missionDurationDays) {
        this.missionDurationDays = missionDurationDays;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getFuelRemaining() {
        return fuelRemaining;
    }

    public void setFuelRemaining(double fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
    }

    public String getTrajectoryPath() {
        return trajectoryPath;
    }

    public void setTrajectoryPath(String trajectoryPath) {
        this.trajectoryPath = trajectoryPath;
    }

    @Override
    public String toString() {
        return "SpaceProbeDTO{" +
                "probeId='" + probeId + '\'' +
                ", missionName='" + missionName + '\'' +
                ", targetCelestialBody='" + targetCelestialBody + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", launchMass=" + launchMass +
                ", launchDate=" + launchDate +
                ", arrivalDate=" + arrivalDate +
                ", propulsionType='" + propulsionType + '\'' +
                ", powerOutput=" + powerOutput +
                ", communicationFrequency='" + communicationFrequency + '\'' +
                ", distanceFromEarth=" + distanceFromEarth +
                ", orbitalVelocity=" + orbitalVelocity +
                ", primaryInstrument='" + primaryInstrument + '\'' +
                ", secondaryInstrument='" + secondaryInstrument + '\'' +
                ", missionDurationDays=" + missionDurationDays +
                ", isActive=" + isActive +
                ", status='" + status + '\'' +
                ", fuelRemaining=" + fuelRemaining +
                ", trajectoryPath='" + trajectoryPath + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpaceProbeDTO that = (SpaceProbeDTO) o;

        if (Double.compare(that.launchMass, launchMass) != 0) return false;
        if (Double.compare(that.powerOutput, powerOutput) != 0) return false;
        if (Double.compare(that.distanceFromEarth, distanceFromEarth) != 0) return false;
        if (Double.compare(that.orbitalVelocity, orbitalVelocity) != 0) return false;
        if (missionDurationDays != that.missionDurationDays) return false;
        if (isActive != that.isActive) return false;
        if (Double.compare(that.fuelRemaining, fuelRemaining) != 0) return false;
        if (probeId != null ? !probeId.equals(that.probeId) : that.probeId != null) return false;
        if (missionName != null ? !missionName.equals(that.missionName) : that.missionName != null) return false;
        if (targetCelestialBody != null ? !targetCelestialBody.equals(that.targetCelestialBody) : that.targetCelestialBody != null)
            return false;
        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null) return false;
        if (launchDate != null ? !launchDate.equals(that.launchDate) : that.launchDate != null) return false;
        if (arrivalDate != null ? !arrivalDate.equals(that.arrivalDate) : that.arrivalDate != null) return false;
        if (propulsionType != null ? !propulsionType.equals(that.propulsionType) : that.propulsionType != null)
            return false;
        if (communicationFrequency != null ? !communicationFrequency.equals(that.communicationFrequency) : that.communicationFrequency != null)
            return false;
        if (primaryInstrument != null ? !primaryInstrument.equals(that.primaryInstrument) : that.primaryInstrument != null)
            return false;
        if (secondaryInstrument != null ? !secondaryInstrument.equals(that.secondaryInstrument) : that.secondaryInstrument != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return trajectoryPath != null ? trajectoryPath.equals(that.trajectoryPath) : that.trajectoryPath == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = probeId != null ? probeId.hashCode() : 0;
        result = 31 * result + (missionName != null ? missionName.hashCode() : 0);
        result = 31 * result + (targetCelestialBody != null ? targetCelestialBody.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        temp = Double.doubleToLongBits(launchMass);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (launchDate != null ? launchDate.hashCode() : 0);
        result = 31 * result + (arrivalDate != null ? arrivalDate.hashCode() : 0);
        result = 31 * result + (propulsionType != null ? propulsionType.hashCode() : 0);
        temp = Double.doubleToLongBits(powerOutput);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (communicationFrequency != null ? communicationFrequency.hashCode() : 0);
        temp = Double.doubleToLongBits(distanceFromEarth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(orbitalVelocity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (primaryInstrument != null ? primaryInstrument.hashCode() : 0);
        result = 31 * result + (secondaryInstrument != null ? secondaryInstrument.hashCode() : 0);
        result = 31 * result + missionDurationDays;
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        temp = Double.doubleToLongBits(fuelRemaining);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (trajectoryPath != null ? trajectoryPath.hashCode() : 0);
        return result;
    }
}
