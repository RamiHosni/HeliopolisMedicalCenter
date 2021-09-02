public class patient extends person implements info {

    static int patientCounter;
    String disease;

    public patient() {
    }

    public patient(String n, int a, String d)

    {
        super(n, a);
        disease = d;
    }

    public void setdisease(String d) {
        disease = d;
    }

    public String getDisease() {
        return disease;
    }

    public void printInfo() {
        System.out.println(name);
    }

}
