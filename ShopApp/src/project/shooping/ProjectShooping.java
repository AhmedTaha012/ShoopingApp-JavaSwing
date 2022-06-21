/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.shooping;

import Controlling_the_products.person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ProjectShooping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String UserName,Email,Password,table;
        UserName="'"+"souq"+"'";
        Email="'"+"souq@jumia.com"+"'";
        Password="'"+"yuyuy"+"'";
        table="seller";
         try {
             Connection myConn;
             myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
              Statement mystamt=myConn.createStatement();
              ResultSet myRs3=mystamt.executeQuery(
               "SELECT DISTINCT * FROM "+table+" where ( UserName="+UserName+" or Email="+Email+") And (Password="+Password+")"
              );
             if(myRs3.next()){System.out.println("Exist in seller");}
             else{
                 table="customer";
              ResultSet myRs4=mystamt.executeQuery(
               "SELECT DISTINCT * FROM "+table+" where ( UserName="+UserName+" or Email="+Email+") And (Password="+Password+")"
              );
               if(myRs4.next()){System.out.println("Exist in customer");}
               else{
                   System.out.println("Not exitst in both");
                   
               }
             
             
             }
               
            
         }catch (SQLException ex) {
             Logger.getLogger(person.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
