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
import java.io.File;
import java.io.IOException;
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
     public void Registeration(String name,String email,String address,String phone,String password,String CompanyName,int CompanyId ){
               try {
                     super.company_name=CompanyName;
                     Connection myConn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
                    Statement mystamt=myConn.createStatement();
                    ResultSet myRs=mystamt.executeQuery("select*from seller");
                     while(myRs.next()){if(myRs.getInt("SellerId")==CompanyId&&myRs.getString("UserName")==name&&myRs.getString("email")==email){status_if_data_in_table=true;}}
                         name="'"+name+"'";
                        email="'"+email+"'";
                        address="'"+address+"'";
                         password="'"+password+"'";
                        CompanyName="'"+CompanyName+"'";
                         phone="'"+phone+"'";
                     String sql="insert into seller"+"(SellerId, Phone, CompanyName, UserName, Password, Address, email)"+"values ("+CompanyId+","+phone+","+CompanyName+","+name+","+password+","+address+","+email+")";
                    mystamt.executeUpdate(sql); 
                 
             } catch (SQLException ex) {
                 super.status_if_data_in_table=true;
                 Logger.getLogger(person.class.getName()).log(Level.SEVERE, null, ex);
                 
             }
    
    }
     //////////////////////////////////Viewing the add product display////////////////////////////////////////
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
        b2.addActionListener(new ActionListener()
                        {
                         
                          public void actionPerformed (ActionEvent e, Component ProductFrame) { 
                         try {
                            Random Rand=new Random();
                            int id=Rand.nextInt(100000);
                            Connection myConn;
                            myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
                            PreparedStatement mystamt1=null;
                            if( cb.getItemAt(cb.getSelectedIndex()).equals("tv")){
                            mystamt1=myConn.prepareStatement("insert into "+ cb.getItemAt(cb.getSelectedIndex())+" (Id, Info, Price,Image,CompanyName) values(?,?,?,?,?)");
                               mystamt1.setInt(1, id);
                               mystamt1.setString(2, tx22.getText());
                               mystamt1.setString(3, "EGP"+tx33.getText());
                               InputStream in;
                               try {
                               in = new FileInputStream(filechooser.getSelectedFile().getPath());
                                 mystamt1.setBlob(4, in);
                                } catch (FileNotFoundException ex) {
                                 JOptionPane.showInternalMessageDialog(ProductFrame, "You forget chosse icon");
                                 Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
                                 System.out.print("ImHere5");
                                 }
                               mystamt1.setString(5, comp_name);
                               mystamt1.executeUpdate();
                            }
                            else{
                            mystamt1=myConn.prepareStatement("insert into "+ cb.getItemAt(cb.getSelectedIndex())+" (Id, Info, Price, PriceSymbol, Image,CompanyName) values(?,?,?,?,?,?)");
                                mystamt1.setInt(1, id);
                               mystamt1.setString(2, tx22.getText());
                               mystamt1.setString(3, tx33.getText());
                               InputStream in;
                               try {
                               in = new FileInputStream(filechooser.getSelectedFile().getPath());
                                 mystamt1.setBlob(4, in);
                                } catch (FileNotFoundException ex) {
                                 JOptionPane.showInternalMessageDialog(ProductFrame, "You forget chosse icon");
                                 Logger.getLogger(ProductFrame.class.getName()).log(Level.SEVERE, null, ex);
                                 System.out.print("ImHere4");
                                 }
                               mystamt1.setString(5, comp_name);
                               mystamt1.executeUpdate();
                               JOptionPane.showMessageDialog(ProductFrame, "You Add the product succesufly");
                            }

                        } catch (SQLException ex) {
                            Add_product_status=true;
                            System.out.print("ImHere3");
                            
                            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
                        }         
                              
                                       
                          }

             @Override
             public void actionPerformed(ActionEvent e) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

            
                        });
        
        
        
        jPanel2.add(b2);
     
     
     
     
     
     
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
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
//      public void Add_products(String info,String price,String symbol,InputStream in,String type ){
//         try {
//             Random Rand=new Random();
//             int id=Rand.nextInt(100000);
//             Connection myConn;
//             myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datausage","root","root99");
//             PreparedStatement mystamt1=null;
//             if(type.equals("tv")){
//             mystamt1=myConn.prepareStatement("insert into "+type+" (Id, Info, Price,Image,CompanyName) values(?,?,?,?,?)");
//                mystamt1.setInt(1, id);
//                mystamt1.setString(2, info);
//                mystamt1.setString(3, price);
//                mystamt1.setBlob(4, in);
//                mystamt1.setString(5, super.company_name);
//                mystamt1.executeUpdate();
//             }
//             else{
//             mystamt1=myConn.prepareStatement("insert into "+type+" (Id, Info, Price, PriceSymbol, Image,CompanyName) values(?,?,?,?,?,?)");
//                mystamt1.setInt(1, id);
//                mystamt1.setString(2, info);
//                mystamt1.setString(3, price);
//                mystamt1.setString(4, symbol);
//                mystamt1.setBlob(5, in);
//                mystamt1.setString(6, company_name);
//                mystamt1.executeUpdate();
//             }
//             
//         } catch (SQLException ex) {
//             Add_product_status=true;
//             Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
//         }
//     
//       
//     
//     }
     public void vieew_my_product(JPanel p1,JLayeredPane layerd){
         try {
            // TODO add your handling code here:
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            int countery=0;
            int counterx=0;
            String []element={"tv","laptops","mobilephones","headphones"};
            for (int i=0;i<4;i++){
                ResultSet myRs=mystamt.executeQuery("select * from "+element[i]);
                System.out.println(element[i]);
                while(myRs.next()){
                    if(super.company_name.equals(myRs.getString("CompanyName"))){
                        //label.setBounds(0,countery, 300, 242);
                        ////////////////////read Image///////////////////////////////
                        byte []img=myRs.getBytes("Image");
                        ImageIcon image=new ImageIcon(img);
                        Image im=image.getImage();
                        JLabel label=new JLabel(); //Creat label to contains this icon
                        //////////////////////////////////////////////////////////
                        //////////////////////////Draw the label///////////////// 
                        label.setBounds(layerd.getX()+10, layerd.getY()+10+countery, 250, 242);
                        Image myImg=im.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon newim=new ImageIcon(myImg);
                        label.setIcon(newim);
                        String elem=element[i];
                        /////////////////////////////////////////////////PUT INFO AND PRICE/////////////////////////////////
                        String info=myRs.getString("Info");
                        String price=myRs.getString("Price");
                        int Id=myRs.getInt("Id");
                        String Comapnyname=super.company_name;
                        JButton b1=new JButton("Modfiy");
                        counterx+=label.getHeight();
                        JTextArea t1=new JTextArea();
                        JTextArea t2=new JTextArea();
                        t1.setText(info);
                        t1.setBounds(label.getX()+label.getWidth()+10, label.getY(), 2000, 50);
                        t2.setText("Price:"+price+" EGP");
                        t2.setBounds(label.getX()+label.getWidth()+10, label.getY()+60, 2000, 50);
                        b1.setBounds(label.getX()+label.getWidth()+10,label.getY()+180,150,50);
                        JButton b2=new JButton("Save");
                        b2.setBounds(label.getX()+label.getWidth()+300,label.getY()+180,150,50);
                        p1.add(b2);
                        b1.addActionListener(new ActionListener()
                        {
                            
                          public void actionPerformed (ActionEvent e) {    
                                try {
                                    Company c3=new Company();
                                    String sql="delete from "+elem+" where Id="+Id;
                                    int rowAffected=mystamt.executeUpdate(sql);
                                    System.out.println(rowAffected);
                                    t1.setText("Remove this text then insert your product info");
                                    t2.setText("Remove this text then insert your product price the press sava");
                                    InputStream in;
                                    final JFileChooser fileChooser = new JFileChooser();
                                    String tx3;
                                    //JOptionPane.showMessageDialog(layerd,fileChooser,"Choosee your icon",4);
                                    //JOptionPane.showMessageDialog(fileChooser, "Choose the icon");
                                    JOptionPane.showInputDialog(fileChooser);
                                    tx3=JOptionPane.showInputDialog("Enter your price symbol");
                                    in = new FileInputStream(fileChooser.getSelectedFile().getPath());
                                    c3.save_button_action(b2, elem, t1, t2,in,tx3);
                                    System.out.println(fileChooser.getSelectedFile().getPath());
                                } catch (SQLException ex) {
                                    Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (FileNotFoundException ex) {
                                  Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
                              }
                                    }
                        });
                        
                       
                        t1.setBackground(Color.WHITE);
                        t2.setBackground(Color.WHITE);
                        Font font = new Font(Font.SERIF, Font.BOLD, 20);
                        t1.setFont(font);
                        t1.setBorder(BorderFactory.createEmptyBorder());
                        t2.setFont(font);
                        t2.setBorder(BorderFactory.createEmptyBorder());
                        p1.add(b1);
                        p1.add(t1);
                        p1.add(t2);
                        countery+=252;
                        p1.setPreferredSize(new Dimension(layerd.getX()+countery, layerd.getY()+countery+100));
                        p1.add(label);
        }}
        }
        }
            catch (SQLException ex) {
           
        }
     
     }
     
     
//     private void save_button_action(JButton b2,String elem,JTextArea t1,JTextArea t2,InputStream in,String tx3){
//           b2.addActionListener(new ActionListener(){ 
//                                        public void actionPerformed (ActionEvent e) {
//                                                Company c1=new Company();
//                                                System.out.println(elem);
//                                                String tx1= t1.getText();
//                                                String tx2 =t2.getText();
//                                                c1.Add_products(tx1, tx2,tx3, in, elem);
//                                            
//                                        }});
//     
//     
//     }
     
    
}
