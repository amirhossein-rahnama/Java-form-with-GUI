
package exam;

import java.io.Serializable;


public class Patient{
  private String pat_id;
  private String  pat_name;
  private String  pat_surname;
  private String  pat_telephone;
  private String  pat_address;

public Patient(String pat_id, String pat_name, String pat_surname, String pat_telephone, String pat_address) {
        this.pat_id = pat_id;
        this.pat_name = pat_name;
        this.pat_surname = pat_surname;
        this.pat_telephone = pat_telephone;
        this.pat_address = pat_address;
    }

    public String getPat_id() {
        return pat_id;
    }

    public void setPat_id(String pat_id) {
        this.pat_id = pat_id;
    }

    public String getPat_name() {
        return pat_name;
    }

    public void setPat_name(String pat_name) {
        this.pat_name = pat_name;
    }

    public String getPat_surname() {
        return pat_surname;
    }

    public void setPat_surname(String pat_surname) {
        this.pat_surname = pat_surname;
    }

    public String getPat_telephone() {
        return pat_telephone;
    }

    public void setPat_telephone(String pat_telephone) {
        this.pat_telephone = pat_telephone;
    }

    public String getPat_address() {
        return pat_address;
    }

    public void setPat_address(String pat_address) {
        this.pat_address = pat_address;
    }


}
