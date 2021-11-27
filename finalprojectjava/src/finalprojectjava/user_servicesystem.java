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
public class user_servicesystem {
    public static List customer,user_service,payment,mobile,store,satisfaction;
    
    public static void main(String[] args) {
        // TODO code application logic here
        customer = new ArrayList();
        user_service = new ArrayList();
        payment = new ArrayList();
        mobile = new ArrayList();
        store = new ArrayList();
        satisfaction = new ArrayList();
       
        test_user_service();
         new Menu().setVisible(true);
        System.out.printf("\n");
    }
        public static void test_user_service() {
        try {
        System.out.printf("\n Tests for user_service\n\n");
        System.out.printf("\n Add_user_service()\n\n");
        add_user_service("12511", "khalil yousefi", "married");
        add_user_service("12412", "iman javidi", "single");
        add_user_service("12313", "david beckham", "divorced");
        System.out.printf("\n List_user_service()\n\n");
        list_user_service();
        System.out.printf("\n Edit_user_service()\n\n");
        edit_user_service("12313", "david beckham", "married");
        System.out.printf("\n List_user_service()\n\n");
        list_user_service();
        backup_user_service();
        
        System.out.printf("\n Delete_user_service()\n\n");
        delete_user_service("12412");
        
        System.out.printf("\n List_user_service()\n\n");
        list_user_service();
        
        retrieve_user_service();
        System.out.printf("\n List_user_service()\n\n");
        list_user_service();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void retrieve_user_service() throws IOException, ClassNotFoundException
    {
     File infile  = new File("user_service.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     user_service = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_user_service() throws IOException
    {
     File outfile  = new File("user_service.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(user_service);
     outObjectStream.close();
     
    }
    public static void add_user_service(String admin_code, String admin_fullname, String admin_details) {
            user_service st =new user_service( admin_code,  admin_fullname,  admin_details);
            user_service.add(st);
    }
    
     public static void edit_user_service(String admin_code, String admin_fullname, String admin_details) {
      user_service st=null;
      Boolean found=false;
      Iterator <user_service> itr = user_service.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(admin_code.equals(st.getAdmin_code())) {
              found=true;
              break;
          }
      }
      if (found) {
          
      }
          st.setAdmin_fullname( admin_fullname);
          st.setAdmin_details( admin_details);
          
         
      }

public static void delete_user_service(String admin_code) {
      user_service st=null;
      Boolean found=false;
      Iterator <user_service> itr = user_service.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(admin_code.equals(st.getAdmin_code())) {
              found=true;
              break;
          }
      }
      if (found) {customer.remove(st);}
      }
    
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
    public static void list_user_service() {
      user_service st;
      Iterator <user_service> itr = user_service.iterator();
      System.out.printf("\n %15s %15s %15s ",
              "admin code","admin fullname", "admin detail");
        draw_line(70);
        
      while (itr.hasNext()) {
          st = itr.next(); 
          System.out.printf("\n %15s %15s %15s ",
              st.getAdmin_code(), st.getAdmin_fullname(), st.getAdmin_details());
      }
      draw_line(70);
        
    }
}
    
    
    

