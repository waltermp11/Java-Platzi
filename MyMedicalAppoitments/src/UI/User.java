package UI;

public class User { //Clase Padre

    private String name;
    private String email;
    private String address;
    private String number;


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number.length()==8) {

            System.out.println("Se guardo el numero correctamente ✅✅ \n" +
                    number);

        }else {
            System.out.println("No cumple con los 8 digitos asignados ❌❌");
        }
        this.number = number;
    }
}
