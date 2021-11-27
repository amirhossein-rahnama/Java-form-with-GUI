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
public class customer implements Serializable{
    private String customer_id;
    private String email;
    private String phone_no;
    private String fname;
    private String lname;

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public customer(String customer_id, String email, String phone_no, String fname, String lname) {
        this.customer_id = customer_id;
        this.email = email;
        this.phone_no = phone_no;
        this.fname = fname;
        this.lname = lname;
    }
}
 