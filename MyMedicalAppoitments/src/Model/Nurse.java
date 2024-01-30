package Model;

public class Nurse extends User{

    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }


    @Override
    public void showDataUser() {
        System.out.printf("Enfermera \n" +
                "Departamento : Undefined\n"+
                "Numero de pacientes a Cargo : 10");
    }
}
