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
public class paymentsystem {
    public static List customer,user_service,payment,mobile,store,satisfaction;
    
    public static void main(String[] args) {
        // TODO code application logic here
        customer = new ArrayList();
        user_service = new ArrayList();
        payment = new ArrayList();
        mobile = new ArrayList();
        store = new ArrayList();
        satisfaction = new ArrayList();
          
        test_payment();
         new Menu().setVisible(true);     
        System.out.printf("\n");
    }
        public static void test_payment() {
        try {
        System.out.printf("\n Tests for payment\n\n");
        System.out.printf("\n Add_payment()\n\n");
        add_payment("150$", "credit", "1549876322");
        add_payment("2000$", "cash", "2365952150");
        add_payment("69$", "credit", "3568794421");
        System.out.printf("\n List_payment()\n\n");
        list_payment();
        System.out.printf("\n Edit_payment()\n\n");
        edit_payment("656$", "credit", "3568794421");
        System.out.printf("\n List_payment()\n\n");
        list_payment();
        backup_payment();
        
        System.out.printf("\n Delete_payment()\n\n");
        delete_payment("1549876322");
        
        System.out.printf("\n List_payment()\n\n");
        list_payment();
        
        retrieve_payment();
        System.out.printf("\n List_payment()\n\n");
        list_payment();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void retrieve_payment() throws IOException, ClassNotFoundException
    {
     File infile  = new File("payment.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     payment = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_payment() throws IOException
    {
     File outfile  = new File("payment.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(payment);
     outObjectStream.close();
     
    }
    public static void add_payment(String amount, String payment_type, String payment_code) {
            payment st =new payment(  amount,  payment_type,  payment_code);
            payment.add(st);
    }
    
     public static void edit_payment(String amount, String payment_type, String payment_code) {
      payment st=null;
      Boolean found=false;
      Iterator <payment> itr = payment.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(payment_code.equals(st.getPayment_code())) {
              found=true;
              break;
          }
      }
      if (found) {
          
      }
          st.setAmount( amount);
          st.setPayment_type( payment_type);
          
         
      }

public static void delete_payment(String payment_code) {
      payment st=null;
      Boolean found=false;
      Iterator <payment> itr = payment.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(payment_code.equals(st.getPayment_code())) {
              found=true;
              break;
          }
      }
      if (found) {payment.remove(st);}
      }
    
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
    public static void list_payment() {
      payment st;
      Iterator <payment> itr = payment.iterator();
      System.out.printf("\n %15s %15s %15s ",
              "amount","payment type", "payment code");
        draw_line(70);
        
      while (itr.hasNext()) {
          st = itr.next(); 
          System.out.printf("\n %15s %15s %15s ",
              st.getAmount(), st.getPayment_type(), st.getPayment_code());
      }
      draw_line(70);
        
    }
}
    
    
    

