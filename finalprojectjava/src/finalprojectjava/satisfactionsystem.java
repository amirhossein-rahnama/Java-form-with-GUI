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
public class satisfactionsystem {
    public static List customer,user_service,payment,mobile,store,satisfaction;
    
    public static void main(String[] args) {
        // TODO code application logic here
        customer = new ArrayList();
        user_service = new ArrayList();
        payment = new ArrayList();
        mobile = new ArrayList();
        store = new ArrayList();
        satisfaction = new ArrayList();
           
        test_satisfaction();
          new Menu().setVisible(true);   
        System.out.printf("\n");
    }
        public static void test_satisfaction() {
        try {
        System.out.printf("\n Tests for satisfaction \n\n");
        System.out.printf("\n Add_satisfaction()\n\n");
        add_satisfaction("good", "32689532", "guarantee problem","8/10 ");
        add_satisfaction("not bad", "4923238", "reulotion problem","5/10");
        add_satisfaction("great", "6582134", "2 year without single problem","9/10");
        System.out.printf("\n List_satisfaction()\n\n");
        list_satisfaction();
        System.out.printf("\n Edit_satisfaction()\n\n");
        edit_satisfaction("great", "6582134", "2 year just broken screen","10/10");
        System.out.printf("\n List_satisfaction()\n\n");
        list_satisfaction();
        backup_satisfaction();
        
        System.out.printf("\n Delete_satisfaction()\n\n");
        delete_satisfaction("4923238");
        
        System.out.printf("\n List_satisfaction()\n\n");
        list_satisfaction();
        
        retrieve_satisfaction();
        System.out.printf("\n List_satisfaction()\n\n");
        list_satisfaction();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void retrieve_satisfaction() throws IOException, ClassNotFoundException
    {
     File infile  = new File("satisfaction.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     satisfaction = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_satisfaction() throws IOException
    {
     File outfile  = new File("satisfaction.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(satisfaction);
     outObjectStream.close();
     
    }
    public static void add_satisfaction(String status, String satisfaction_code, String feedback, String point) {
            satisfaction st =new satisfaction( status,  satisfaction_code,  feedback,  point);
            satisfaction.add(st);
    }
    
     public static void edit_satisfaction(String status, String satisfaction_code, String feedback, String point) {
      satisfaction st=null;
      Boolean found=false;
      Iterator <satisfaction> itr = satisfaction.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(satisfaction_code.equals(st.getSatisfaction_code())) {
              found=true;
              break;
          }
      }
      if (found) {
          
      }
          st.setStatus( status);
          st.setFeedback( feedback);
          st.setPoint( point);
          
         
      }

public static void delete_satisfaction(String satisfaction_code) {
      satisfaction st=null;
      Boolean found=false;
      Iterator <satisfaction> itr = satisfaction.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(satisfaction_code.equals(st.getSatisfaction_code())) {
              found=true;
              break;
          }
      }
      if (found) {satisfaction.remove(st);}
      }
    
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
    public static void list_satisfaction() {
      satisfaction st;
      Iterator <satisfaction> itr = satisfaction.iterator();
      System.out.printf("\n %15s %15s %15s %15s ",
              "status","satisfaction code", "feedback","point");
        draw_line(70);
        
      while (itr.hasNext()) {
          st = itr.next(); 
          System.out.printf("\n %15s %15s %15s %15s ",
              st.getStatus(), st.getSatisfaction_code(), st.getFeedback(),st.getPoint());
      }
      draw_line(70);
        
    }
}
    
    
    

