class Toxic {
    String chemicalName,source,effect,level,exposureType,symptoms,antidote,safetyMeasures,storage,handling,
           category,usage,riskLevel,origin,detectionMethod,duration,contamination,treatment,regulations,warningLabel;

    Toxic(String chemicalName,String source,String effect,String level,String exposureType,String symptoms,String antidote,String safetyMeasures,String storage,String handling,
          String category,String usage,String riskLevel,String origin,String detectionMethod,String duration,String contamination,String treatment,String regulations,String warningLabel){
        this.chemicalName=chemicalName; this.source=source; this.effect=effect; this.level=level; this.exposureType=exposureType;
        this.symptoms=symptoms; this.antidote=antidote; this.safetyMeasures=safetyMeasures; this.storage=storage; this.handling=handling;
        this.category=category; this.usage=usage; this.riskLevel=riskLevel; this.origin=origin;
        this.detectionMethod=detectionMethod; this.duration=duration; this.contamination=contamination;
        this.treatment=treatment; this.regulations=regulations; this.warningLabel=warningLabel;
    }
    void display(){
        System.out.println(chemicalName+" "+source+" "+effect+" "+level+" "+exposureType+" "+symptoms+" "+antidote+" "+safetyMeasures+" "+storage+" "+handling+" "+category+" "+usage+" "+riskLevel+" "+origin+" "+detectionMethod+" "+duration+" "+contamination+" "+treatment+" "+regulations+" "+warningLabel);
    }
}