/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class mobilesystem {
    public static List customer,user_service,payment,mobile,store,satisfaction;
    
    public static void main(String[] args) {
        // TODO code application logic here
        customer = new ArrayList();
        user_service = new ArrayList();
        payment = new ArrayList();
        mobile = new ArrayList();
        store = new ArrayList();
        satisfaction = new ArrayList();
             
        test_mobile();
          new Menu().setVisible(true); 
        System.out.printf("\n");
    }
        public static void test_mobile() {
        try {
        System.out.printf("\n Tests for mobile \n\n");
        System.out.printf("\n Add_mobile()\n\n");
        add_mobile("galaxy s", "2018", "568923156487952","64gb ","android","1000$");
        add_mobile("huawei i3", "2017", "639639564287169","128gb","android","500$");
        add_mobile("iphone 6", "2016", "958746328795689","128gb","ios","2000$");
        System.out.printf("\n List_mobile()\n\n");
        list_mobile();
        System.out.printf("\n Edit_mobile()\n\n");
        edit_mobile("iphone 8", "2018", "958746328795689","256gb","ios","2500$");
        System.out.printf("\n List_mobile()\n\n");
        list_mobile();
        backup_mobile();
        
        System.out.printf("\n Delete_mobile()\n\n");
        delete_mobile("639639564287169");
        
        System.out.printf("\n List_mobile()\n\n");
        list_mobile();
        
        retrieve_mobile();
        System.out.printf("\n List_mobile()\n\n");
        list_mobile();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void retrieve_mobile() throws IOException, ClassNotFoundException
    {
     File infile  = new File("mobile.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     mobile = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_mobile() throws IOException
    {
     File outfile  = new File("mobile.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(mobile);
     outObjectStream.close();
     
    }
    public static void add_mobile(String mobile_name, String product_date, String code, String product_detail, String product_type, String price) {
            mobile st =new mobile( mobile_name,  product_date,  code,  product_detail,  product_type,  price);
            mobile.add(st);
    }
    
     public static void edit_mobile(String mobile_name, String product_date, String code, String product_detail, String product_type, String price) {
      mobile st=null;
      Boolean found=false;
      Iterator <mobile> itr = mobile.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(code.equals(st.getCode())) {
              found=true;
              break;
          }
      }
      if (found) {
          
      }
          st.setMobile_name( mobile_name);
          st.setProduct_date( product_date);
          st.setProduct_detail( product_detail);
          st.setProduct_type( product_type);
          st.setPrice( price);
         
      }

public static void delete_mobile(String code) {
      mobile st=null;
      Boolean found=false;
      Iterator <mobile> itr = mobile.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(code.equals(st.getCode())) {
              found=true;
              break;
          }
      }
      if (found) {mobile.remove(st);}
      }
    
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
    public static void list_mobile() {
      mobile st;
      Iterator <mobile> itr = mobile.iterator();
      System.out.printf("\n %15s %15s %15s %15s %15s %15s",
              "mobile name","product date", "code","product detail","product type","price");
        draw_line(70);
        
      while (itr.hasNext()) {
          st = itr.next(); 
          System.out.printf("\n %15s %15s %15s %15s %15s %15s",
              st.getMobile_name(), st.getProduct_date(), st.getCode(),st.getProduct_detail(),st.getProduct_type(),st.getPrice());
      }
      draw_line(70);
        
    }
}
    
    
    

