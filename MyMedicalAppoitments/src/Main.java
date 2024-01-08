import UI.Menu;

import javax.print.Doc;


public class Main {
    public static void main(String[] args) {

        Menu.primerMenu();

        Patient patient = new Patient("Walter","walterm2000011@gmail.com");

        System.out.println("El nombre del paciente registrado es : "+ patient.name);


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
    }
}