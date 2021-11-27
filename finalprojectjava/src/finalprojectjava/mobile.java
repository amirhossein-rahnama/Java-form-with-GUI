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
public class mobile implements Serializable{
    private String mobile_name;
    private String product_date;
    private String code;
    private String product_detail;
    private String product_type;
    private String price;

    public String getMobile_name() {
        return mobile_name;
    }

    public void setMobile_name(String mobile_name) {
        this.mobile_name = mobile_name;
    }

    public String getProduct_date() {
        return product_date;
    }

    public void setProduct_date(String product_date) {
        this.product_date = product_date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProduct_detail() {
        return product_detail;
    }

    public void setProduct_detail(String product_detail) {
        this.product_detail = product_detail;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public mobile(String mobile_name, String product_date, String code, String product_detail, String product_type, String price) {
        this.mobile_name = mobile_name;
        this.product_date = product_date;
        this.code = code;
        this.product_detail = product_detail;
        this.product_type = product_type;
        this.price = price;
    }
}
