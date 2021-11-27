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
public class storesystem {
    public static List customer,user_service,payment,mobile,store,satisfaction;
    
    public static void main(String[] args) {
        // TODO code application logic here
        customer = new ArrayList();
        user_service = new ArrayList();
        payment = new ArrayList();
        mobile = new ArrayList();
        store = new ArrayList();
        satisfaction = new ArrayList();
            
        test_store();
            new Menu().setVisible(true);
        System.out.printf("\n");
    }
        public static void test_store() {
        try {
        System.out.printf("\n Tests for store \n\n");
        System.out.printf("\n Add_store()\n\n");
        add_store("apple store", "1", "985621","madrid ");
        add_store("androidiha", "9", "564782","tehran");
        add_store("teniqo", "25", "965932","los angeles");
        System.out.printf("\n List_store()\n\n");
        list_store();
        System.out.printf("\n Edit_store()\n\n");
        edit_store("teniqo", "101", "965932","miami");
        System.out.printf("\n List_store()\n\n");
        list_store();
        backup_store();
        
        System.out.printf("\n Delete_store()\n\n");
        delete_store("985621");
        
        System.out.printf("\n List_store()\n\n");
        list_store();
        
        retrieve_store();
        System.out.printf("\n List_store()\n\n");
        list_store();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void retrieve_store() throws IOException, ClassNotFoundException
    {
     File infile  = new File("store.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     store = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_store() throws IOException
    {
     File outfile  = new File("store.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(store);
     outObjectStream.close();
     
    }
    public static void add_store(String shop_name, String shop_brunch, String shop_code, String shop_address) {
            store st =new store( shop_name,  shop_brunch,  shop_code,  shop_address);
            store.add(st);
    }
    
     public static void edit_store(String shop_name, String shop_brunch, String shop_code, String shop_address) {
      store st=null;
      Boolean found=false;
      Iterator <store> itr = store.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(shop_code.equals(st.getShop_code())) {
              found=true;
              break;
          }
      }
      if (found) {
          
      }
          st.setShop_name( shop_name);
          st.setShop_brunch( shop_brunch);
          st.setShop_address( shop_address);
          
         
      }

public static void delete_store(String shop_code) {
      store st=null;
      Boolean found=false;
      Iterator <store> itr = store.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(shop_code.equals(st.getShop_code())) {
              found=true;
              break;
          }
      }
      if (found) {store.remove(st);}
      }
    
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
    public static void list_store() {
      store st;
      Iterator <store> itr = store.iterator();
      System.out.printf("\n %15s %15s %15s %15s ",
              "shop name","shop brunch", "shop code","shop address");
        draw_line(70);
        
      while (itr.hasNext()) {
          st = itr.next(); 
          System.out.printf("\n %15s %15s %15s %15s ",
              st.getShop_name(), st.getShop_brunch(), st.getShop_code(),st.getShop_address());
      }
      draw_line(70);
        
    }
}
    
    
    

