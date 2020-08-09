/**
 * @author Sarbesh Lal Amatya
 * @version 2.0
 */

import javax.swing.*;// function for designing GUI
import java.awt.*;// function to define color
import java.awt.Font;// function to insert appropriate font size or font family
import java.awt.event.*;// function to actionize buttons
import java.util.*;// function to import class or method
import java.lang.*;// function to call core classes and interfaces
import java.io.*;// function to call unavailable class in package
/*
 * Creating class named RigoTechnology and adding ActionListener implementation
 */
public class RigoTechnology  implements ActionListener
{
    // declaring instance variable
    JFrame frm;
    
    // Label for Senior Developer
    JLabel lblTitle,lblPlatform,lblInterviewer,lblSalary,lblWorkingHours,lblContractPeriod,lblDeveloperName,lblJoiningDate,lblAdvanceSalary,lblStaffRoom,lblPlatformNo;
    
    // Label for Junior Developer
    JLabel lblTitle1,lblPlatform1,lblInterviewer1,lblSalary1,lblWorkingHours1,lblAppointed,lblTerminateDate,lblDeveloperName1,lblJoiningDate1,lblTerminateDate1,lblSpecialization,lblPlatformNo1;
    
    //TextField for Senior Developer
    JTextField txtPlatform,txtInterviewer,txtSalary,txtWorkingHours,txtContractPeriod,txtDeveloperName,txtJoiningDate,txtAdvanceSalary,txtStaffRoom,txtPlatformNo;
    
    //TextField for Junior Developer
    JTextField txtPlatform1,txtInterviewer1,txtSalary1,txtWorkingHours1,txtAppointed,txtTerminateDate,txtDeveloperName1,txtJoiningDate1,txtTerminateDate1, txtSpecialization, txtPlatformNo1;
    
    //For Buttons
    JButton HireS, HireJ, terminated, DisplayAll, aDDS, Clear, aDDJ;
    
    //For Panel
    JPanel panel;
    
    
    // main method that calls developerGUI() method
          
    public static void main(String[]args){
        new RigoTechnology().deloperGUI();
    }
    ArrayList<Developer> dev = new ArrayList <Developer>(); // Creating an array list
    /*
     * this method is to develop a complete GUI
     */
    
    public void deloperGUI(){
        // Creating Frame
        frm = new JFrame("RigoTechnology ");
        
        // Creating Panel
        panel = new JPanel();
               
        // Creating Label
        lblTitle = new JLabel("Senior Developer :");
        frm.add(lblTitle);
        lblTitle.setBounds(5,10,200,30); //x axis, y axis, width, height    
        
        //Setting Font Family, Font Type and Font Size
        Font f = new Font("Arial",Font.BOLD,16);
        lblTitle.setFont(f);
               
        lblPlatform=new JLabel("Platform :");
        frm.add(lblPlatform);
        lblPlatform.setBounds(5,40,75,23);
          
        //Creating Text Box as TextField to write over
        txtPlatform=new JTextField();
        frm.add(txtPlatform);
        txtPlatform.setBounds(115,40,200,23);  
                    
        lblInterviewer=new JLabel("Interviewer name :");
        frm.add(lblInterviewer);
        lblInterviewer.setBounds(350,40,120,23);
                      
        txtInterviewer=new JTextField();
        frm.add(txtInterviewer);
        txtInterviewer.setBounds(470,40,200,23); 
                
        lblSalary=new JLabel("Salary :");
        frm.add(lblSalary);
        lblSalary.setBounds(5,70,150,23);
                      
        txtSalary=new JTextField();
        frm.add(txtSalary);
        txtSalary.setBounds(115,70,200,23);
       
        lblWorkingHours=new JLabel("Working hours :");
        frm.add(lblWorkingHours);
        lblWorkingHours.setBounds(350,70,100,23);
        
        txtWorkingHours=new JTextField();
        frm.add(txtWorkingHours);
        txtWorkingHours.setBounds(470,70,200,23);
        
        lblContractPeriod=new JLabel("Contract period :");
        frm.add(lblContractPeriod);
        lblContractPeriod.setBounds(5,100,110,23);
        
        txtContractPeriod=new JTextField();
        frm.add(txtContractPeriod);
        txtContractPeriod.setBounds(115,100,200,23);
        
        //Creating Button
        aDDS  = new JButton("ADD");
        frm.add(aDDS);
        aDDS.setBackground(Color. LIGHT_GRAY); //Colourizing the Button
        aDDS.setBounds(115,130,85,23);
        aDDS.addActionListener(this);
        
        lblDeveloperName=new JLabel("Developer name :");
        frm.add(lblDeveloperName);
        lblDeveloperName.setBounds(5,160,100,23);
        
        txtDeveloperName=new JTextField();
        frm.add(txtDeveloperName);
        txtDeveloperName.setBounds(115,160,200,23);
        
        lblJoiningDate=new JLabel("Join Date :");
        frm.add(lblJoiningDate);
        lblJoiningDate.setBounds(350,160,85,23);
        
        txtJoiningDate=new JTextField();
        frm.add(txtJoiningDate);
        txtJoiningDate.setBounds(470,160,200,23);
        
        lblAdvanceSalary=new JLabel("Advance salary :");
        frm.add(lblAdvanceSalary);
        lblAdvanceSalary.setBounds(5,190,150,23);
        
        txtAdvanceSalary=new JTextField();
        frm.add(txtAdvanceSalary);
        txtAdvanceSalary.setBounds(115,190,200,23);
        
        lblStaffRoom=new JLabel("Staff Room no. :");
        frm.add(lblStaffRoom);
        lblStaffRoom.setBounds(350,190,150,23);
        
        txtStaffRoom=new JTextField();
        frm.add(txtStaffRoom);
        txtStaffRoom.setBounds(470,190,200,23);
        
        lblPlatformNo=new JLabel("Developer No. :");
        frm.add(lblPlatformNo);
        lblPlatformNo.setBounds(5,220,100,23);
        
        txtPlatformNo=new JTextField();
        frm.add(txtPlatformNo);
        txtPlatformNo.setBounds(115,220,200,23);
        
        HireS = new JButton("Hire");
        frm.add(HireS);
        HireS.setBounds(400,220,85,23);
        HireS.addActionListener(this);
        HireS.setBackground(Color. GREEN);
        
        terminated = new JButton("Terminate");
        frm.add(terminated);
        terminated.setBounds(520,220,100,23);
        terminated.addActionListener(this);
        terminated.setBackground(Color. RED);
        
        lblTitle1 = new JLabel("Junior Developer");
        frm.add(lblTitle1);
        lblTitle1.setBounds(5,250,400,30);
        
        Font b = new Font("Arial",Font.BOLD,16);
        lblTitle1.setFont(b);
               
        lblPlatform1=new JLabel("Platform :");
        frm.add(lblPlatform1);
        lblPlatform1.setBounds(5,280,75,23);
                      
        txtPlatform1=new JTextField();
        frm.add(txtPlatform1);
        txtPlatform1.setBounds(115,280,200,23); 
        
        lblInterviewer1=new JLabel("Interviewer name :");
        frm.add(lblInterviewer1);
        lblInterviewer1.setBounds(350,280,120,23);
                      
        txtInterviewer1=new JTextField();
        frm.add(txtInterviewer1);
        txtInterviewer1.setBounds(470,280,200,23);
        
        lblSalary1=new JLabel("Salary :");
        frm.add(lblSalary1);
        lblSalary1.setBounds(5,310,150,23);
                      
        txtSalary1=new JTextField();
        frm.add(txtSalary1);
        txtSalary1.setBounds(115,310,200,23);
        
        lblWorkingHours1=new JLabel("Working hours :");
        frm.add(lblWorkingHours1);
        lblWorkingHours1.setBounds(350,310,100,23);
        
        txtWorkingHours1=new JTextField();
        frm.add(txtWorkingHours1);
        txtWorkingHours1.setBounds(470,310,200,23);
                
        lblAppointed=new JLabel("Appointed By :");
        frm.add(lblAppointed);
        lblAppointed.setBounds(5,340,150,23);
        
        txtAppointed=new JTextField();
        frm.add(txtAppointed);
        txtAppointed.setBounds(115,340,200,23);
                
        lblTerminateDate=new JLabel("Termiante Date :");
        frm.add(lblTerminateDate);
        lblTerminateDate.setBounds(350,340,100,23);
        
        txtTerminateDate=new JTextField();
        frm.add(txtTerminateDate);
        txtTerminateDate.setBounds(470,340,200,23);
               
        aDDJ  = new JButton("ADD");
        frm.add(aDDJ);
        aDDJ.setBounds(115,370,85,23);
        aDDJ.addActionListener(this);
        aDDJ.setBackground(Color. LIGHT_GRAY);
        
        lblDeveloperName1=new JLabel("Developer name :");
        frm.add(lblDeveloperName1);
        lblDeveloperName1.setBounds(5,400,100,23);
        
        txtDeveloperName1=new JTextField();
        frm.add(txtDeveloperName1);
        txtDeveloperName1.setBounds(115,400,200,23);
                
        lblJoiningDate1=new JLabel("Join Date :");
        frm.add(lblJoiningDate1);
        lblJoiningDate1.setBounds(350,400,85,23);
        
        txtJoiningDate1=new JTextField();
        frm.add(txtJoiningDate1);
        txtJoiningDate1.setBounds(470,400,200,23);
        
        lblTerminateDate1=new JLabel("Terminate Date  :");
        frm.add(lblTerminateDate1);
        lblTerminateDate1.setBounds(5,430,100,23);
        
        txtTerminateDate1=new JTextField();
        frm.add(txtTerminateDate1);
        txtTerminateDate1.setBounds(115,430,200,23);
        
        lblSpecialization=new JLabel("Specialization :");
        frm.add(lblSpecialization);
        lblSpecialization.setBounds(350,430,85,23);
        
        txtSpecialization=new JTextField();
        frm.add(txtSpecialization);
        txtSpecialization.setBounds(470,430,200,23);
        
        lblPlatformNo1=new JLabel("Developer No. :");
        frm.add(lblPlatformNo1);
        lblPlatformNo1.setBounds(5,460,100,23);
        
        txtPlatformNo1=new JTextField();
        frm.add(txtPlatformNo1);
        txtPlatformNo1.setBounds(115,460,200,23);
                
        HireJ  = new JButton("Hire");
        frm.add(HireJ);
        HireJ.setBounds(535,490,85,23);
        HireJ.addActionListener(this);
        HireJ.setBackground(Color. GREEN); 
        
        DisplayAll  = new JButton("Display All");
        frm.add(DisplayAll );
        DisplayAll.setBounds(400,520,110,23);
        DisplayAll.addActionListener(this);
        DisplayAll.setBackground(Color. CYAN);
        
        Clear  = new JButton("Clear");
        frm.add(Clear );
        Clear.setBounds(520,520,100,23);
        Clear.addActionListener(this);
        Clear.setBackground(Color. YELLOW);
        
        frm.setSize(700,600); // 700 width and 600 height 
        frm.setLayout(null); // No layout managers
        frm.setResizable(true); // Frame size can be changed
        frm.setVisible(true); //Setting the Frame to be visible
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE); //Using CLOSE to exit from the Frame 
   }
   /*
    * *this method is a nonreturn type method that brings buttons in action
    *
    */
   public void actionPerformed(ActionEvent ae){
              
       if(ae.getSource() == Clear){ //To check whether the button perfomrs clear action
          txtPlatform.setText("");// setting text fields empty
          txtInterviewer.setText("");
          txtSalary.setText("");
          txtWorkingHours.setText("");
          txtContractPeriod.setText("");
          txtDeveloperName.setText("");
          txtJoiningDate.setText("");
          txtAdvanceSalary.setText("");
          txtStaffRoom.setText("");
          txtPlatformNo.setText("");
          txtPlatform1.setText("");
          txtInterviewer1.setText("");
          txtSalary1.setText("");
          txtWorkingHours1.setText("");
          txtAppointed.setText("");
          txtTerminateDate.setText("");
          txtDeveloperName1.setText("");
          txtJoiningDate1.setText("");
          txtTerminateDate1.setText("");
          txtSpecialization.setText("");
          txtPlatformNo1.setText("");         
       }
       
       else if(ae.getSource()== aDDS){
             
           String Platform= txtPlatform.getText();
           String Interviewer= txtInterviewer.getText();
           String Salary= txtSalary.getText();
           String WorkingHours= txtWorkingHours.getText();
           String ContractPeriod= txtContractPeriod.getText();
          
           try{
              if (Platform.equals("") && Interviewer.equals("") && WorkingHours.equals("") && Salary.equals("") && ContractPeriod.equals("")){
                  JOptionPane.showMessageDialog(null, "Text Field Is Empty");
              }else{
                    if (Platform.length()<=10 && Interviewer.length()<=25){ //length limit for platform and interviewer
               
                       int contractPeriod = Integer.parseInt(ContractPeriod); // conversion of string to integer            
                       int salary = Integer.parseInt(Salary);            
                       int workingHours = Integer.parseInt(WorkingHours);
                       // object creation.
                       SeniorDeveloper SD = new SeniorDeveloper(Platform, Interviewer, workingHours, salary,contractPeriod);// creating object of SeniorDeveloper constructor
                       dev.add(SD); 
                       JOptionPane.showMessageDialog(null,"The senior developer has been added");
                    }else{
                        JOptionPane.showMessageDialog(null,"The platform number is not avialable");
                    }
              }
          }catch(Exception f){
            JOptionPane.showMessageDialog(null,"Please Enter a Valid Value to be Added.","ERROR !", JOptionPane.ERROR_MESSAGE); 
          }
       }    
        if(ae.getSource()== aDDJ){
            
            String Platform1= txtPlatform1.getText(); // Declaring variable to store Information
            String Interviewer1= txtInterviewer1.getText();
            String Salary1= txtSalary1.getText();
            String WorkingHours1= txtWorkingHours1.getText();
            String Appointed= txtAppointed.getText();
            String TerminateDate= txtTerminateDate.getText();
           
           try{
               if (Platform1.equals("") && Interviewer1.equals("") && Salary1.equals("") && WorkingHours1.equals("") && Appointed.equals("") && TerminateDate.equals("")){
                   JOptionPane.showMessageDialog(null,"The text field is empty");
               }else{
                if (Platform1.length()<=10 && Interviewer1.length()<=25){
                    float salary1 = Float.parseFloat(Salary1);              
                    int workingHours1 = Integer.parseInt(WorkingHours1);
                    int terminateDate = Integer.parseInt(TerminateDate);
                   
                    JuniorDeveloper JD = new JuniorDeveloper(Platform1, Interviewer1, workingHours1,salary1,Appointed,TerminateDate);
                    dev.add(JD);
                    JOptionPane.showMessageDialog(null,"The junior developer has been added");
                }else{
                    JOptionPane.showMessageDialog(null,"The lenght is not valid"); 
                }
           
               } 
          }catch(Exception f){
              JOptionPane.showMessageDialog(null,"Please Enter a Valid Value to be Added.", "ERROR !", JOptionPane.ERROR_MESSAGE);
          }
       }
        
        if(ae.getSource()==HireS){
            String DeveloperName= txtDeveloperName.getText();
            String JoiningDate= txtJoiningDate.getText();
            String AdvanceSalary= txtAdvanceSalary.getText();
            String StaffRoom= txtStaffRoom.getText();
            String PlatformNo= txtPlatformNo.getText();
            
           try{
                if (DeveloperName.equals("") && JoiningDate.equals("") && AdvanceSalary.equals("") && StaffRoom.equals("") && PlatformNo.equals("")){
                    JOptionPane.showMessageDialog(null, "The Text Field Is Empty");
                }else{
                   int advanceSalary = Integer.parseInt(AdvanceSalary);
                   int SeniorplatformNo = Integer.parseInt(PlatformNo);
                   if ((SeniorplatformNo) >= 0 && (SeniorplatformNo)<= dev.size()){ // checking SeniorplatformNo
                       if (dev.get(SeniorplatformNo) instanceof SeniorDeveloper){
                            SeniorDeveloper SH = (SeniorDeveloper)dev.get(SeniorplatformNo); // object casting 
                            SH.hireDeveloper(DeveloperName,JoiningDate,advanceSalary,StaffRoom); // calling method to hire senior developer
                            JOptionPane.showMessageDialog(null, "The Senior Developer has been Hired");
                       }else{
                           JOptionPane.showMessageDialog(null, "The developer number is not of senior developer ");
                       }
                   }else{
                       JOptionPane.showMessageDialog(null, "The developer number is not available ");
                   }
                }
           }catch(Exception f){
                JOptionPane.showMessageDialog(null,"Please Enter Valid Value to Hire.", "ERROR", JOptionPane.ERROR_MESSAGE);
           }
        }
            
       else if(ae.getSource()==HireJ){
            String DeveloperName1= txtDeveloperName1.getText();
            String JoiningDate= txtJoiningDate.getText();
            String TerminateDate1= txtTerminateDate1.getText();
            String Specialization= txtSpecialization.getText();
            String PlatformNo1= txtPlatformNo1.getText();
       
         
             //System.out.println("jh");
            if(DeveloperName1.equals("") && JoiningDate.equals("") && TerminateDate1.equals("") && Specialization.equals("") && PlatformNo1.equals("")){
                JOptionPane.showMessageDialog(null, "Text Field Is Empty");
           
            }else{
            
                try{
                int Juniorplatformnumber= Integer.parseInt(PlatformNo1);
                if ((Juniorplatformnumber) >-1 && (Juniorplatformnumber)<= dev.size()){
                  if (dev.get(Juniorplatformnumber) instanceof JuniorDeveloper){ // checking instance of Junior Developer
                      JuniorDeveloper JH = (JuniorDeveloper)dev.get(Juniorplatformnumber);
                      JH.appointDeveloper(DeveloperName1, JoiningDate, TerminateDate1, Specialization);
                      JOptionPane.showMessageDialog(null, "The Junior Developer has been Hired");
                  }else{
                       JOptionPane.showMessageDialog(null, "The developer number is not of junior developer");
                  }
                }else{
                    JOptionPane.showMessageDialog(null, "The developer number is not avilable");
                }
            
               }catch(Exception f){
                 JOptionPane.showMessageDialog(null, "Please Enter Valid Value to Hire.", "ERROR", JOptionPane.ERROR_MESSAGE);
               }
        }
        
       }
        
      else if (ae.getSource()== terminated){
            String PlatformNo = txtPlatformNo.getText();
            try{
                if(PlatformNo.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter Platform Number");
                }else{
                    int SeniorPlatformNo = Integer.parseInt(PlatformNo);
                    if (dev.get(SeniorPlatformNo) instanceof SeniorDeveloper){
                        SeniorDeveloper T = (SeniorDeveloper)dev.get(SeniorPlatformNo);
                        T.contractTermination();
                        JOptionPane.showMessageDialog(null,"The Senior Developer has been terminated");
                    }
                }
            }
            catch(Exception f){
                JOptionPane.showMessageDialog(null,"Please Enter a Valid Value. ", "ERROR !", JOptionPane.ERROR_MESSAGE);
            }
      }
        
      else if(ae.getSource()==DisplayAll){ // To display all the text fields
          Object[] options= {"Senior","Junior"};
          int value = JOptionPane.showOptionDialog(null, "Senior or Junior","Display", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE ,null,options,options[0]);
                    
          if (value == JOptionPane.YES_OPTION){                    
                for(int j=0; j<dev.size(); j++){ // checking list size
                    if (dev.get(j) instanceof SeniorDeveloper){
                        SeniorDeveloper A = (SeniorDeveloper) dev.get(j) ;
                        A.display();
                    }
                }                              
                                   
          }else{
              for(int j=0; j<dev.size(); j++){
                  if (dev.get(j) instanceof JuniorDeveloper){
                      JuniorDeveloper B = (JuniorDeveloper) dev.get(j) ;
                      B.display();
                  }
                     
              }
          }
      }
   }
}
       
        
        
        