
package dentistclinic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;


public class DentistClinic {
  public static List lstPatient, lstOperationType, lstAppointment,
                     lstOperation, lstReceipt;
    
    public static void main(String[] args) {
        //Defining the ArrayLists
        lstPatient = new ArrayList();
        lstOperationType = new ArrayList();
        lstAppointment = new ArrayList();
        lstOperation = new ArrayList();
        lstReceipt = new ArrayList();
        
        load_data();

        System.out.printf("\n\nQ1- Testing the method edit_Patient()");    
        edit_Patient(4, "Fatma", "Uluca", "(533) 845 7475", "EMU - Dormitory T, Famagusta");
        
        
        try {
        System.out.printf("\n\nQ2- Testing the method backup_Patient()");    
        backup_Patient();
        System.out.printf("\n>>> backup_Patient() is passed the test!");
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error in backup_Patient");
            System.out.printf("\n>>> backup_Patient() is NOT passed the test!");
        }
        
        System.out.printf("\n\nQ3- Testing the method list_Appointment()");
        list_Appointment();
        
        System.out.printf("\n\nQ4- Testing the method list_Operation()");
        list_Operation();
        
        System.out.printf("\n\nQ5- Testing the JFrame_AddPatient()");
        list_Patient();
        new JFrame_AddPatient().show();
        JOptionPane.showMessageDialog(null, "Press any key to continue");
        list_Patient();
        
        
        //test_patients();
        //test_OpertionTypes();
        //test_Appointment();
        //test_Receipt();
        //test_Operation();
        System.out.printf("\n");
    }

public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
}    
    
public static void load_data() {
        System.out.printf("\n Data for Class Patients are loading ... \n\n");
        add_Patient(1, "Ali Huseyin", "Faisal", "(533) 845 67845", "EMU - Dormitory X, Famagusta");
        add_Patient(2, "Ayse", "Kemaller", "(542) 882 8893", "EMU - Dormitory Z, Famagusta");
        add_Patient(3, "Mustafa", "Turgut", "(533) 844 6444", "EMU - Dormitory X, Famagusta");
        add_Patient(4, "Fatma", "Uluca", "(533) 845 7475", "EMU - Dormitory Z, Famagusta");
        add_Patient(5, "Mohammed", "Faisal", "(533) 844 6667", "EMU - Dormitory Y, Famagusta");
        add_Patient(6, "Jale", "Bilge", "(533) 845 7746", "EMU - Dormitory T, Famagusta");
        
        System.out.printf("\n Data for Class OperationType are loading ... \n\n");
        add_OperationType(1, "Opt-1", 100f);
        add_OperationType(2, "Opt-2", 175f);
        add_OperationType(3, "Opt-3", 250f);
        add_OperationType(4, "Opt-4", 500f);
        add_OperationType(5, "Opt-5", 750f);
        add_OperationType(6, "Opt-6", 1000f);

        System.out.printf("\n Data for Class Appointment are loading ... \n\n");
        add_Appointment(1, 1, 1, 5);
        add_Appointment(2, 3, 2, 3);
        add_Appointment(3, 5, 1, 7);
        add_Appointment(4, 1, 3, 2);
        add_Appointment(5, 2, 3, 4);
        
        System.out.printf("\n Data for Class Receipt are loading ... \n\n");
        add_Receipt(1, "12/06/2020", 100f);
        add_Receipt(2, "12/06/2020", 175f);
        add_Receipt(3, "12/06/2020", 150f);
        add_Receipt(4, "12/06/2020", 500f);
        add_Receipt(5, "12/06/2020", 250f);
        
        System.out.printf("\n Data for Class Operation are loading ... \n\n");
        add_Operation(1, 1, 1, 1);
        add_Operation(2, 2, 2, 2);
        add_Operation(3, 3, 3, 3);
        add_Operation(4, 4, 4, 4);
                                
}
    
/*****************************************************************************
 *    Patient Processes                                               *
******************************************************************************/

public static void test_patients() {
        try {
        System.out.printf("\n Tests for Class Patients\n\n");

        System.out.printf("\n List_Patient()\n\n");
        list_Patient();
        
        System.out.printf("\n Edit_student()\n\n");
        edit_Patient(4, "Fatma", "Uluca", "(533) 845 7475", "EMU - Dormitory T, Famagusta");
        
        System.out.printf("\n List_student()\n\n");
        list_Patient();
        
        System.out.printf("\n lstPatient Backuped\n\n");
        backup_Patient();
        
        System.out.printf("\n Delete_student()\n\n ");
        delete_Patient(4);
        
        System.out.printf("\n List_Patient\n\n ");
        list_Patient();
        
        System.out.printf("\n lstPatient retrieved\n\n ");
        retrieve_Patient();
        
        System.out.printf("\n List_Patient()\n\n");
        list_Patient();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error in Patient");
                }
}

public static void add_Patient(int pat_id, String pat_name, 
                               String pat_surname, String pat_telephone, 
                               String pat_address) {
            Patient pt =new Patient(pat_id, pat_name, pat_surname, 
                                     pat_telephone, pat_address);
            lstPatient.add(pt);
    }

/******************************************************************************
 * Q1. Complete the edit_Patient() method - 7 points 
*******************************************************************************/
public static void edit_Patient(int pat_id, String pat_name, 
                               String pat_surname, String pat_telephone, 
                               String pat_address) {
System.out.printf("\n Q1- edit_Patient() content is not ready yet !"); 













}

public static void delete_Patient(int pat_id) {
      Patient pt=null;
      Boolean found=false;
      Iterator <Patient> itr = lstPatient.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(pat_id==pt.getPat_id()) {
              found=true;
              break;
          }
      }
      if (found) lstPatient.remove(pt);
      }
    

    
public static void list_Patient() {
      Patient pt;
      Iterator <Patient> itr = lstPatient.iterator();
      System.out.printf("\n%10s %15s %15s %15s %20s",
              "Patient Id","Name", "Surname", 
              "Telephone","Address");
        draw_line(89);
        
      while (itr.hasNext()) {
          pt = itr.next(); 
          System.out.printf("\n%10s %15s %15s %15s %20s",
              pt.getPat_id(), pt.getPat_name(), pt.getPat_surname(),
              pt.getPat_telephone(), pt.getPat_address());
      }
      draw_line(89);
    }


public static void retrieve_Patient() throws IOException, ClassNotFoundException
    {
     File infile  = new File("patient.dat");
     FileInputStream infilestream = new FileInputStream(infile);
      try (ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
          lstPatient = (ArrayList)inObjectStream.readObject();
          inObjectStream.close();
      }
     
    }

/*******************************************************************************
 * Question 2. Complete the method backup_Patient() - 8 points
 ******************************************************************************/
    public static void backup_Patient() throws FileNotFoundException, IOException 
    {
     System.out.printf("\n Q2- backup_Patient() content is not ready yet !"); 

















    }
    
/*****************************************************************************
 *    Operation Type Processes                                               *
******************************************************************************/
public static void test_OpertionTypes() {
        try {
        System.out.printf("\n Tests for Class OperationType\n\n");
        
        System.out.printf("\n List_OperationType()\n\n");
        list_OperationType();
        
        System.out.printf("\n Edit_OperationType()\n\n");
        edit_OperationType(4, "Opt-4", 550f);
        
        System.out.printf("\n List_OperationType()\n\n");
        list_OperationType();
        
        System.out.printf("\n lstOperationType Backuped\n\n");
        backup_OperationType();
        
        System.out.printf("\n Delete_OperationType()\n\n ");
        delete_OperationType(4);
        
        System.out.printf("\n List_OperationType\n\n ");
        list_OperationType();
        
        System.out.printf("\n lstOperationType retrieved\n\n ");
        retrieve_OperationType();
        
        System.out.printf("\n List_OperationType()\n\n");
        list_OperationType();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error in OperationType");
                }
}


public static void add_OperationType(int opt_id, 
                                     String opt_name, 
                                     double opt_price) {
            OperationType pt =new OperationType(opt_id, opt_name, opt_price);
            lstOperationType.add(pt);
    }
    
public static void edit_OperationType(int opt_id, 
                                     String opt_name, 
                                     double opt_price) {
      OperationType pt=null;
      Boolean found=false;
      Iterator <OperationType> itr = lstOperationType.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(opt_id==pt.getOpt_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          pt.setOpt_name(opt_name);
          pt.setOpt_price(opt_price);
      }
}

public static void delete_OperationType(int opt_id) {
      OperationType pt=null;
      Boolean found=false;
      Iterator <OperationType> itr = lstOperationType.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(opt_id==pt.getOpt_id()) {
              found=true;
              break;
          }
      }
      if (found) lstOperationType.remove(pt);
      }
    

    
public static void list_OperationType() {
      OperationType pt;
      Iterator <OperationType> itr = lstOperationType.iterator();
      System.out.printf("\n%17s %15s %10s",
              "Operation Type Id","Name", "Price");
        draw_line(44);
        
      while (itr.hasNext()) {
          pt = itr.next(); 
          System.out.printf("\n%17s %15s %10s",
              pt.getOpt_id(), pt.getOpt_name(), pt.getOpt_price());
      }
      draw_line(44);
    }


public static void retrieve_OperationType() throws IOException, ClassNotFoundException
    {
     File infile  = new File("operationtype.dat");
     FileInputStream infilestream = new FileInputStream(infile);
      try (ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
          lstOperationType = (ArrayList)inObjectStream.readObject();
          inObjectStream.close();
      }
     
    }


    public static void backup_OperationType() throws FileNotFoundException, IOException 
    {
     File outfile  = new File("operationtype.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
      try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
          outObjectStream.writeObject(lstOperationType);
          outObjectStream.close();
      }
    }
    
/*****************************************************************************
 *    Appointment Processes                                               *
******************************************************************************/
public static void test_Appointment() {
        try {
        System.out.printf("\n Tests for Class Appointment\n\n");
        
        System.out.printf("\n List_OperationType()\n\n");
        list_Appointment();
        
        System.out.printf("\n Edit_OperationType()\n\n");
        edit_Appointment(4, 4, 3, 2);
        
        System.out.printf("\n List_OperationType()\n\n");
        list_Appointment();
        
        System.out.printf("\n lstOperationType Backuped\n\n");
        backup_Appointment();
        
        System.out.printf("\n Delete_OperationType()\n\n ");
        delete_Appointment(4);
        
        System.out.printf("\n List_OperationType\n\n ");
        list_Appointment();
        
        System.out.printf("\n lstOperationType retrieved\n\n ");
        retrieve_Appointment();
        
        System.out.printf("\n List_OperationType()\n\n");
        list_Appointment();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error in OperationType");
                }
}


public static void add_Appointment(int apt_id, int pat_id, 
                                   int apt_day, int apt_time) {
            Appointment pt =new Appointment(apt_id,pat_id, 
                                            apt_day, apt_time);
            lstAppointment.add(pt);
    }
    
public static void edit_Appointment(int apt_id, int pat_id, 
                                   int apt_day, int apt_time) {
      Appointment pt=null;
      Boolean found=false;
      Iterator <Appointment> itr = lstAppointment.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(apt_id==pt.getApt_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          pt.setPat_id(pat_id);
          pt.setApt_day(apt_day);
          pt.setApt_time(apt_time);          
      }
}

public static void delete_Appointment(int apt_id) {
      Appointment pt=null;
      Boolean found=false;
      Iterator <Appointment> itr = lstAppointment.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(apt_id==pt.getApt_id()) {
              found=true;
              break;
          }
      }
      if (found) lstAppointment.remove(pt);
      }
    


/******************************************************************************
 * Question 3 (10 points)
 *****************************************************************************/    
public static void list_Appointment() {
    System.out.printf("\n Q3- list_Appointment() content is not ready yet !"); 

    
    
    
    
    
    
    
    
    
    
    }


public static void retrieve_Appointment() throws IOException, ClassNotFoundException
    {
     File infile  = new File("appointment.dat");
     FileInputStream infilestream = new FileInputStream(infile);
      try (ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
          lstAppointment = (ArrayList)inObjectStream.readObject();
          inObjectStream.close();
      }
     
    }


    public static void backup_Appointment() throws FileNotFoundException, IOException 
    {
     File outfile  = new File("appointment.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
      try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
          outObjectStream.writeObject(lstAppointment);
          outObjectStream.close();
      }
    }
    
    
    
/*****************************************************************************
 *    Receipt Processes                                               *
******************************************************************************/
public static void test_Receipt() {
        try {
        System.out.printf("\n Tests for Class Receipt\n\n");
        
        System.out.printf("\n List_Receipt()\n\n");
        list_Receipt();
        
        System.out.printf("\n Edit_OperationType()\n\n");
        edit_Receipt(3, "12/06/2020", 550f);
        
        System.out.printf("\n List_OperationType()\n\n");
        list_Receipt();
        
        System.out.printf("\n lstOperationType Backuped\n\n");
        backup_Receipt();
        
        System.out.printf("\n Delete_OperationType()\n\n ");
        delete_Receipt(3);
        
        System.out.printf("\n List_OperationType\n\n ");
        list_Receipt();
        
        System.out.printf("\n lstOperationType retrieved\n\n ");
        retrieve_Receipt();
        
        System.out.printf("\n List_OperationType()\n\n");
        list_Receipt();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error in Receipt");
                }
}


public static void add_Receipt(int recs_id, String date, double payment) {
            Receipt pt =new Receipt(recs_id, date, payment);
            lstReceipt.add(pt);
    }
    
public static void edit_Receipt(int recs_id, String date, double payment) {
      Receipt pt=null;
      Boolean found=false;
      Iterator <Receipt> itr = lstReceipt.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(recs_id==pt.getRecs_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          pt.setDate(date);
          pt.setPayment(payment);        
      }
}

public static void delete_Receipt(int apt_id) {
      Receipt pt=null;
      Boolean found=false;
      Iterator <Receipt> itr = lstReceipt.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(apt_id==pt.getRecs_id()) {
              found=true;
              break;
          }
      }
      if (found) lstReceipt.remove(pt);
      }
    

public static void list_Receipt() {
      Receipt pt;
      Iterator <Receipt> itr = lstReceipt.iterator();
      System.out.printf("\n%10s %10s %10s",
              "Receipt Id","Date", "Paymeny");
        draw_line(32);
        
      while (itr.hasNext()) {
          pt = itr.next(); 
          System.out.printf("\n%10s %10s %10s",
              pt.getRecs_id(), pt.getDate(), pt.getPayment());
      }
      draw_line(32);
    }


public static void retrieve_Receipt() throws IOException, ClassNotFoundException
    {
     File infile  = new File("receipt.dat");
     FileInputStream infilestream = new FileInputStream(infile);
      try (ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
          lstReceipt = (ArrayList)inObjectStream.readObject();
          inObjectStream.close();
      }
     
    }


    public static void backup_Receipt() throws FileNotFoundException, IOException 
    {
     File outfile  = new File("receipt.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
      try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
          outObjectStream.writeObject(lstReceipt);
          outObjectStream.close();
      }
    }
    
    
/*****************************************************************************
 *    Operation Processes                                               *
******************************************************************************/
public static void test_Operation() {
        try {
        System.out.printf("\n Tests for Class Receipt\n\n");
        
        System.out.printf("\n List_Operation()\n\n");
        list_Operation();
        
        System.out.printf("\n Edit_Operation()\n\n");
        edit_Operation(3, 3, 3, 5);
        
        System.out.printf("\n List_Operation\n\n");
        list_Operation();
        
        System.out.printf("\n lstOperation Backuped\n\n");
        backup_Operation();
        
        System.out.printf("\n Delete_Operation()\n\n ");
        delete_Operation(3);
        
        System.out.printf("\n List_Operation\n\n ");
        list_Operation();
        
        System.out.printf("\n lstOperation retrieved\n\n ");
        retrieve_Operation();
        
        System.out.printf("\n List_Operation()\n\n");
        list_Operation();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error in Operation");
                }
}


public static void add_Operation(int op_id, int opt_id, int apt_id, int recs_id) {
            Operation pt =new Operation(op_id, opt_id, apt_id, recs_id);
            lstOperation.add(pt);
    }
    
public static void edit_Operation(int op_id, int opt_id, int apt_id, int recs_id) {
      Operation pt=null;
      Boolean found=false;
      Iterator <Operation> itr = lstOperation.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(op_id==pt.getOp_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          pt.setApt_id(apt_id);
          pt.setOpt_id(opt_id);
          pt.setRecs_id(recs_id);
      }
}

public static void delete_Operation(int op_id) {
      Operation pt=null;
      Boolean found=false;
      Iterator <Operation> itr = lstOperation.iterator();
      while (itr.hasNext()) {
          pt = itr.next(); 
          if(op_id==pt.getOp_id()) {
              found=true;
              break;
          }
      }
      if (found) lstOperation.remove(pt);
      }
    



/******************************************************************************
 *  QUESTION 5  (10 POINTS)
 *****************************************************************************/
public static void list_Operation() {
      System.out.printf("\n Q4- list_Operation() content is not ready yet !"); 

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    }


public static void retrieve_Operation() throws IOException, ClassNotFoundException
    {
     File infile  = new File("operation.dat");
     FileInputStream infilestream = new FileInputStream(infile);
      try (ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
          lstOperation = (ArrayList)inObjectStream.readObject();
          inObjectStream.close();
      }
     
    }


    public static void backup_Operation() throws FileNotFoundException, IOException 
    {
     File outfile  = new File("operation.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
      try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
          outObjectStream.writeObject(lstOperation);
          outObjectStream.close();
      }
    }
 
    
}
