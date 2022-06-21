package shopapp;
//importing needed libraries
import Controlling_the_products.person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

// This class is for shipping registration
public class ShippingCompany extends person{
    public void Registeration(String Name, String Email, String Address,String Phone,String Area){
         try {
                 Connection myConn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
                 Statement mystamt=myConn.createStatement();
                 Name="'"+Name+"'";
                 Email="'"+Email+"'";
                 Address="'"+Address+"'";
                 Area="'"+Area+"'";
                 Phone="'"+Phone+"'";
                 String sql="insert into shipping"+"(Name, Email, Address, Phone, Area)"+"values ("+Name+","+Email+","+Address+","+Phone+","+Area+")";
                 mystamt.executeUpdate(sql);     
             } catch (SQLException ex) {
                 super.status_if_data_in_table=true;
                 Logger.getLogger(person.class.getName()).log(Level.SEVERE, null, ex);   
             }
    }
    
}
