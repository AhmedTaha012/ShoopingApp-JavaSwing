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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import project.shooping.Trying;
import project.shooping.PaymentFrame;
import project.shooping.ProductFrame;
public class Cart {
    double total_cost=0;
    double rt=0;
    static String price;
    static String oldprice="";
    static String []prices;
    static double cost=0;
    public  ArrayList Getting_info(String col,String tab,String UserName) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT DISTINCT "+col+ " FROM "+tab+" where"+" UserName="+UserName
            );
            ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getString(1));
            }
            System.out.println(Info.size());
          return Info;
  
  }
  //function to getting the coloum for any table in data base in arralist to retun the strings only
    
 public  ArrayList Getting_info_int(String col,String tab,String UserName) throws SQLException{
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT DISTINCT "+col+ " FROM "+tab+" where"+" UserName="+UserName
            );
            ArrayList<Object > Info=new ArrayList<Object>();
            while(myRs.next()){
              Info.add(myRs.getInt(1));
            }
            System.out.println(Info.size());
          return Info;
  
  }
  
  
    ///////////function to geeting the image of any table from data base in array list  asn icon to added to the tabel
 public ArrayList Getting_images(String col,String tab,String UserName) throws SQLException{
     ///////////////////////////connection to database///////////////////////////////////////////////////////////////
            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                    "SELECT  "+col+ " FROM "+tab+" where"+" UserName="+UserName
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
    
    
    
    
    
    
    
    
    
    public void view_product(JPanel jPanel2,JScrollPane jScrollPane1,String UserName) 
    {
        
       int CounterHorizontal=0,CounterVertical=0;
       String table="cart";
    /////////////////////////////////Viewing the Images ///////////////////////////////////////////////////////////////////
        try {
              ArrayList<Image> images=Getting_images("Image",table,UserName);
             for(int i=0;i<images.size();i++){ 
        
                    if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250;} // this to can view in grid form 
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
            Logger.getLogger(Trying.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /////////////////////////////////Viewing the Informations ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
            ArrayList<String> info=Getting_info("Info",table,UserName);
           for(int i=0;i<info.size();i++){       
                 
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250;} // this to can view in grid form 

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
            Logger.getLogger(Trying.class.getName()).log(Level.SEVERE, null, ex);
        }
     
      /////////////////////////////////Viewing the Buttons(add to cart) ///////////////////////////////////////////////////////////////////
        
        CounterHorizontal=0;
        CounterVertical=0;
        try {
           
           ArrayList<String> info=Getting_info("Info",table,UserName);
           for(int i=0;i<info.size();i++){    
               final int index = i;
             if(i%5==0 && i!=0){CounterHorizontal=0;CounterVertical=CounterVertical+250;} // this to can view in grid form 
              JButton b1=new JButton("Remove From Cart");//create button of add cart
              b1.setIcon(getImageIcon(new File("E:\\My-Github\\ShoopingApp-JavaSwing\\Project-shooping\\src\\Controlling_the_products\\icons8-remove-product-40.png")));
              b1.setBackground(new Color(109,82,159));
              b1.setBounds(new Rectangle(20+CounterHorizontal,CounterVertical+263,211,40));//state the boundry
              b1.addActionListener(new ActionListener()
                        {
                         
                          public void actionPerformed (ActionEvent e) { 
                                     Delete_product(UserName,info.get(index));
                                       
                          }
                        });
             CounterHorizontal=CounterHorizontal+260; // the incremant on x axis
              jPanel2.add(b1);
             

       }
        
        
   
        } catch (SQLException ex) {
            Logger.getLogger(Trying.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        try {
            calaculate_cost(UserName);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
        Font font = new Font(Font.SERIF, Font.BOLD, 20);
        /////////////////////////////////////////This part is the desgin of the checkout part in the cart
        JTextField tx=new JTextField("-----------------------------------------------------------------------------------------------------------");
        tx.setFont(font);
        tx.setBackground(new Color(0,0,0));
        tx.setBounds(jPanel2.getX(),jPanel2.getY()+jPanel2.getHeight()-100,jPanel2.getWidth(),10);
        jPanel2.add(tx);
        /////////////////////////txt to show the information ////////////////////////////////////////
        JTextField tx2=new JTextField("Check Out Information");
        
        tx2.setFont(font);
        tx2.setBorder(BorderFactory.createEmptyBorder());
        tx2.setBounds(jPanel2.getX(),jPanel2.getY()+jPanel2.getHeight()-130,jPanel2.getWidth()-1000,30);
        jPanel2.add(tx2);
        ///////////////The text of the cost//////////////////////////////
        JTextField tx3;
        try {
            tx3 = new JTextField("Total Cost Is: "+calaculate_cost(UserName));
            tx3.setBorder(BorderFactory.createEmptyBorder());
            tx3.setFont(font);
            tx3.setBounds(jPanel2.getX(),jPanel2.getY()+jPanel2.getHeight()-90,jPanel2.getWidth()-1000,30);
            jPanel2.add(tx3);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
        /// The button to go to the checkout frame
        JButton b2=new JButton("Go To Check Out");//create button of add cart
        b2.setIcon(getImageIcon(new File("E:\\My-Github\\ShoopingApp-JavaSwing\\Project-shooping\\src\\Controlling_the_products\\icons8-checkout-40.png")));
        b2.setBackground(new Color(109,82,159));
        b2.setBounds(new Rectangle(jPanel2.getX()+1000,jPanel2.getY()+jPanel2.getHeight()-90,211,40));//state the boundry
        b2.addActionListener(new ActionListener()
                        {
                         
                          public void actionPerformed (ActionEvent e) { 
                                    new PaymentFrame.setVisible(true);

                                       
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

    


    static void Delete_product(String user, String inf)
    {
        try{
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement myst= conn.createStatement();
            myst.executeUpdate("delete from cart where UserName="+user+" and Info='"+inf+"'");
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public double calaculate_cost(String UserName) throws SQLException{

            Connection myConn;
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datausage","root","root99");
            Statement mystamt=myConn.createStatement();
            ResultSet myRs=mystamt.executeQuery(
                 "select cast(sum(replace(Price,"+"','"+","+"''"+")) As double )As Price from datausage.cart where UserName="+UserName
            );
  ArrayList<Double> cost=new ArrayList<Double>();
    while(myRs.next()){cost.add(myRs.getDouble(1));}
        return cost.get(0);

    
}
    
}
