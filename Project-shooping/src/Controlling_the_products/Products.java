/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlling_the_products;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import project.shooping.Trying;

/**
 *
 * @author DELL
 */
public class Products {
    
    //function to getting the coloum for any table in data base in arralist
    
  public  ArrayList Getting_info(String col,String tab) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT "+col+ " FROM "+tab
            );
            ArrayList<String > Info=new ArrayList<String>();
            while(myRs.next()){
              Info.add(myRs.getString(1));
            }
            System.out.println(Info.size());
          return Info;
  
  }
  
  
  
    ///////////function to geeting the image of any table from data base in array list 
 public ArrayList Getting_images(String col,String tab) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT "+col+ " FROM "+tab
            );
            ArrayList<Image> images=new ArrayList<Image>();
             while(myRs.next()){
              byte []img=myRs.getBytes(1);
              ImageIcon image=new ImageIcon(img); //Load Imaga as Icon
              Image im=image.getImage(); //Getting Image
              images.add(im);
            }
             System.out.println(images.size());
             return images;
 }
    
 
 
 
 
  public  void Drawing_on_Panel(JPanel jPanel2,JScrollPane jScrollPane1,String table){
        

    int CounterHorizontal=0,CounterVertical=0;
  
    /////////////////////////////////Viewing the Images ///////////////////////////////////////////////////////////////////
        try {
             ArrayList<Image> images=Getting_images("Image",table);
             for(int i=0;i<images.size();i++){ 
                 
                    if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250;} // this to can view in grid form 
                    JLabel label=new JLabel();     //Create label to contains this icon
                    label.setBounds(new Rectangle(20+CounterHorizontal,5+CounterVertical,250,242));
                    Image myImg=images.get(i).getScaledInstance(label.getWidth()-50, label.getHeight()-120,Image.SCALE_SMOOTH);//scale the icon 
                    ImageIcon newim=new ImageIcon(myImg);//load the image to icon 
                    label.setIcon(newim);// add the icon to 
                    jPanel2.add(label); //adding the label to panel 
                    CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
                    jPanel2.setPreferredSize(new Dimension(jScrollPane1.getWidth(),jScrollPane1.getHeight()+CounterVertical)); //This for extends the panel 
                    
                    }
 
        } catch (SQLException ex) {
            Logger.getLogger(Trying.class.getName()).log(Level.SEVERE, null, ex);
        }
        /////////////////////////////////Viewing the Informations ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
            ArrayList<String> info=Getting_info("Info",table);
           for(int i=0;i<info.size();i++){       
                 
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250;} // this to can view in grid form 

             JTextArea txt=new JTextArea();
             txt.setEditable(false);
             txt.setBackground(new Color(109,82,159));
             txt.setBounds(new Rectangle(20+CounterHorizontal,5+CounterVertical+200,211,60));
             StringTokenizer st = new StringTokenizer(info.get(i),",/:");  
             int no_of_words=0,no_of_words2=0;
                while (st.hasMoreTokens()) {  
                   if(no_of_words==4){no_of_words=0; txt.append("\n"+st.nextToken(" "));}
                   else{txt.append(st.nextToken(" "));}
                   no_of_words++;
                   no_of_words2++;
                   if(no_of_words2==7){break;}
                }  
              CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
             jPanel2.add(txt);
           }
   
        } catch (SQLException ex) {
            Logger.getLogger(Trying.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     
     
     
     
     
     
 }
    
    
    
    
    
    
    
    
    
    
    
    
}
