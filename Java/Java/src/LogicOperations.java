public class LogicOperations {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        //Operadores Operacionales
        System.out.println("****************Operadores Operacionales******************************");
        System.out.println("a es igual a b ? --> " + (a == b));
        System.out.println("a es diferente a b ? --> " + (a != b));

        //Operadores Relacionales
        System.out.println("****************Operadores Relacionales******************************");
        System.out.println("a es menor que b ?  --> " + (a < b));
        System.out.println("a es mayor que b ?  --> " + (a > b));


        //Ahora lo podemos aplicar en una condicion  if
        //Hagamos todas las combinaciones posibles

        System.out.println("*************************Ejemplo con Condicion****************************");
        if (a == b) {
            System.out.println("Los numeros son iguales ✅✅");
        } else if (a > b) {
            System.out.println("a es mayor que b ✅");

        } else if (a < b) {
            System.out.println("a es menor que b ⛔");


        }

    }
}
