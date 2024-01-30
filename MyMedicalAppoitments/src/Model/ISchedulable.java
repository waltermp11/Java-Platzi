package Model;

import java.util.Date;

public interface ISchedulable {

    void schedule (Date date, String time);
    void modifySchedule (int id, Date date , String time);

}
