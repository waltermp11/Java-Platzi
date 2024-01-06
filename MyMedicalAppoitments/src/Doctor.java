import javax.print.Doc;

public class Doctor {
private String nombre;
private static int id=999; // Para las incrementaciones en los atributos lo que hacemos es ponerla static, no solo privado! ✅✅
private String speciality;

    public Doctor(String nombre, String speciality) {
        this.nombre = nombre;
        this.speciality = speciality;
        id++;
    }

    public void mostrarNombre (){
        System.out.println("El nombre del doctor es : " +nombre );
    }

    @Override
    public String toString() {
        return "Creando un Doctor 🧑🏻‍⚕️\n " +
                "nombre: " + nombre +"\n" +
                " id: " + id + "\n"+
                "speciality: " + speciality + '\n';
    }

    public void showIdDoctor (){

        System.out.println("El Id del doctor es : "+id);
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
