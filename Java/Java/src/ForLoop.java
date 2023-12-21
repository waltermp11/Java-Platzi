public class ForLoop {
    public static void main(String[] args) {

        //Implementamos los metodos
        turnOnOffLight();

        for (int i=1; i<=10;i++){
            turnLight();

        }
        System.out.println("Termino las 10 ejecuciones el programa 🔦🔦");
        

    }

    //Los metodos siempre van afuera del metodo main, van hacia abajo o en otras clases para el desarrollo correcto.
    public static void turnLight (){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean  turnOnOffLight (){
        boolean lightState = false;
        return lightState? false:true;

    }

}
