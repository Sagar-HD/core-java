class Diabetes {
    String type,cause,symptoms,treatment,medication,insulinLevel,sugarLevel,diagnosis,prevention,diet,
           exercise,riskFactor,ageGroup,monitoring,complications,duration,hereditary,management,lifestyle,awareness;

    Diabetes(String type,String cause,String symptoms,String treatment,String medication,String insulinLevel,String sugarLevel,String diagnosis,String prevention,String diet,
             String exercise,String riskFactor,String ageGroup,String monitoring,String complications,String duration,String hereditary,String management,String lifestyle,String awareness){
        this.type=type; this.cause=cause; this.symptoms=symptoms; this.treatment=treatment; this.medication=medication;
        this.insulinLevel=insulinLevel; this.sugarLevel=sugarLevel; this.diagnosis=diagnosis; this.prevention=prevention;
        this.diet=diet; this.exercise=exercise; this.riskFactor=riskFactor; this.ageGroup=ageGroup;
        this.monitoring=monitoring; this.complications=complications; this.duration=duration;
        this.hereditary=hereditary; this.management=management; this.lifestyle=lifestyle; this.awareness=awareness;
    }
    void display(){
        System.out.println(type+" "+cause+" "+symptoms+" "+treatment+" "+medication+" "+insulinLevel+" "+sugarLevel+" "+diagnosis+" "+prevention+" "+diet+" "+exercise+" "+riskFactor+" "+ageGroup+" "+monitoring+" "+complications+" "+duration+" "+hereditary+" "+management+" "+lifestyle+" "+awareness);
    }
}