/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlling_the_products;

import Controlling_the_products.person;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static Controlling_the_products.person.company_name;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import project.shooping.PaymentFrame;
import project.shooping.ProductFrame;

/**
 *
 * @author DELL
 */
public class Company extends person{
     public boolean Add_product_status=false;
     
     public void Registeration(String name,String email,String address,String phone,String password,String CompanyName){
               try {
                     super.company_name=CompanyName;
                     Connection myConn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
                    Statement mystamt=myConn.createStatement();
                    ResultSet myRs=mystamt.executeQuery("select*from seller");
                     while(myRs.next()){if(myRs.getString("UserName")==name&&myRs.getString("email")==email){status_if_data_in_table=true;}}
                         name="'"+name+"'";
                        email="'"+email+"'";
                        address="'"+address+"'";
                         password="'"+password+"'";
                        CompanyName="'"+CompanyName+"'";
                         phone="'"+phone+"'";
                     String sql="insert into seller"+"(Phone, CompanyName, UserName, Password, Address, email)"+"values ("+phone+","+CompanyName+","+name+","+password+","+address+","+email+")";
                    mystamt.executeUpdate(sql); 
                 
             } catch (SQLException ex) {
                 super.status_if_data_in_table=true;
                 Logger.getLogger(person.class.getName()).log(Level.SEVERE, null, ex);
                 
             }
    
    }
     //////////////////////////////////Viewing the add product display////////////////////////////////////////
     
     
     ///This Information of the product will be added 
     String Information,Price_Of_Product,type_selected;
     InputStream in_of_icon;
     
     
     /////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public void display_add_product(JPanel jPanel2,JScrollPane jScrollPane1){
      String comp_name= super.company_name;
      Font font = new Font(Font.SERIF, Font.BOLD, 20);
        /////////////////////////////////////////This part is the desgin of the checkout part in the cart
        JTextField tx=new JTextField("-----------------------------------------------------------------------------------------------------------");
        tx.setFont(font);
        tx.setEditable(false);
        tx.setBackground(new Color(0,0,0));
        tx.setBounds(10,10,jPanel2.getWidth(),10);
        jPanel2.add(tx);
        
        
        JTextField tx2=new JTextField("Please Insert The Product Information in Details");
        tx2.setFont(font);
        tx2.setEditable(false);
        tx2.setBorder(BorderFactory.createEmptyBorder());
        tx2.setBounds(20,20,jPanel2.getWidth()-400,30);
        jPanel2.add(tx2);
        JTextField tx22=new JTextField();
        tx22.setFont(font);
        tx22.setBounds(20,50,jPanel2.getWidth()-400,60);
        jPanel2.add(tx22);
        
        
        
        
        JTextField tx3=new JTextField("Please Insert The Product Price");
        tx3.setFont(font);
        tx3.setEditable(false);
        tx3.setBorder(BorderFactory.createEmptyBorder());
        tx3.setBounds(20,120,jPanel2.getWidth()-1000,30);
        jPanel2.add(tx3);
        JTextField tx33=new JTextField();
        tx33.setFont(font);
        tx33.setBounds(20,150,jPanel2.getWidth()-800,30);
        jPanel2.add(tx33);
        
        
        
        
        JTextField tx4=new JTextField("Please Choose The Product Icon");
        tx4.setFont(font);
        tx4.setEditable(false);
        tx4.setBorder(BorderFactory.createEmptyBorder());
        tx4.setBounds(20,210,jPanel2.getWidth()-1000,30);
        jPanel2.add(tx4);
        JFileChooser filechooser=new JFileChooser();
        filechooser.setBounds(20, 240, 700, 500);
        jPanel2.add(filechooser);
         
        
        
        JTextField tx5=new JTextField("Please Choose The Product Type");
        tx5.setFont(font);
        tx5.setEditable(false);
        tx5.setBorder(BorderFactory.createEmptyBorder());
        tx5.setBounds(20,780,jPanel2.getWidth()-1000,30);
        jPanel2.add(tx5);
         String country[]={"headphones","mobilephones","laptops","tv"};        
         JComboBox cb=new JComboBox(country);    
         cb.setBounds(20, 820,120,30);  
         jPanel2.add(cb);
      
         
         
          /// The button to Add product
        JButton b2=new JButton("Add the Product");//create button of add cart
        b2.setIcon(getImageIcon(new File("E:\\My-Github\\ShoopingApp-JavaSwing\\Project-shooping\\src\\Controlling_the_products\\icons8-add-to-cart-40.png")));
        b2.setBackground(new Color(109,82,159));
        b2.setBounds(new Rectangle(20,860,211,40));//state the boundry
        b2.addActionListener(
        new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
                              Information=tx22.getText();
                              type_selected=(String) cb.getItemAt(cb.getSelectedIndex());
                              Price_Of_Product=tx33.getText();
                              try {
                               in_of_icon = new FileInputStream(filechooser.getSelectedFile().getPath());
                                 
                                } catch (FileNotFoundException ex) {
                                   JOptionPane.showMessageDialog(jPanel2, "You not choose correct Icon");

                                 }
                                   add_product(jPanel2);
                                 }

                                 }

        );
        jPanel2.add(b2);
 
     }
     
     public void add_product(JPanel jPanel2 )
     {  try {
                            Random Rand=new Random();
                            int id=Rand.nextInt(100000);
                            Connection myConn;
                            myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
                            PreparedStatement mystamt1=null;
                                mystamt1=myConn.prepareStatement("insert into "+type_selected+" (Id, Info, Price, PriceSymbol, Image,CompanyName) values(?,?,?,?,?,?)");
                                   mystamt1.setInt(1, id);
                                   mystamt1.setString(2, Information);
                                   mystamt1.setString(3, Price_Of_Product);
                                   mystamt1.setString(4,"EGP");
                                   mystamt1.setBlob(5, in_of_icon);
                                   mystamt1.setString(6,super.company_name);
                                   mystamt1.executeUpdate();
                                JOptionPane.showMessageDialog(jPanel2, "You Add the product succesufly");

                        } catch (SQLException ex) {
                            Add_product_status=true;
                            JOptionPane.showMessageDialog(jPanel2, "There are problem in your data");
                            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
                        }         

     
     }

      /////////////////////////////////Reading the image from the file to can set the icon of the button add to cart 
         private ImageIcon getImageIcon(File f)
        {
           ImageIcon ii = null;                //not initialized  
        try
        {
            Image im = ImageIO.read(f);
            ii = new ImageIcon(im);
        }
        catch(IOException i)
        {i.printStackTrace();}
        finally
        {return ii;}
    
        }    
     

     public void vieew_my_product(JPanel jPanel2,JScrollPane jScrollPane1){

         
      Font font = new Font(Font.SERIF, Font.BOLD, 20);
      int CounterHorizontal=0,CounterVertical=0;
            /////////////////////////////////Viewing the Images ///////////////////////////////////////////////////////////////////
        try {
             ArrayList<Image> images=Getting_images("Image");
             for(int i=0;i<images.size();i++){ 
                    if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40; } // this to can view in grid form 
                    JLabel label=new JLabel(); //Create label to contains this icon
                    label.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical,250,242));
                    Image myImg=images.get(i).getScaledInstance(label.getWidth()-50, label.getHeight()-120,Image.SCALE_SMOOTH);//scale the icon 
                    ImageIcon newim=new ImageIcon(myImg);//load the image to icon 
                    label.setIcon(newim);// add the icon to 
                    jPanel2.add(label); //adding the label to panel 
                    CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
                    jPanel2.setPreferredSize(new Dimension(jScrollPane1.getWidth(),jScrollPane1.getHeight()+CounterVertical)); //This for extends the panel 
                    }
         
 
        } catch (SQLException ex) {
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
        }
        



        
        /////////////////////////////////Viewing the Informations ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
             
            ArrayList<String> info=Getting_info("Info");
           for(int i=0;i<info.size();i++){       
                 
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40;} // this to can view in grid form 

             JTextArea txt=new JTextArea();
             txt.setEditable(false);
             txt.setBackground(new Color(109,82,159));
             txt.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+200,211,60));
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
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        
        
        
        
        
        
        
        
         /////////////////////////////////Viewing the Buttons(remove from store) ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
            int tab=0;
          
           ArrayList<String> info=Getting_info("Info");
           ArrayList<String> price=Getting_info("Price");
           ArrayList<Integer> id=Getting_info_int("Id");
           for(int i=0;i<info.size();i++){    
             final int index = i;
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40;} // this to can view in grid form 
              JButton b1=new JButton("Remove From Store");//create button of add cart
              b1.setIcon(getImageIcon(new File("E:\\My-Github\\ShoopingApp-JavaSwing\\Project-shooping\\src\\Controlling_the_products\\icons8-add-to-cart-40.png")));
              b1.setBackground(new Color(109,82,159));
              b1.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+263,211,40));//state the boundry
              b1.addActionListener(new ActionListener()
                        {
                         
                          public void actionPerformed (ActionEvent e) { 
                          
                            String table_choose=get_which_table(id.get(index));
                            if(table_choose.equals("null")){  JOptionPane.showMessageDialog(jPanel2, "The product are not in the store refresh and try again");}
                            else{delete_product(id.get(index),table_choose,jPanel2);}          
                          }
                        });
             CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
              jPanel2.add(b1);
             

       }
           
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        ////////////////////////////////////////Drawing the price information/////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
           int tab=0;

           ArrayList<String> price=Getting_info("Price");
           for(int i=0;i<price.size();i++){    
               final int index = i;
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40;} // this to can view in grid form
              JLabel l1=new JLabel("Price:"+price.get(index));//label of price
              l1.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+295,220,40));//seting label above the button
              l1.setFont(font);
              l1.setBackground(new Color(109,82,159));
              CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
               jPanel2.add(l1);
            }
          
          } catch (SQLException ex) {
             Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
         }
      
        
        
        
     }         
     
     
     
///////////function to geeting the image of any table from data base in array list  asn icon to added to the tabel
 public ArrayList Getting_images(String col) throws SQLException{
     ///////////////////////////connection to database///////////////////////////////////////////////////////////////
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                   "SELECT " +col+ " FROM " + "tv" + " where CompanyName='"+super.company_name+"'"
                            + " union" +" SELECT " +col+ " FROM " + "laptops" + " where CompanyName='"+super.company_name+"'" 
                            + " union" +" SELECT " +col+ " FROM " + "mobilephones" + " where CompanyName='"+super.company_name+"'" 
                            + " union" +" SELECT " +col+ " FROM " + "headphones" + " where CompanyName='"+super.company_name+"'" 
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
     //function to getting the coloum for any table in data base in arralist to retun the strings only
    
  public  ArrayList Getting_info(String col) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                   "SELECT " +col+ " FROM " + "tv" + " where CompanyName='"+super.company_name+"'"
                            + " union" +" SELECT " +col+ " FROM " + "laptops" + " where CompanyName='"+super.company_name +"'"
                            + " union" +" SELECT " +col+ " FROM " + "mobilephones" + " where CompanyName='"+super.company_name+"'" 
                            + " union" +" SELECT " +col+ " FROM " + "headphones" + " where CompanyName='"+super.company_name +"'"
            );
            ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getString(1));
            }
            System.out.println(Info.size());
          return Info;
  
  }   
         
    //function to getting the coloum for any table in data base in arralist to retun the strings only
    
 public  ArrayList Getting_info_int(String col) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    
                            "SELECT " +col+ " FROM " + "tv" + " where CompanyName='"+super.company_name+"'"
                            + " union" +" SELECT " +col+ " FROM " + "laptops" + " where CompanyName='"+super.company_name+"'" 
                            + " union" +" SELECT " +col+ " FROM " + "mobilephones" + " where CompanyName='"+super.company_name +"'"
                            + " union" +" SELECT " +col+ " FROM " + "headphones" + " where CompanyName='"+super.company_name +"'"
                    
            );
            ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getInt(1));
            }
            System.out.println(Info.size());
          return Info;
  
  }

    
 /////This function sql statment of delete the product 
 public void delete_product(int Id,String table,JPanel jPanel2){
         try {
             Connection myConn;
             myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
             Statement mystamt=myConn.createStatement();
             String sql="delete from "+table+" where Id="+Id;
             int rowAffected=mystamt.executeUpdate(sql);
             System.out.println(rowAffected);
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(jPanel2, "There are Problem While delete the product Try again after refresh");
             Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
         }
 
 
 
 
 }
 String get_which_table(int Id){
   try {
         
          
             Connection myConn;
             myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
             Statement mystamt=myConn.createStatement();
             ResultSet myRs=mystamt.executeQuery(
                         "select distinct 'tv' as tablename from tv where Id="+Id
                                 +" union "+"select distinct 'mobilephones' as tablename from mobilephones where Id="+Id
                                    +" union "+"select distinct 'headphones' as tablename from headphones where Id="+Id
                                     +" union "+"select distinct 'laptops' as tablename from laptops where Id="+Id
             ); 
               while(myRs.next()){ return myRs.getString(1);}
             
         } catch (SQLException ex) {
             Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
         }
 
    return "null";
         
 } 

    public void Add_products(String info, String price, String symbol, InputStream in, String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void vieew_my_product(JPanel p1, JLayeredPane layerd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }






}
