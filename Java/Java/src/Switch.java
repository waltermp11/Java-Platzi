public class Switch {

    public static void main(String[] args) {

        //Lo podemos aplicar cuando tenemos modos nocturnos en nuestra aplicacion! 🌓

        String colorModeSelected = "Orange";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Seleccionaste Light mode 🕯️");
                break;

            case "Dark":
                System.out.println("Seleccionaste Night  Mode ");
                break;

            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            default:
                System.out.println("No tenemos esa opcion valida 😒");

        }
    }

}
