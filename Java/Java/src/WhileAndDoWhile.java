import java.util.Scanner;

public class WhileAndDoWhile {
    public static void main(String[] args) {
            int response =0;

        do {
            System.out.println("Selecciona el número de la opción deseada : ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());
            


        }
    }
}
