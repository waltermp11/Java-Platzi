public class Demo {


    public static void main(String[] args) {

        boolean isBLuetoothEnabled = true;
        int fileSended = 3;

        if (isBLuetoothEnabled) {
            //Send File
            fileSended++;
            System.out.println("Archivo Enviado 💻 ✅✅");
        }
        else {
            System.out.println("Por favor enciende el bluetooh 😒 ⛔⛔");
        }

        //aca imprimimos las variables que nosotros tenemos
        System.out.println(isBLuetoothEnabled);
        System.out.println(fileSended);


    }
}
