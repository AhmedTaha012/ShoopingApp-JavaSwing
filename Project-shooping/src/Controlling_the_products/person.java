package Controlling_the_products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class person {
     public boolean status_if_data_in_table=false;
     static public boolean seller_is_login=false;
     static public boolean user_is_login=false;
     public static String company_name="elgamal";
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
        UserName="'"+input+"'";
        Email="'"+input+"'";
        Password="'"+password+"'";
        table="seller";
         try {
             Connection myConn;
             myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
              Statement mystamt=myConn.createStatement();
              ResultSet myRs3=mystamt.executeQuery(
               "SELECT DISTINCT * FROM "+table+" where ( UserName="+UserName+" or Email="+Email+") And (Password="+Password+")"
              );
             if(myRs3.next()){
                 System.out.println("Exist in seller");
                 seller_is_login=true;
                user_is_login=false;
                company_name=myRs3.getString("CompanyName");
             }
             else{
                 table="customer";
              ResultSet myRs4=mystamt.executeQuery(
               "SELECT DISTINCT * FROM "+table+" where ( UserName="+UserName+" or Email="+Email+") And (Password="+Password+")"
              );
               if(myRs4.next()){
                   System.out.println("Exist in customer");
                  seller_is_login=false;
                  user_is_login=true;
                  user_name=myRs4.getString("UserName");
     
               }
               else{
                   System.out.println("Not exitst in both");
                   seller_is_login=false;
                   user_is_login=false;
               }
             
             
             }
               
            
         }catch (SQLException ex) {
             Logger.getLogger(person.class.getName()).log(Level.SEVERE, null, ex);
         }
         

     }
    
   
}





     
     
     
     
     
     
     
     
     
     
     
     
     
     
    

