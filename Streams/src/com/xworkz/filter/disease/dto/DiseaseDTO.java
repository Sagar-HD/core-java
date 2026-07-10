package com.xworkz.filter.disease.dto;

import java.io.Serializable;

public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {

    private int id;
    private String name;
    private String description;
    private String symptoms;
    private String cause;
    private String treatment;
    private String cure;
    private String prevention;
    private String etiology;

    @Override
    public int compareTo(DiseaseDTO o) {
        return Integer.compare(this.id,o.id);
    }

    public DiseaseDTO(String cause, String cure, String description, String etiology, int id, String name, String prevention, String symptoms, String treatment) {
        this.cause = cause;
        this.cure = cure;
        this.description = description;
        this.etiology = etiology;
        this.id = id;
        this.name = name;
        this.prevention = prevention;
        this.symptoms = symptoms;
        this.treatment = treatment;
    }

    public String getCause() {
        return cause;
    }

    public String getCure() {
        return cure;
    }

    public String getDescription() {
        return description;
    }

    public String getEtiology() {
        return etiology;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrevention() {
        return prevention;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public String getTreatment() {
        return treatment;
    }

    @Override
    public String toString() {
        return "DiseaseDTO{" +
                "cause='" + cause + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", treatment='" + treatment + '\'' +
                ", cure='" + cure + '\'' +
                ", prevention='" + prevention + '\'' +
                ", etiology='" + etiology + '\'' +
                '}';
    }
}