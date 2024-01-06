package UI;

import java.util.Scanner;

public class Menu {


    public static int primerMenu() {
        System.out.println("Bienvendio a WalterSura 🧑🏻‍⚕️🧑🏻‍⚕️");

        int response1 = 0;
        do {
            System.out.println("Escoja el tipo de Usuario : \n" +
                    "1. Doctor\n" +
                    "2. Patient\n" +
                    "3. Exit");
            Scanner scanner = new Scanner(System.in);
            response1 = Integer.valueOf(scanner.nextLine());

            switch (response1){

                case 1:
                    System.out.println("Escogiste la Opcion doctor");
                    menuDoctor();
                    break;

                case 2:
                    System.out.println("Escogiste la opcion de Paciente");
                    menuPaciente();
                    break;


            }

        }
        while (response1 != 3);


        return response1;
    }




    //******************************Metodo de Doctor
    public static void menuDoctor (){
        int response2=0;
        do{
            System.out.println("Menu de Doctor 👨🏻‍⚕️🧑🏻‍⚕️🏥🩺🩻:\n" +
                    "1. Crear" +
                    "2. Modificar" +
                    "3. Elimnar" +
                    "4. Salida");

            Scanner scanner = new Scanner(System.in);
            response2 = Integer.valueOf(scanner.nextLine());
        }
        while   (response2!=4);




    }

    //*************************Metodo Paciente **********************

    public static void menuPaciente (){
        System.out.println("Este es el menu de paciente 👶🏻👩🏻‍🦰🧓🏻🧑🏻 ");
        int response3=0;
        do{
            System.out.println("Menu de Doctor:\n" +
                    "1. Consultar citas" +
                    "2. Resultados" +
                    "3. Ortodoncia" +
                    "4. Salida");

            Scanner scanner = new Scanner(System.in);
            response3 = Integer.valueOf(scanner.nextLine());
        }
        while   (response3!=4);
    }
}
