package Model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private static int id = 999; // Para las incrementaciones en los atributos lo que hacemos es ponerla static, no solo privado! ✅✅
    private String speciality;
    private int id_availableAppointment;

    private Date date; // fecha de disponible del doctor
    private String time;

    public Doctor(String name, String email) {
        super(name, email);
    }


    //Creamos una arrayList -- collecction para almacenar los las citas que nosotros consigamos.

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) { // este metodo es para agregar appointments.
        availableAppointments.add(new AvailableAppointment(time, date));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {


        return availableAppointments;
    }

    //CLASE ANIDADA AVAILABLEAPPOINTMENT
    public static class AvailableAppointment {


        private String time;
        private int id;
        private Date date;

        public AvailableAppointment(String time, Date date) {
            this.time = time;
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

    @Override
    public void showDataUser() {
        System.out.println("Doctor \n" +
                "Departamento  : Pediatria \n" +
                "Estado --> Disponible ✅✅");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciality='" + speciality + '\'' +
                ", id_availableAppointment=" + id_availableAppointment;
    }

    public void mostrarArray() {
        for (Doctor.AvailableAppointment aA : getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        // Atributos
     /*static int id = 1000; //Este se tiene que autoincrementar
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    Doctor(String name) {
        System.out.println("El nombre del Doctor es : " + name);


    }

    //Metodos
    public void showName (){
        System.out.println(name);
    }

    public void showId (){
        System.out.println("ID Doctor : "+id);
    }*/


    }
}
