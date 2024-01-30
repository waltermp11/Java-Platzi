package UI;

import Model.Doctor;
import Model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static Doctor doctorlogueado;
    public static Patient pacienteLogueado;


    public static int primerMenu() {
        System.out.println("Bienvendio a WalterSura 🧑🏻‍⚕️🧑🏻‍⚕️");

        int response1 = 0;
        do {
            System.out.println("Escoja el tipo de Usuario : \n" + "1. Doctor\n" + "2. Patient\n" + "3. Salir");
            Scanner scanner = new Scanner(System.in);
            response1 = Integer.valueOf(scanner.nextLine());

            switch (response1) {

                case 1:
                    System.out.println("Escogiste la Opcion doctor");
                    autentificarUsuario(1);
                    break;

                case 2:
                    System.out.println("Escogiste la opcion de Paciente");
                    autentificarUsuario(2);
                    break;

                default:
                    System.out.println("No tenemos esa opcion seleccionada , solo 1 y 2 ❌❌❌❌");
                    break;


            }

        } while (response1 != 3);


        return response1;
    }


    //******************************Metodo de Doctor
    public static void menuDoctor() {
        int response2 = 0;
        do {
            System.out.println("Menu de Doctor 👨🏻‍⚕️🧑🏻‍⚕️🏥🩺🩻:\n" + "1. Crear ✅\n" + "2. Modificar ▶️\n" + "3. Elimnar ❌\n" + "4. Salida ⬅️");

            System.out.println("Escoja  una de las opciones ✅ : ");
            Scanner scanner = new Scanner(System.in);
            response2 = Integer.valueOf(scanner.nextLine());
        } while (response2 != 4);


    }

    //**********************MONTHS*************************************

    public static String MONTHS[] = {"MONTHS 📅📅", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    //*************************Metodo Paciente **********************

    public static void menuPaciente() {


        System.out.println("Este es el menu de paciente 👶🏻👩🏻‍🦰🧓🏻🧑🏻 ");
        int response3 = 0;
        do {
            System.out.println("Menu de Doctor:\n" + "1. Consultar citas\n" + "2. Resultados\n" + "3. Ortodoncia\n" + "4. Volver al menu Principal ⬅️\n");

            Scanner scanner = new Scanner(System.in);
            response3 = scanner.nextInt();

            switch (response3) {
                case 1:
                    consultarCita();
                    break;

                case 2:
                    System.out.println("Estos son los resultados  \n" + "RESULTADOS 📚📚📚📚");
                    break;
                case 3:
                    System.out.println("Esta es la ortodoncia 🦷🦷");
                    break;

                case 4:
                    System.out.println("Se va a deolver al menu anterior ⬅️");
                    break;

                default:
                    System.out.println("No tenemos esa opcion seleccionada ❌❌❌❌");
                    break;

            }
        } while (response3 != 4);
    }


    public static void consultarCita() {
        int mesRepuesta = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ". " + MONTHS[i]);
        }
        System.out.println("Escoja  el mes");
        Scanner scanner1 = new Scanner(System.in);
        mesRepuesta = Integer.valueOf(scanner1.nextLine());

        switch (mesRepuesta) {
            case 1:
                System.out.println("Escogiste el mes de Enero 📅📅📅\n" + "Agendamos tu cita para el enero");
                break;

            case 2:
                System.out.println("Escogiste el mes de Febrero 📅📅📅");
                break;

            case 3:
                System.out.println("Escogiste el mes de Marzo 📅📅📅");
                break;

            default:
                System.out.println("No tenemos ese mes aun disponible ❌❌❌");
        }


    }


    private static void autentificarUsuario(int tipoDeUsuario) {
        //Tipo de usuario 1 = usuario
        //tipo de usuario 2 = paciente


        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Walter", "walterm200011@gmail.com"));
        doctors.add(new Doctor("Jesus", "Jesus@gmail.com"));
        doctors.add(new Doctor("Alberto", "alberto@gmail.com"));


        ArrayList<Patient> pacientes = new ArrayList<>();
        pacientes.add(new Patient("Manuela Rojas", "manuela@mail.com"));
        pacientes.add(new Patient("Valentina ", "valentina@mail.com"));
        pacientes.add(new Patient("Andres Valencia ", "Andres@mail.com"));


        boolean emailCorrecto = false;

        do {
            System.out.println("Ingrese su email : [name@mail.com]");
            Scanner scanner = new Scanner(System.in); //Usamos el scanner para almacenar lo que tiene el usuario
            String email = scanner.nextLine();


            if (tipoDeUsuario == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {

                        emailCorrecto = true;
                        doctorlogueado = d;
                        System.out.println(doctorlogueado);
                        //mostrar el menu del doctor
                        menuDoctor();

                    }
                }

            }
            if (tipoDeUsuario == 2) {
                for (Patient p : pacientes) {

                    if (p.getEmail().equals(email)) {
                        emailCorrecto = true;
                        pacienteLogueado = p;
                        System.out.println(pacienteLogueado);
                        menuPaciente();
                    }
                }


            }
        } while (!emailCorrecto); // si es diferente de false
    }
}


