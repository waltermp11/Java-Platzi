import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private String nombre;
    private static int id = 999; // Para las incrementaciones en los atributos lo que hacemos es ponerla static, no solo privado! ✅✅
    private String speciality;
    private int id_availableAppointment;

    private Date date; // fecha de disponible del doctor
    private String time;

    private String email;
    private String address;


    public Doctor(String nombre, String speciality) {
        this.nombre = nombre;
        this.speciality = speciality;
        id++;
    }

    public void mostrarNombre() {
        System.out.println("El nombre del doctor es : " + nombre);
    }

    @Override
    public String toString() {
        return "Creando un Doctor 🧑🏻‍⚕️\n " +
                "nombre: " + nombre + "\n" +
                " id: " + id + "\n" +
                "speciality: " + speciality + '\n';
    }

    public void showIdDoctor() {

        System.out.println("El Id del doctor es : " + id);
    }

    //Creamos una arrayList -- collecction para almacenar los las citas que nosotros consigamos.

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment (Date date, String time) { // este metodo es para agregar appointments.
        availableAppointments.add(new AvailableAppointment(time,date));
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
