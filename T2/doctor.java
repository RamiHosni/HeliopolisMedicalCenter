public class doctor extends person implements info {

    static int doctorCounter;
    int yearsOfexp;
    String specialization;

    public doctor() {
    }

    public doctor(String n, int a) {
        super(n, a);

    }

    public void setSpecialization(String s) {
        specialization = s;
    }

    public void setYearsofexp(int yoe) {
        yearsOfexp = yoe;
    }

    public int getYearsofexp() {
        return yearsOfexp;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void printInfo() {
        System.out.println("Name" + this.name + "ostas" + this.age);
    }

    public String toString() {
        return (this.getAge() + this.getName());
    }

}
