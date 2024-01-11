import UI.User;

public class Patient extends User {


    private String birthday;
    private double weight;
    private double height;
    private String blood;


    public Patient(String name, String email, String birthday, double weight, double height, String blood) {
        super(name, email);
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
        this.blood = blood;
    }



    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight+" Kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
