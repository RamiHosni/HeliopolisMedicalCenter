import java.lang.reflect.Array;

import java.util.ArrayList;

public class Hospital {

    public Hospital() {
    }

    String name;

    ArrayList<doctor> doctors = new ArrayList<>();
    ArrayList<patient> patients = new ArrayList<>();

    public void addDoctor(doctor doc) {
        doctors.add(doc);
    }

    public void addPatient(patient pat) {
        patients.add(pat);
    }

    public ArrayList getDoctors() {
        return doctors;
    }

    public ArrayList getPatients() {
        return patients;
    }

}
