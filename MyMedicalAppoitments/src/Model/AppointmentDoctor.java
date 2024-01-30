package Model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable {
    private int id;

    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(int id, Doctor doctor, Date date, String time) {
        this.id = id;

        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {
        System.out.println("el horario quedo --> "+getDate());
        System.out.println("La hora programado es para las --> "+time);
    }

    @Override
    public void modifySchedule(int id, Date date, String newTime) {

        this.time = newTime;
        System.out.println("ID --> "+getId());
        System.out.println("Reprogramada para  --> "+getDate());
        System.out.println("Hora reprogramada --> " + newTime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
