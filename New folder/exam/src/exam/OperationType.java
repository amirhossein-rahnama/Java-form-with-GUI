
package exam;

import java.io.Serializable;


public class OperationType  implements Serializable{
 private int opt_id;
 private String opt_name;
 private double opt_price;

    public OperationType(int opt_id, String opt_name, double opt_price) {
        this.opt_id = opt_id;
        this.opt_name = opt_name;
        this.opt_price = opt_price;
    }

    public int getOpt_id() {
        return opt_id;
    }

    public void setOpt_id(int opt_id) {
        this.opt_id = opt_id;
    }

    public String getOpt_name() {
        return opt_name;
    }

    public void setOpt_name(String opt_name) {
        this.opt_name = opt_name;
    }

    public double getOpt_price() {
        return opt_price;
    }

    public void setOpt_price(double opt_price) {
        this.opt_price = opt_price;
    }
 
 
}
