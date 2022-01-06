import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor  myDoctor = new Doctor("Juan", "juan@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "12pm");

        System.out.printf(myDoctor.toString());

        /*
        for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.printf("\n" + availableAppointment.getDate() + " " +availableAppointment.getTime());
        }
        */

        System.out.printf("\n" + myDoctor.getName());
        Patient patient = new Patient("Alejandra", "ale@mail.com");
        System.out.printf(patient.toString());
    }
}
