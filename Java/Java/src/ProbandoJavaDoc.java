import java.util.Scanner;

public class ProbandoJavaDoc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Aca vamos a implementar una funcion que nos dice ola conversiond e COP a USD

        System.out.println("Escoja la moneda a la que desea transferir su dinero 💵💵💵 : \n" +
                "1. USD\n" +
                "2. MXN\n" +
                "3. Pounds.");
        String tipoMoneda = scanner.next();


        //Implementamos el metodo
        conversionAMoneda(3966.25,tipoMoneda);

    }


    //Aca vamos a documentar esta funcion

    /**
     *Descripción : Esta funcion hace la conversion de pesoos colombianos a dolares o pesos mexicanos
     * @param cantidadPesos Cantidad de pesos colombianos.
     * @param tipoMoneda  el tipo de moneda al que se le hara la conversion, solo USD y MXN pesos
     * @return cantidadPesos devuelve la cantidad actualizada en dolares
     * */

    public static double conversionAMoneda(double cantidadPesos, String tipoMoneda) {


        switch (tipoMoneda) {
            case "1":
                cantidadPesos = cantidadPesos * 0.00025;
                System.out.println("Cantidad de Dolares :  " + cantidadPesos);
                break;
            case "2":
                cantidadPesos=cantidadPesos*0.0043;
                System.out.println("Cantidad de pesos mexicanos :" + cantidadPesos);
                break;
            default:
                System.out.println("No disponemos de esa conversion de dinero 😒😒⛔⛔");
        }



        return cantidadPesos;
    }
}
