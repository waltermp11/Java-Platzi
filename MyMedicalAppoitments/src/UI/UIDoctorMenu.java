package UI;

import java.util.Scanner;

public class UIDoctorMenu {

    public static void showDoctorMenu() {

        //Nos va a mostrar la logica del menu del doctor

        int response = 0;

        do {

            System.out.println("DOCTOR \n" +
                    "Bienvenido " + Menu.doctorlogueado.getName());
            System.out.println("1. Agregar cita disponible  ✅\n" +
                    "2. Citas Asignadas 📅 \n" +
                    "0. Salir de la Cuenta ⬅️ ");
            //utilizamos la clase Scanner para obtener el resultado

            System.out.println("Ingrese la opcion : ");
            Scanner scanner = new Scanner(System.in);
            int opcionDoctor = scanner.nextInt();

            System.out.println(opcionDoctor);


            switch (opcionDoctor) {


                case 1:
                    mostrarAgregarCitaDisponibleMenu();
                    break;


                case 2:
                    break;

                case 0:
                    Menu.primerMenu();
                    break;

                default:
                    System.out.println("Ingrese una opcion valida ❌");
                    showDoctorMenu();
                    break;


            }


        } while (response != 0);

    }


    public static void mostrarAgregarCitaDisponibleMenu() {
        int response = 0;

        do {

            System.out.println("----Agregar Cita ----");
            System.out.println("Selecciona un mes :");

            for (int i = 0; i <= 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + Menu.MONTHS[j]);

            }

            System.out.println("0. Salida ⬅️");

            System.out.println("Ingrese la opcion : ");
            Scanner scanner = new Scanner(System.in);
            response = scanner.nextInt();

            if (response > 0 && response <= 4) {
                int mesSeleccionado =response;
                System.out.println(mesSeleccionado+" . "+Menu.MONTHS[mesSeleccionado] +" estas en este mes 📅");

                System.out.println("Ingrese la fecha en este Formato : [dd/mm/aaaa]");
                String date = scanner.nextLine();

                System.out.println("La fecha asignada fue : "+ date + " y se guardo correctamente ✅");

            } else if (response == 0) {

                showDoctorMenu();
            }


        }
        while (response != 0);


    }

    ;


}
