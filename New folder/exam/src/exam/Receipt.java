
package exam;

import java.io.Serializable;


public class Receipt implements Serializable{
  private int recs_id; // (PK)
  private String date; // Payment Date
  private double payment; // Paid amount

    public Receipt(int recs_id, String date, double payment) {
        this.recs_id = recs_id;
        this.date = date;
        this.payment = payment;
    }

    public int getRecs_id() {
        return recs_id;
    }

    public void setRecs_id(int recs_id) {
        this.recs_id = recs_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
  
  
}
