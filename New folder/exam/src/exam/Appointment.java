
package exam;

import java.io.Serializable;


public class Appointment implements Serializable{
  private int apt_id; // (PK)
  private int pat_id; // (FK) --> Patient.pat_id
  private int apt_day; // 0-->Monday .. 6-->Saturday
  private int apt_time; // 0-->09:00, 1-->09:30, ... 15-->17:30

    public Appointment(int apt_id, int pat_id, int apt_day, int apt_time) {
        this.apt_id = apt_id;
        this.pat_id = pat_id;
        this.apt_day = apt_day;
        this.apt_time = apt_time;
    }

    public int getApt_id() {
        return apt_id;
    }

    public void setApt_id(int apt_id) {
        this.apt_id = apt_id;
    }

    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id) {
        this.pat_id = pat_id;
    }

    public int getApt_day() {
        return apt_day;
    }

    public void setApt_day(int apt_day) {
        this.apt_day = apt_day;
    }

    public int getApt_time() {
        return apt_time;
    }

    public void setApt_time(int apt_time) {
        this.apt_time = apt_time;
    }
  
  
}
