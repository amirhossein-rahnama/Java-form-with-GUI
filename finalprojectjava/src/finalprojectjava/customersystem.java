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
public class customersystem {
    public static List customer,user_service,payment,mobile,store,satisfaction;
    
    public static void main(String[] args) {
        // TODO code application logic here
        customer = new ArrayList();
        user_service = new ArrayList();
        payment = new ArrayList();
        mobile = new ArrayList();
        store = new ArrayList();
        satisfaction = new ArrayList();
              
        test_customer();
        new Menu().setVisible(true);  
        System.out.printf("\n");
    }
        public static void test_customer() {
        try {
        System.out.printf("\n Tests for customer \n\n");
        System.out.printf("\n Add_customer()\n\n");
        add_customer("125", "amirhossein@gmail.com", "05338692131","amirhossein ","rahnama");
        add_customer("124", "malihe@gmail.com", "05338692143","malihe","majidi");
        add_customer("123", "manije@gmail.com", "05338692154","manije","sosani");
        System.out.printf("\n List_customer()\n\n");
        list_customer();
        //System.out.printf("\n Edit_customer()\n\n");
        //edit_customer("123", "manije@gmail.com", "05338692154","manije","lousi");
        //System.out.printf("\n List_customer()\n\n");
        //list_customer();
        //backup_customer();
        
        //System.out.printf("\n Delete_customer()\n\n");
       // delete_customer("124");
        
       // System.out.printf("\n List_customer()\n\n");
       // list_customer();
        
        retrieve_customer();
       // System.out.printf("\n List_customer()\n\n");
       // list_customer();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void retrieve_customer() throws IOException, ClassNotFoundException
    {
     File infile  = new File("customer.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     customer = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_customer() throws IOException
    {
     File outfile  = new File("customer.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(customer);
     outObjectStream.close();
     
    }
    public static void add_customer(String customer_id, String email, String phone_no, String fname, String lname) {
            customer st =new customer(customer_id, email, phone_no,fname,lname);
            customer.add(st);
    }
    
     public static void edit_customer(String customer_id, String email, String phone_no, String fname, String lname) {
      customer st=null;
      Boolean found=false;
      Iterator <customer> itr = customer.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(customer_id.equals(st.getCustomer_id())) {
              found=true;
              break;
          }
      }
      if (found) {
          
      }
          st.setEmail( email);
          st.setPhone_no( phone_no);
          st.setFname( fname);
          st.setLname( lname);
         
      }

public static void delete_customer(String customer_id) {
      customer st=null;
      Boolean found=false;
      Iterator <customer> itr = customer.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(customer_id.equals(st.getCustomer_id())) {
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
    
    public static void list_customer() {
      customer st;
      Iterator <customer> itr = customer.iterator();
      System.out.printf("\n %15s %15s %15s %15s %15s",
              "customer id","email", "phone no","fname","lname");
        draw_line(70);
        
      while (itr.hasNext()) {
          st = itr.next(); 
          System.out.printf("\n %15s %15s %15s %15s %15s",
              st.getCustomer_id(), st.getEmail(), st.getPhone_no(),st.getFname(),st.getLname());
      }
      draw_line(70);
        
    }
}
    
    
    

