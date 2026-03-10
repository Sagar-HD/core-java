public class DMart {

    int employees;
    String branch;
    DMartSection section;

    public DMart(int employees, String branch, DMartSection section) {
        this.employees = employees;
        this.branch = branch;
        this.section = section;
    }

    public void printInfo() {
        if(branch != null && section != null) {
            System.out.println(employees + " " + branch + " " + section);
        }
    }
}