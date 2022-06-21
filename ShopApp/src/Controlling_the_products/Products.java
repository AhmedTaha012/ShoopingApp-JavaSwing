/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlling_the_products;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author DELL
 */
public class Products {
    
    
    
    //function to getting the coloum for any table in data base in arralist to retun the strings only
  public  ArrayList Getting_info(String col,String tab) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT  "+col+ " FROM "+tab
            );
            ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getString(1));
            }
            System.out.println(Info.size());
          return Info;
  
  }
  
  
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      //function to getting the coloum for any table in data base in arralist to retun the strings only
  public  ArrayList Getting_info_for_Search(String col,String searchtxt) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                   " SELECT "+col+" FROM datausage.tv where Info like '%"+searchtxt+ "%' "
                    + "union" + " SELECT "+col+" FROM datausage.mobilephones where Info like '%"+searchtxt+ "%'"
                    + "union" + " SELECT "+col+" FROM datausage.laptops where Info like '%"+searchtxt+ "%'"
                    + "union" + " SELECT "+col+" FROM datausage.headphones where Info like '%"+searchtxt+ "%'"
            );
            ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getString(1));
            }
            System.out.println(Info.size());
          return Info;
  
  }

  
  
  
  //function to getting the coloum for any table in data base in arralist to retun the strings only
    
 public  ArrayList Getting_info_int(String col,String tab) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT  "+col+ " FROM "+tab
            );
            ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getInt(1));
            }
            System.out.println(Info.size());
          return Info;
  
  }
 
 
  public  ArrayList Getting_info_int_for_search(String col,String searchtxt) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                   " SELECT "+col+" FROM datausage.tv where Info like '%"+searchtxt+ "%' "
                    + "union" + " SELECT "+col+" FROM datausage.mobilephones where Info like '%"+searchtxt+ "%'"
                    + "union" + " SELECT "+col+" FROM datausage.laptops where Info like '%"+searchtxt+ "%'"
                    + "union" + " SELECT "+col+" FROM datausage.headphones where Info like '%"+searchtxt+ "%'"
            );
            ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getInt(1));
            }
            System.out.println(Info.size());
          return Info;
  
  }
 
 
 
 
    ///////////function to geeting the image of any table from data base in array list  asn icon to added to the tabel
 public ArrayList Getting_images(String col,String tab) throws SQLException{
     ///////////////////////////connection to database///////////////////////////////////////////////////////////////
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT  "+col+ " FROM "+tab
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
  
 
 
 
 
 
 
     ///////////function to geeting the image of any table from data base in array list  asn icon to added to the tabel
 public ArrayList Getting_images_for_serach(String col,String searchtxt) throws SQLException{
     ///////////////////////////connection to database///////////////////////////////////////////////////////////////
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    " SELECT "+col+" FROM datausage.tv where Info like '%"+searchtxt+ "%' "
                    + "union" + " SELECT "+col+" FROM datausage.mobilephones where Info like '%"+searchtxt+ "%'"
                    + "union" + " SELECT "+col+" FROM datausage.laptops where Info like '%"+searchtxt+ "%'"
                    + "union" + " SELECT "+col+" FROM datausage.headphones where Info like '%"+searchtxt+ "%'"
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
 
 
 
 
 /////////////////getting the images as blob to can add them again to the data bas
 public ArrayList Getting_images_blob(String col,String tab) throws SQLException{
     ///////////////////////////connection to database///////////////////////////////////////////////////////////////
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT "+col+ " FROM "+tab
            );
            ArrayList<Blob> images=new ArrayList<Blob>();
             while(myRs.next()){
              Blob img2=(Blob) myRs.getBlob("Image");
              images.add(img2);
            }
             System.out.println(images.size());
             return images;
 }
 
 
  public  void Drawing_on_Panel(JPanel jPanel2,JScrollPane jScrollPane1,String table){
        int CounterHorizontal=0,CounterVertical=0;
         Font font = new Font(Font.SERIF, Font.BOLD, 20);      
    /////////////////////////////////Viewing the Images ///////////////////////////////////////////////////////////////////
        try {
             ArrayList<Image> images=Getting_images("Image",table);
             for(int i=0;i<images.size();i++){ 
                 
                    if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40;} // this to can view in grid form 
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
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /////////////////////////////////Viewing the Informations ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
            ArrayList<String> info=Getting_info("Info",table);
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
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
        
        
      /////////////////////////////////Viewing the Buttons(add to cart) ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
           
           ArrayList<String> info=Getting_info("Info",table);
           ArrayList<String> price=Getting_info("Price",table);
           ArrayList<Integer> id=Getting_info_int("Id",table);
           ArrayList<Image> images=Getting_images_blob("Image",table);
           for(int i=0;i<info.size();i++){    
               final int index = i;
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40;} // this to can view in grid form 
              JButton b1=new JButton("Add to Cart");//create button of add cart
              b1.setIcon(getImageIcon(new File("E:\\My-Github\\ShoopingApp-JavaSwing\\Project-shooping\\src\\Controlling_the_products\\icons8-add-to-cart-40.png")));
              b1.setBackground(new Color(109,82,159));
              b1.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+263,211,40));//state the boundry
              b1.addActionListener(new ActionListener()
                        {
                         
                          public void actionPerformed (ActionEvent e) { 
                                      Buyer br=new Buyer();
                                      br.Add_to_cart(id.get(index), info.get(index), price.get(index), (Blob) images.get(index));
                                       
                          }
                        });
             CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
              jPanel2.add(b1);
             

       }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        } 
      
        
        
        
           /////////////////////////////////Viewing the Prices Label///////////////////////////////////////////////////////////////////
        CounterHorizontal=0;
        CounterVertical=0;
        try {
           
           ArrayList<String> price=Getting_info("Price",table);
           for(int i=0;i<price.size();i++){    
               final int index = i;
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40;} // this to can view in grid form
              JLabel l1=new JLabel("Price:"+price.get(index)+"EGP");//label of price
              l1.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+295,220,40));//seting label above the button
              l1.setFont(font);
              l1.setBackground(new Color(109,82,159));
              CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
              jPanel2.add(l1);
           }
         } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }   

  }
  
  public void Drawing_Home_page(JPanel jPanel2,JScrollPane jScrollPane1){
      Font font = new Font(Font.SERIF, Font.BOLD, 20);
      String tables[]={"headphones","mobilephones","laptops","tv"};
        int CounterHorizontal=0,CounterVertical=0;
        

    ///////////////////////////////// Viewing the Images ///////////////////////////////////////////////////////////////////
        try {
             int tab=0;
             while(tab<tables.length){
             ArrayList<Image> images=Getting_images("Image",tables[tab]);
             for(int i=0;i<images.size();i++){ 
                    if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40; tab++; break;} // this to can view in grid form 
                    JLabel label=new JLabel(); //Create label to contains this icon
                    label.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical,250,242));
                    Image myImg=images.get(i).getScaledInstance(label.getWidth()-50, label.getHeight()-120,Image.SCALE_SMOOTH);//scale the icon 
                    ImageIcon newim=new ImageIcon(myImg);//load the image to icon 
                    label.setIcon(newim);// add the icon to 
                    jPanel2.add(label); //adding the label to panel 
                    CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
                    jPanel2.setPreferredSize(new Dimension(jScrollPane1.getWidth(),jScrollPane1.getHeight()+CounterVertical)); //This for extends the panel 
                    }
             }
 
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }

        /////////////////////////////////Viewing the Informations ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
             int tab=0;
             while(tab<tables.length){
            ArrayList<String> info=Getting_info("Info",tables[tab]);
           for(int i=0;i<info.size();i++){       
                 
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40; tab++; break;} // this to can view in grid form 

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
             }
   
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
         /////////////////////////////////Viewing the Buttons(add to cart) ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
            int tab=0;
            while(tab<tables.length){
           ArrayList<String> info=Getting_info("Info",tables[tab]);
           ArrayList<String> price=Getting_info("Price",tables[tab]);
           ArrayList<Integer> id=Getting_info_int("Id",tables[tab]);
           ArrayList<Image> images=Getting_images_blob("Image",tables[tab]);
           for(int i=0;i<info.size();i++){    
               final int index = i;
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40; tab++; break;} // this to can view in grid form 
              JButton b1=new JButton("Add to Cart");//create button of add cart
              b1.setIcon(getImageIcon(new File("E:\\My-Github\\ShoopingApp-JavaSwing\\Project-shooping\\src\\Controlling_the_products\\icons8-add-to-cart-40.png")));
              b1.setBackground(new Color(109,82,159));
              b1.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+263,211,40));//state the boundry
              b1.addActionListener(new ActionListener()
                        {
                         
                          public void actionPerformed (ActionEvent e) { 
                                      Buyer br=new Buyer();
                                      System.out.print("buyer is "+br.username);
                                      br.Add_to_cart(id.get(index), info.get(index), price.get(index), (Blob) images.get(index));
                                       
                          }
                        });
             CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
              jPanel2.add(b1);
             

       }
            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        ////////////////////////////////////////Drawing the price information/////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
           int tab=0;
            while(tab<tables.length){
           ArrayList<String> price=Getting_info("Price",tables[tab]);
           for(int i=0;i<price.size();i++){    
               final int index = i;
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40; tab++; break;} // this to can view in grid form
              JLabel l1=new JLabel("Price:"+price.get(index)+"EGP");//label of price
              l1.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+295,220,40));//seting label above the button
              l1.setFont(font);
              l1.setBackground(new Color(109,82,159));
              CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
              jPanel2.add(l1);
           }
            }
         } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        
        
  
  
  }
  
  
  
  
  
  
  
  
  
  public void search(JPanel jPanel2,JScrollPane jScrollPane1,String txt2){
      
   int CounterHorizontal=0,CounterVertical=0;
         Font font = new Font(Font.SERIF, Font.BOLD, 20);      
    /////////////////////////////////Viewing the Images ///////////////////////////////////////////////////////////////////
        try {
             ArrayList<Image> images=Getting_images_for_serach("Image",txt2);
             for(int i=0;i<images.size();i++){ 
                 
                    if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40;} // this to can view in grid form 
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
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /////////////////////////////////Viewing the Informations ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
            ArrayList<String> info=Getting_info_for_Search("Info",txt2);
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
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
        
        
      /////////////////////////////////Viewing the Buttons(add to cart) ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
           
           ArrayList<String> info=Getting_info_for_Search("Info",txt2);
           ArrayList<String> price=Getting_info_for_Search("Price",txt2);
           ArrayList<Integer> id=Getting_info_int_for_search("Id",txt2);
           ArrayList<Image> images=Getting_info_for_Search("Image",txt2);
           for(int i=0;i<info.size();i++){    
               final int index = i;
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40;} // this to can view in grid form 
              JButton b1=new JButton("Add to Cart");//create button of add cart
              b1.setIcon(getImageIcon(new File("E:\\My-Github\\ShoopingApp-JavaSwing\\Project-shooping\\src\\Controlling_the_products\\icons8-add-to-cart-40.png")));
              b1.setBackground(new Color(109,82,159));
              b1.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+263,211,40));//state the boundry
              b1.addActionListener(new ActionListener()
                        {
                         
                          public void actionPerformed (ActionEvent e) { 
                                      Buyer br=new Buyer();
                                      br.Add_to_cart(id.get(index), info.get(index), price.get(index), (Blob) images.get(index));
                                       
                          }
                        });
             CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
              jPanel2.add(b1);
             

       }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        } 
      
        
        
        
           /////////////////////////////////Viewing the Prices Label///////////////////////////////////////////////////////////////////
        CounterHorizontal=0;
        CounterVertical=0;
        try {
           
           ArrayList<String> price=Getting_info_for_Search("Price",txt2);
           for(int i=0;i<price.size();i++){    
               final int index = i;
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250+40;} // this to can view in grid form
              JLabel l1=new JLabel("Price:"+price.get(index)+"EGP");//label of price
              l1.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+295,220,40));//seting label above the button
              l1.setFont(font);
              l1.setBackground(new Color(109,82,159));
              CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
              jPanel2.add(l1);
           }
         } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  //////////////////////////////////Reading the image from the file to can set the icon of the button add to cart 
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
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 }
    
    
    
    
    
    
    
    
    
    
    
    

