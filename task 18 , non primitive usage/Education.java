class Education {
    String level,subject,institution,duration,syllabus,teachers,students,curriculum,exams,grades,
           skills,knowledge,training,development,assessment,resources,facilities,policies,outcomes,certification;

    Education(String level,String subject,String institution,String duration,String syllabus,String teachers,String students,String curriculum,String exams,String grades,
              String skills,String knowledge,String training,String development,String assessment,String resources,String facilities,String policies,String outcomes,String certification){
        this.level=level; this.subject=subject; this.institution=institution; this.duration=duration;
        this.syllabus=syllabus; this.teachers=teachers; this.students=students;
        this.curriculum=curriculum; this.exams=exams; this.grades=grades;
        this.skills=skills; this.knowledge=knowledge; this.training=training;
        this.development=development; this.assessment=assessment;
        this.resources=resources; this.facilities=facilities;
        this.policies=policies; this.outcomes=outcomes; this.certification=certification;
    }
    void display(){
        System.out.println(level+" "+subject+" "+institution+" "+duration+" "+syllabus+" "+teachers+" "+students+" "+curriculum+" "+exams+" "+grades+" "+skills+" "+knowledge+" "+training+" "+development+" "+assessment+" "+resources+" "+facilities+" "+policies+" "+outcomes+" "+certification);
    }
}