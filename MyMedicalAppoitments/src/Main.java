import Model.*;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        //Menu.primerMenu();

/*
        Patient patient = new Patient("Walter", "walterm2000011@gmail.com", "09/11/2000", 123, 180, "A+");

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


       /* Doctor doctor = new Doctor("Walter", "walterm200011@gmail.com", "Nutricionista", new Date(), "8:00 AM");
        doctor.addAvailableAppointment(new Date(), "8 AM");
        doctor.addAvailableAppointment(new Date(), "10 AM");

        doctor.addAvailableAppointment(new Date(), "12 M");
        doctor.addAvailableAppointment(new Date(), "12 M");

        System.out.println(doctor.getAvailableAppointments().clone());*/


        /*for (Doctor.AvailableAppointment aA : doctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/
 /*
        System.out.println(doctor); //No e
        doctor.mostrarArray();


        System.out.println("***********************************************");

        doctor.showDataUser();

        User user = new Nurse("Manuela", "manuelarojasvalencia55@gmail.com");

        user.showDataUser();


        System.out.println("*************************************************************");

        AppointmentDoctor doctor1 = new AppointmentDoctor(1001, doctor, new Date(), "9:00 AM");

        doctor1.schedule(new Date(), doctor1.getTime());
        doctor1.modifySchedule(1001, new Date(), "10:00 AM");

        System.out.println(doctor1.getTime());

        User user22 = new User("Walter", "walterm200011@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor : \n" +
                        "Hospital : Cruz Verde \n" +
                        "Departamento : Pediatria");
            }
        };

        System.out.println("*****************Clase Anonima ************************************");
        System.out.println(user22.getName());
        user22.showDataUser();


        */



        UI.Menu.primerMenu();

    }
}