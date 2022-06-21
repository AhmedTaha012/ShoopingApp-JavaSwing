package Controlling_the_products;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class person {
     public boolean status_if_data_in_table=false;
     static public boolean seller_is_login=false;
     static public boolean user_is_login=false;
     public static String company_name;
     public  static String user_name;
     //==Regestriation Function takes the inputs from gui and add it to data base//
     public void Registeration(String name,String email,String address,String area,String phone,String password){
         //First Check account type 1 for customer 2 for seller 3 for shipping
         
         
             try {
                 Connection myConn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
                 Statement mystamt=myConn.createStatement();
                 name="'"+name+"'";
                 email="'"+email+"'";
                 address="'"+address+"'";
                 area="'"+area+"'";
                 password="'"+password+"'";
                 phone="'"+phone+"'";
                 String sql="insert into customer"+"(Email, UserName, Password, Address, Area, PhoneNumber)"+"values ("+email+","+name+","+password+","+address+","+area+","+phone+")";
                 mystamt.executeUpdate(sql); 
                 
             } 
             catch (Exception ex) {
                 status_if_data_in_table=true;
                 Logger.getLogger(person.class.getName()).log(Level.SEVERE, null, ex);
                 
             }
            
         
         
  
     }
    
            
     public static void login(String input,String password){
      String UserName,Email,Password,table;
        UserName=input;
        Email=input;
        Password=password;
        table="seller";
         try {
             Connection myConn;
             myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
              Statement mystamt=myConn.createStatement();
              ResultSet myRs3=mystamt.executeQuery(
                   "SELECT DISTINCT * FROM "+table+" where ( UserName like '%"+UserName+"%' or Email like '%"+Email+"%' ) And (Password like '%"+Password+"%')"
              );
             if(myRs3.next()){
                 System.out.println("Exist in seller");
                 if((UserName.equals(myRs3.getString("UserName"))|| Email.equals(myRs3.getString("Email"))) && Password.equals(myRs3.getString("Password"))){
                    seller_is_login=true;
                    user_is_login=false;
                    company_name=myRs3.getString("CompanyName");
                 
                 }
                 else{
                     seller_is_login=false;
                     user_is_login=false;
                 
                 }

                
             }
             else{
                 table="customer";
              ResultSet myRs4=mystamt.executeQuery(
                   "SELECT DISTINCT * FROM "+table+" where ( UserName like '%"+UserName+"%' or Email like '%"+Email+"%' ) And (Password like '%"+Password+"%')"
              );
               if(myRs4.next()){
                    if((UserName.equals(myRs4.getString("UserName"))|| Email.equals(myRs4.getString("Email"))) && Password.equals(myRs4.getString("Password"))){
                   System.out.println("Exist in customer");
                  seller_is_login=false;
                  user_is_login=true;
                  user_name=myRs4.getString("UserName");
                  System.out.print(user_name);
                    }
                    else{
                    
                         seller_is_login=false;
                         user_is_login=false;
                    
                    }
               }
               else{
                   System.out.println("Not exitst in both");
                   seller_is_login=false;
                   user_is_login=false;
               }
             
             
             }
               
            
         }catch (SQLException ex) {
             Logger.getLogger(person.class.getName()).log(Level.SEVERE, null, ex);
              seller_is_login=false;
              user_is_login=false;
         }
         

     }
    
   
     
     public void view_your_information(JPanel jPanel2,JScrollPane jScrollPane1) throws SQLException{
           Font font = new Font(Font.SERIF, Font.BOLD, 20);
             /////////////////////////////////////////This part is the desgin of the checkout part in the cart
        JTextField tx=new JTextField("-----------------------------------------------------------------------------------------------------------");
        tx.setFont(font);
        tx.setEditable(false);
        tx.setBackground(new Color(0,0,0));
        tx.setBounds(10,10,jPanel2.getWidth(),10);
        jPanel2.add(tx);
        
        if(Getting_info("UserName")!=null){
        ArrayList<String> info=Getting_info("UserName");
        JTextField tx2=new JTextField("Your UserName is :"+info.get(0));
        tx2.setFont(font);
        tx2.setEditable(false);
        tx2.setBorder(BorderFactory.createEmptyBorder());
        tx2.setBounds(20,20,jPanel2.getWidth()-400,30);
        jPanel2.add(tx2);
        }
        
       if(Getting_info("Email")!=null){
        ArrayList<String> info=Getting_info("Email");
        JTextField tx2=new JTextField("Your Email is :"+info.get(0));
        tx2.setFont(font);
        tx2.setEditable(false);
        tx2.setBorder(BorderFactory.createEmptyBorder());
        tx2.setBounds(20,60,jPanel2.getWidth()-400,30);
        jPanel2.add(tx2);
        }
        if(user_is_login){
        if(Getting_info("PhoneNumber")!=null){
        ArrayList<String> info=Getting_info("PhoneNumber");
        JTextField tx2=new JTextField("Your PhoneNumber is :"+info.get(0));
        tx2.setFont(font);
        tx2.setEditable(false);
        tx2.setBorder(BorderFactory.createEmptyBorder());
        tx2.setBounds(20,100,jPanel2.getWidth()-400,30);
        jPanel2.add(tx2);
        }
        }
        else if(seller_is_login){
        if(Getting_info("Phone")!=null){
        ArrayList<String> info=Getting_info("Phone");
        JTextField tx2=new JTextField("Your PhoneNumber is :"+info.get(0));
        tx2.setFont(font);
        tx2.setEditable(false);
        tx2.setBorder(BorderFactory.createEmptyBorder());
        tx2.setBounds(20,100,jPanel2.getWidth()-400,30);
        jPanel2.add(tx2);
        }
        
        
        
        }
        
        if(Getting_info("Address")!=null){
        ArrayList<String> info=Getting_info("Address");
        JTextField tx2=new JTextField("Your Address is :"+info.get(0));
        tx2.setFont(font);
        tx2.setEditable(false);
        tx2.setBorder(BorderFactory.createEmptyBorder());
        tx2.setBounds(20,140,jPanel2.getWidth()-400,30);
        jPanel2.add(tx2);
        }
        
//        if((Getting_info("Area")!=null)){
//            if(user_is_login){
//        ArrayList<String> info=Getting_info("Area");
//        JTextField tx2=new JTextField("Your Area is :"+info.get(0));
//        tx2.setFont(font);
//        tx2.setEditable(false);
//        tx2.setBorder(BorderFactory.createEmptyBorder());
//        tx2.setBounds(20,200,jPanel2.getWidth()-400,30);
//        jPanel2.add(tx2);
//            }
//        }
        
      
        
        
        
        
        
        
        
        
        
        
        
                
        
       
     
     
     }
     
     
     
     
     
     
       public  ArrayList Getting_info(String col) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            if (user_is_login){
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT DISTINCT "+col+ " FROM customer where UserName='"+user_name+"'"
            );
             ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getString(1));
            }
            System.out.println(Info.size());
            return Info;
            }
            else if(seller_is_login){
                 ResultSet myRs=mystamt.executeQuery(
                    "SELECT DISTINCT "+col+ " FROM seller where CompanyName='"+company_name+"'"
            );
             ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getString(1));
            }
            System.out.println(Info.size());
            return Info;

            }
            
           return null;
  
  }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}





     
     
     
     
     
     
     
     
     
     
     
     
     
     
    

