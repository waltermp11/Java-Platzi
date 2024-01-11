import UI.Menu;

import javax.print.Doc;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        //Menu.primerMenu();


        Patient patient = new Patient("Walter", "walterm2000011@gmail.com");

        System.out.println("El nombre del paciente registrado es : " + patient.getName());
        patient.setWeight(123);
        System.out.println("El peso de Walter es : " + patient.getWeight());

       /* Doctor doctor = new Doctor("Walter ", "Backend Developer");
        System.out.println(doctor.toString()) ;
        doctor.showIdDoctor();

        System.out.println("****************************************");

        Doctor doctor2 = new Doctor("Montoya", "Cirujano ");
        System.out.println(doctor2.toString());*/

       /*Doctor myDoctor = new Doctor();
        myDoctor.name = "Walter Montoya Presiga";
        myDoctor.showName();
        myDoctor.showId();

        Doctor otherDoctor = new Doctor();
        otherDoctor.showId();
        System.out.println(Doctor.id);*/


        Doctor doctor = new Doctor("Walter", "Nutricionista");
        doctor.addAvailableAppointment(new Date(), "8 AM");
        doctor.addAvailableAppointment(new Date(), "10 AM");

        doctor.addAvailableAppointment(new Date(), "12 M");
        doctor.addAvailableAppointment(new Date(), "12 M");

        System.out.println(doctor.getAvailableAppointments().clone());


        for (Doctor.AvailableAppointment aA : doctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
    }
}