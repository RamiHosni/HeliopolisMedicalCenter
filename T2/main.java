import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Hospital h = new Hospital();
        doctor d = new doctor();
        patient p = new patient();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of doctors");
        int ar = in.nextInt();

        for (int i = 0; i < ar; i++) {
            System.out.println("Please enter Doctor" + (i + 1) + "name ");
            String name = in.next();
            System.out.println("Please enter Doctor" + (i + 1) + "Age ");
            int age = in.nextInt();

            h.addDoctor(new doctor(name, age));

            // System.out.println(h.getDoctors());
            d.printInfo();
        }

    }
}