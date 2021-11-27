/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectjava;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class payment implements Serializable{
    private String amount;
    private String payment_type;
    private String payment_code;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getPayment_code() {
        return payment_code;
    }

    public void setPayment_code(String payment_code) {
        this.payment_code = payment_code;
    }

    public payment(String amount, String payment_type, String payment_code) {
        this.amount = amount;
        this.payment_type = payment_type;
        this.payment_code = payment_code;
    }
}
