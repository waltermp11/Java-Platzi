public class WhileLoop {

    static boolean isturnOnLight =false;

    public static void main(String[] args) {

        //Aca haremos la simulacion de una lampara, el sistema SOS
        turnOnOffLight();
        int contador=1;
        while (isturnOnLight==true && contador<=10){
            printSOS();
            contador++;
        }


    }
    public static void printSOS (){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight() {
        isturnOnLight = (isturnOnLight)? false:true;
        return isturnOnLight;

    }
}
