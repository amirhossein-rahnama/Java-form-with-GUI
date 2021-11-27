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
public class user_service implements Serializable {
    private String admin_code;
    private String admin_fullname;
    private String admin_details;

    public String getAdmin_code() {
        return admin_code;
    }

    public void setAdmin_code(String admin_code) {
        this.admin_code = admin_code;
    }

    public String getAdmin_fullname() {
        return admin_fullname;
    }

    public void setAdmin_fullname(String admin_fullname) {
        this.admin_fullname = admin_fullname;
    }

    public String getAdmin_details() {
        return admin_details;
    }

    public void setAdmin_details(String admin_details) {
        this.admin_details = admin_details;
    }

    public user_service(String admin_code, String admin_fullname, String admin_details) {
        this.admin_code = admin_code;
        this.admin_fullname = admin_fullname;
        this.admin_details = admin_details;
    }
    
}
