package com.xworkz.filter.disease.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<DiseaseDTO> diseases = new ArrayList<>();

        diseases.add(new DiseaseDTO("Bacteria", "Antibiotics", "Infection of lungs", "Infectious", 1, "Tuberculosis", "Vaccination", "Cough, fever, weight loss", "Antibiotic therapy"));
        diseases.add(new DiseaseDTO("Virus", "No cure", "Attacks immune system", "Infectious", 2, "AIDS", "Safe practices", "Fever, fatigue, swollen lymph nodes", "Antiretroviral therapy"));
        diseases.add(new DiseaseDTO("Genetic", "No cure", "Progressive muscle weakness", "Genetic", 3, "Duchenne Muscular Dystrophy", "Genetic counseling", "Muscle weakness, difficulty walking", "Physical therapy"));
        diseases.add(new DiseaseDTO("Virus", "Vaccine", "Acute viral illness", "Infectious", 4, "Measles", "Vaccination", "Fever, rash, cough", "Supportive care"));
        diseases.add(new DiseaseDTO("Bacteria", "Antibiotics", "Throat infection", "Infectious", 5, "Strep Throat", "Hygiene", "Sore throat, fever", "Penicillin"));
        diseases.add(new DiseaseDTO("Autoimmune", "No cure", "Immune system attacks joints", "Autoimmune", 6, "Rheumatoid Arthritis", "Exercise", "Joint pain, stiffness", "Anti-inflammatory drugs"));
        diseases.add(new DiseaseDTO("Virus", "No cure", "Liver inflammation", "Infectious", 7, "Hepatitis B", "Vaccination", "Jaundice, fatigue", "Antiviral drugs"));
        diseases.add(new DiseaseDTO("Parasite", "Antiparasitic", "Mosquito-borne illness", "Infectious", 8, "Malaria", "Mosquito control", "Fever, chills, headache", "Antimalarial drugs"));
        diseases.add(new DiseaseDTO("Genetic", "No cure", "Red blood cell disorder", "Genetic", 9, "Sickle Cell Anemia", "Genetic counseling", "Pain, fatigue, infections", "Blood transfusions"));
        diseases.add(new DiseaseDTO("Virus", "Vaccine", "Childhood viral disease", "Infectious", 10, "Chickenpox", "Vaccination", "Itchy rash, fever", "Antihistamines"));
        diseases.add(new DiseaseDTO("Bacteria", "Antibiotics", "Severe lung infection", "Infectious", 11, "Pneumonia", "Vaccination", "Cough, fever, difficulty breathing", "Antibiotics"));
        diseases.add(new DiseaseDTO("Fungus", "Antifungal", "Lung infection", "Infectious", 12, "Histoplasmosis", "Avoid exposure", "Fever, cough, fatigue", "Antifungal medication"));
        diseases.add(new DiseaseDTO("Virus", "No cure", "Neurodegenerative disease", "Infectious", 13, "Polio", "Vaccination", "Muscle weakness, paralysis", "Supportive care"));
        diseases.add(new DiseaseDTO("Environmental", "Avoid exposure", "Lung disease from dust", "Environmental", 14, "Silicosis", "Protective equipment", "Shortness of breath, cough", "No specific treatment"));
        diseases.add(new DiseaseDTO("Virus", "No cure", "Viral hemorrhagic fever", "Infectious", 15, "Ebola", "Isolation", "Fever, bleeding, organ failure", "Supportive care"));
        diseases.add(new DiseaseDTO("Bacteria", "Antibiotics", "Intestinal infection", "Infectious", 16, "Cholera", "Clean water", "Diarrhea, dehydration", "Rehydration, antibiotics"));
        diseases.add(new DiseaseDTO("Genetic", "No cure", "Cystic fibrosis in lungs", "Genetic", 17, "Cystic Fibrosis", "Genetic counseling", "Cough, lung infections", "Chest physiotherapy"));
        diseases.add(new DiseaseDTO("Virus", "Vaccine", "Viral encephalitis", "Infectious", 18, "Japanese Encephalitis", "Vaccination", "Headache, fever, seizures", "Supportive care"));
        diseases.add(new DiseaseDTO("Bacteria", "Antibiotics", "Skin infection", "Infectious", 19, "Leprosy", "Early treatment", "Skin lesions, nerve damage", "Multidrug therapy"));
        diseases.add(new DiseaseDTO("Autoimmune", "No cure", "Blood sugar regulation", "Autoimmune", 20, "Type 1 Diabetes", "Healthy diet", "Increased thirst, urination", "Insulin therapy"));
        diseases.add(new DiseaseDTO("Virus", "No cure", "Liver inflammation", "Infectious", 21, "Hepatitis C", "Avoid sharing needles", "Jaundice, fatigue", "Antiviral drugs"));
        diseases.add(new DiseaseDTO("Parasite", "Antiparasitic", "Intestinal worm infection", "Infectious", 22, "Ascariasis", "Sanitation", "Abdominal pain, malnutrition", "Anthelmintic drugs"));
        diseases.add(new DiseaseDTO("Genetic", "No cure", "Neurological disorder", "Genetic", 23, "Huntington Disease", "Genetic counseling", "Movement disorders, dementia", "Supportive care"));
        diseases.add(new DiseaseDTO("Bacteria", "Antibiotics", "Blood infection", "Infectious", 24, "Sepsis", "Infection control", "Fever, low blood pressure", "Antibiotics, fluids"));
        diseases.add(new DiseaseDTO("Virus", "Vaccine", "Acute respiratory illness", "Infectious", 25, "Influenza", "Vaccination", "Fever, body aches, cough", "Antiviral drugs"));
        diseases.add(new DiseaseDTO("Environmental", "Avoid smoking", "Lung disease", "Environmental", 26, "COPD", "Quit smoking", "Shortness of breath, chronic cough", "Bronchodilators"));
        diseases.add(new DiseaseDTO("Virus", "No cure", "Viral fever", "Infectious", 27, "Dengue", "Mosquito control", "High fever, joint pain", "Supportive care"));
        diseases.add(new DiseaseDTO("Bacteria", "Antibiotics", "Kidney infection", "Infectious", 28, "Pyelonephritis", "Hydration", "Fever, back pain", "Antibiotics"));
        diseases.add(new DiseaseDTO("Genetic", "No cure", "Metabolic disorder", "Genetic", 29, "Phenylketonuria", "Dietary restriction", "Developmental delay", "Special diet"));
        diseases.add(new DiseaseDTO("Virus", "Vaccine", "Childhood viral disease", "Infectious", 30, "Mumps", "Vaccination", "Swollen salivary glands", "Supportive care"));
        diseases.add(new DiseaseDTO("Bacteria", "Antibiotics", "Stomach ulcers", "Infectious", 31, "H. Pylori Infection", "Hygiene", "Stomach pain, nausea", "Antibiotics"));
        diseases.add(new DiseaseDTO("Autoimmune", "No cure", "Thyroid inflammation", "Autoimmune", 32, "Hashimoto Thyroiditis", "Regular checkups", "Fatigue, weight gain", "Hormone replacement"));

        //Filter by length: Filter names longer than 5 characters
        diseases.stream().filter((d) -> (d.getName().length() > 5)).forEach((d) -> System.out.println(d));
        //Filter by condition: Filter diseases starting with specific letter
        diseases.stream().filter((d) -> (d.getName().startsWith("C"))).forEach((d) -> System.out.println(d));


        //Map to uppercase: Convert all names to uppercase
        diseases.stream().map((d) -> d.getName()).map(String::toUpperCase).forEach((d) -> System.out.println(d));
        // Map to lowercase: Convert all names to lowercase
        diseases.stream().map((d) -> d.getName()).map(String::toLowerCase).forEach((d) -> System.out.println(d));
        //Map to length: Get length of each string
        diseases.stream().map((d) -> d.getName()).map(String::length).forEach((d) -> System.out.println(d));


//Filter and map: Filter numbers > 10, then double them
        diseases.stream().filter((d) -> (d.getId() > 10)).map((d) -> d.getId() * 2).forEach((d) -> System.out.println(d));

        diseases.stream().map((d) -> d.getName()).map((d) -> new DiseaseNameDto(d)).forEach((d) -> System.out.println(d));

        diseases.stream().filter((d) -> d != null).forEach(System.out::println);

        diseases.stream().map((d) -> d.getName().length() > 5).forEach(System.out::println);


        diseases.stream().sorted((d1, d2) -> d1.getName().compareTo(d2.getName())).forEach(System.out::println);

        diseases.stream().sorted((d1, d2) -> d2.getName().compareTo(d1.getName())).forEach(System.out::println);

        diseases.stream().sorted((d1, d2) -> {
            int cmp = d1.getName().compareTo(d2.getName());
            if (cmp != 0) return cmp;
            return Integer.compare(d1.getId(), d2.getId());
        }).forEach(System.out::println);

        diseases.stream().filter((d)->d.getId()>10).sorted().forEach(System.out::println);


    diseases.stream().sorted((d1,d2)->d1.getName().compareToIgnoreCase(d2.getName())).forEach(System.out::println);

    diseases.stream().map((d)->d.getId()).reduce(0,(num,num2)->num+num2);
       int max= diseases.stream().map((d)->d.getId()).reduce(Integer.MIN_VALUE,(num,num2)->Math.max(num,num2));

        System.out.println(max);

        List<DiseaseDTO> list=diseases.stream().filter((d)->d.getId()%2==0).collect(Collectors.toList());

        Set<DiseaseDTO> set= list.stream().collect(Collectors.toSet());


        String ans=diseases.stream().map((d)->d.getName()).collect(Collectors.joining(","));
        System.out.println(ans);
         ans=diseases.stream().map((d)->d.getName()).collect(Collectors.joining(",","{","}"));
        System.out.println(ans);

        System.out.println("==============================");
        //group to based on any field
        Map<String,List<DiseaseDTO>> map=diseases.stream().collect(Collectors.groupingBy((d)->d.getCure(),Collectors.toList()));
        System.out.println(map);
        //group or parition to 2 gorup true and false
        Map<Boolean,List<DiseaseDTO>> map2=diseases.stream().collect(Collectors.partitioningBy((d)->d.getId()%2==0));

        System.out.println("----------------");
        System.out.println(map2);

        System.out.println("----------------");
        Map<Boolean,Long> evenOddCount=diseases.stream().collect(Collectors.groupingBy((d)->d.getId()%2==0,Collectors.counting()));
        System.out.println(evenOddCount);


    }




}
