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
public class store implements Serializable {
   private String shop_name;
   private String shop_brunch;
   private String shop_code;
   private String shop_address;

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_brunch() {
        return shop_brunch;
    }

    public void setShop_brunch(String shop_brunch) {
        this.shop_brunch = shop_brunch;
    }

    public String getShop_code() {
        return shop_code;
    }

    public void setShop_code(String shop_code) {
        this.shop_code = shop_code;
    }

    public String getShop_address() {
        return shop_address;
    }

    public void setShop_address(String shop_address) {
        this.shop_address = shop_address;
    }

    public store(String shop_name, String shop_brunch, String shop_code, String shop_address) {
        this.shop_name = shop_name;
        this.shop_brunch = shop_brunch;
        this.shop_code = shop_code;
        this.shop_address = shop_address;
    }
}
