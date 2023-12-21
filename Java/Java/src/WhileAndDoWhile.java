import java.util.Scanner;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        //Aca utilizamos un do while! ✅✅
            int response =0;

        do {
            System.out.println("Selecciona el número de la opción deseada : ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());


            switch (response) {

                case 0:
                    System.out.println("Hasta luego");
                    break;

                case 1:
                    System.out.println("escogiste la opcion de Movies 🎞️🎞️");
                    break;

                case 2:
                    System.out.println("Escogiste la opcion de Series 🍿🍿 ");
                    break;

                default :
                    System.out.println("No contamos con esa opcion aun ⛔⛔");
            }


        } while (response>0);
        System.out.println("Se termino el programa, feliz ");
    }



    // Aca vamos a implementar el WHILE ✅✅😁


}
