package shopapp;

import Controlling_the_products.Company;
import Controlling_the_products.person;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Salma
 */
public class Reg extends javax.swing.JPanel {
    person pr=new person();
    ShippingCompany sh=new ShippingCompany();
    Company cp=new Company();
    public Reg() {
        initComponents();
        RegSlide.init(CustomerPanel, sellerPanel, shippingPanel);
        RegSlide.setAnimate(11);
    }
    public void addEventBackLogin(ActionListener event) {
        cmdBackToLogin.addActionListener(event);
    }
    public void addEventBackLogin1(ActionListener event) {
        cmdBackToLogin1.addActionListener(event);
    }
    public void addEventBackLogin2(ActionListener event) {
        cmdBackToLogin2.addActionListener(event);
    }
    
//  ======================= checker for registertion ========================
private boolean check_email(String email){
     char []arr=email.toCharArray();
     if(email.endsWith(".com")&&email.contains("@")&&email.length()>10){return true;}
     return false;
 }
 private boolean check_phone(String phone){
     char[] str=phone.toCharArray();
     if(phone.length()!=11){return true;}
     for(int i=0;i<phone.length();i++)
     {if(Character.isAlphabetic(str[i])){return true;}}
     return false;
 } 
private boolean check_password(String pass)
{
    // returns true if the password is at least of length 6 and contains (digits and letters).
    char[] str=pass.toCharArray();
    boolean hasdigit =false, hasletter=false;
    if(pass.length()>=6)
    {
        for(int i=0;i<pass.length();i++)
        {
            if(Character.isDigit(str[i]))   hasdigit= true;
            else if(Character.isLetter(str[i]))  hasletter= true;
        }
        if(hasdigit && hasletter)  return true;
        else   return false;
    }
    else    return false;
}
private boolean check_text(String username)
{
    //returns true if the username length is at least 3 and contains letters
    char[] str=username.toCharArray();
    boolean hasletter=false;
    if(username.length()>=3)
    {
        for(int i=0;i<username.length();i++)  {  if(Character.isLetter(str[i]))  hasletter= true;  }
        if(hasletter) return true;
        else return false;
    }
    else  return false;
}

private void clear_the_registeration_panel(){
    txtname.setText("");
    CPassword.setText("");
    CAddress.setText("");
    CEmail.setText("");
    CPhonenumber.setText("");
    CArea.setText("");
    SEmail.setText("");
    SAddress.setText("");
    SUsername.setText("");
    SPassword.setText("");
    SPhonenumber.setText("");
    SCompanyName.setText("");
    ShipArea.setText("");
    ShipEmail.setText("");
    ShipAddress.setText("");
    ShipPhone.setText("");
    ShipComp.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        CutomerSelect = new swing.MyButton();
        SellerSelect = new swing.MyButton();
        ShippingSelect = new swing.MyButton();
        RegSlide = new swing.PanelSlide();
        CustomerPanel = new javax.swing.JPanel();
        txtname = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        CPassword = new swing.MyPassword();
        jLabel4 = new javax.swing.JLabel();
        CustomerRegisterBtn = new swing.MyButton();
        cmdBackToLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CArea = new swing.MyTextField();
        CEmail = new swing.MyTextField();
        jLabel7 = new javax.swing.JLabel();
        CAddress = new swing.MyTextField();
        jLabel8 = new javax.swing.JLabel();
        CPhonenumber = new swing.MyTextField();
        sellerPanel = new javax.swing.JPanel();
        SUsername = new swing.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        SPassword = new swing.MyPassword();
        jLabel9 = new javax.swing.JLabel();
        SellerRegisterBtn = new swing.MyButton();
        cmdBackToLogin1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SCompanyName = new swing.MyTextField();
        SEmail = new swing.MyTextField();
        jLabel12 = new javax.swing.JLabel();
        SAddress = new swing.MyTextField();
        jLabel13 = new javax.swing.JLabel();
        SPhonenumber = new swing.MyTextField();
        shippingPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ShipComp = new swing.MyPassword();
        ShippingRegisterBtn = new swing.MyButton();
        cmdBackToLogin2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ShipArea = new swing.MyTextField();
        ShipEmail = new swing.MyTextField();
        jLabel18 = new javax.swing.JLabel();
        ShipAddress = new swing.MyTextField();
        jLabel19 = new javax.swing.JLabel();
        ShipPhone = new swing.MyTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 68, 88));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");

        CutomerSelect.setBackground(new java.awt.Color(125, 229, 251));
        CutomerSelect.setText("Customer");
        CutomerSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutomerSelectActionPerformed(evt);
            }
        });

        SellerSelect.setBackground(new java.awt.Color(125, 229, 251));
        SellerSelect.setText("Seller");
        SellerSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerSelectActionPerformed(evt);
            }
        });

        ShippingSelect.setBackground(new java.awt.Color(125, 229, 251));
        ShippingSelect.setText("Shipping company");
        ShippingSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShippingSelectActionPerformed(evt);
            }
        });

        RegSlide.setBackground(new java.awt.Color(255, 255, 255));

        CustomerPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel1.setText("Password");

        CPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPasswordActionPerformed(evt);
            }
        });

        jLabel4.setText("UserName");

        CustomerRegisterBtn.setBackground(new java.awt.Color(125, 229, 251));
        CustomerRegisterBtn.setForeground(new java.awt.Color(40, 40, 40));
        CustomerRegisterBtn.setText("Register");
        CustomerRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerRegisterBtnActionPerformed(evt);
            }
        });

        cmdBackToLogin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cmdBackToLogin.setForeground(new java.awt.Color(30, 122, 236));
        cmdBackToLogin.setText("Back to Login");
        cmdBackToLogin.setContentAreaFilled(false);
        cmdBackToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackToLoginActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        jLabel6.setText("Address Area");

        CArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAreaActionPerformed(evt);
            }
        });

        CEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEmailActionPerformed(evt);
            }
        });

        jLabel7.setText("Address");

        jLabel8.setText("Phone Number");

        CPhonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPhonenumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomerPanelLayout = new javax.swing.GroupLayout(CustomerPanel);
        CustomerPanel.setLayout(CustomerPanelLayout);
        CustomerPanelLayout.setHorizontalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(CEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CustomerRegisterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdBackToLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(CArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CPhonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        CustomerPanelLayout.setVerticalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(CPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(CEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(CPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(CArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(CAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CustomerRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdBackToLogin)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sellerPanel.setBackground(new java.awt.Color(255, 255, 255));

        SUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUsernameActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");

        SPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPasswordActionPerformed(evt);
            }
        });

        jLabel9.setText("UserName");

        SellerRegisterBtn.setBackground(new java.awt.Color(125, 229, 251));
        SellerRegisterBtn.setForeground(new java.awt.Color(40, 40, 40));
        SellerRegisterBtn.setText("Register");
        SellerRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerRegisterBtnActionPerformed(evt);
            }
        });

        cmdBackToLogin1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cmdBackToLogin1.setForeground(new java.awt.Color(30, 122, 236));
        cmdBackToLogin1.setText("Back to Login");
        cmdBackToLogin1.setContentAreaFilled(false);
        cmdBackToLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdBackToLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackToLogin1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Email");

        jLabel11.setText("Company Name");

        SCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCompanyNameActionPerformed(evt);
            }
        });

        SEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEmailActionPerformed(evt);
            }
        });

        jLabel12.setText("Address");

        jLabel13.setText("Phone Number");

        SPhonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPhonenumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sellerPanelLayout = new javax.swing.GroupLayout(sellerPanel);
        sellerPanel.setLayout(sellerPanelLayout);
        sellerPanelLayout.setHorizontalGroup(
            sellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellerPanelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(sellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(SEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SellerRegisterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdBackToLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(SCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SPhonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        sellerPanelLayout.setVerticalGroup(
            sellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellerPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(SUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(SPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(SEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addComponent(SPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(SCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(0, 0, 0)
                .addComponent(SAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SellerRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdBackToLogin1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        shippingPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Company Name");

        ShipComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipCompActionPerformed(evt);
            }
        });

        ShippingRegisterBtn.setBackground(new java.awt.Color(125, 229, 251));
        ShippingRegisterBtn.setForeground(new java.awt.Color(40, 40, 40));
        ShippingRegisterBtn.setText("Register");
        ShippingRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShippingRegisterBtnActionPerformed(evt);
            }
        });

        cmdBackToLogin2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cmdBackToLogin2.setForeground(new java.awt.Color(30, 122, 236));
        cmdBackToLogin2.setText("Back to Login");
        cmdBackToLogin2.setContentAreaFilled(false);
        cmdBackToLogin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdBackToLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackToLogin2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Email");

        jLabel17.setText("Shipping Area");

        ShipArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipAreaActionPerformed(evt);
            }
        });

        ShipEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipEmailActionPerformed(evt);
            }
        });

        jLabel18.setText("Address");

        jLabel19.setText("Phone Number");

        ShipPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipPhoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shippingPanelLayout = new javax.swing.GroupLayout(shippingPanel);
        shippingPanel.setLayout(shippingPanelLayout);
        shippingPanelLayout.setHorizontalGroup(
            shippingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shippingPanelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(shippingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19)
                    .addComponent(ShipEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShipComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShippingRegisterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdBackToLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(ShipArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShipAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShipPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        shippingPanelLayout.setVerticalGroup(
            shippingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shippingPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addComponent(ShipComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel16)
                .addGap(1, 1, 1)
                .addComponent(ShipEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addGap(0, 0, 0)
                .addComponent(ShipPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(0, 0, 0)
                .addComponent(ShipArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(0, 0, 0)
                .addComponent(ShipAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(ShippingRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdBackToLogin2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RegSlideLayout = new javax.swing.GroupLayout(RegSlide);
        RegSlide.setLayout(RegSlideLayout);
        RegSlideLayout.setHorizontalGroup(
            RegSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegSlideLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(CustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(RegSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegSlideLayout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(sellerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
            .addGroup(RegSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegSlideLayout.createSequentialGroup()
                    .addContainerGap(43, Short.MAX_VALUE)
                    .addComponent(shippingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        RegSlideLayout.setVerticalGroup(
            RegSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegSlideLayout.createSequentialGroup()
                .addComponent(CustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(RegSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegSlideLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(sellerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(RegSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegSlideLayout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(shippingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegSlide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(CutomerSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(SellerSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ShippingSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CutomerSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShippingSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegSlide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void CPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPasswordActionPerformed

    private void CustomerRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerRegisterBtnActionPerformed
        //===================== CUSTOMER RESITRATION FUNCTION===============================    
        boolean Staus_for_reg=true;
            String email=CEmail.getText();
            String username=txtname.getText();
            String Password=String.valueOf(CPassword.getPassword());
            String address=CAddress.getText();
            String addressArea=CArea.getText();
            String no=CPhonenumber.getText();
        //==========================customer registration checker=============================//
            if(!check_text(username))      { JOptionPane.showMessageDialog(this,"username length is less than 3 or it doesn't contain letters", "validation", 2); Staus_for_reg=false;  }
            else if(!check_password(Password)) { JOptionPane.showMessageDialog(this,"The password length is less than 6 or not contain digits and letters!", "validation", 2); Staus_for_reg=false;  }
            else if(!check_email(email))       {JOptionPane.showMessageDialog(this,"Email is invalid try again", "validation", 2); Staus_for_reg=false;}
            else if(check_phone(no))           {JOptionPane.showMessageDialog(this,"Phone no contains digits or it's not 11 digit", "validation", 2); Staus_for_reg=false;}
            else if(!check_text(address))      { JOptionPane.showMessageDialog(this,"address length is less than 3 or it doesn't contain letters", "validation", 2); Staus_for_reg=false;  }
            //============================Register successfully if the data is valid=====================//
        if(Staus_for_reg){
                pr.Registeration(username,email, address,addressArea, no, Password);
                if(pr.status_if_data_in_table){JOptionPane.showMessageDialog(this,"Email is sign up before or username or password or phonenumber try again", "validation", 2); Staus_for_reg=false; clear_the_registeration_panel();}
                else{
                   System.out.println("no repeated data");
                }
            }   
    }//GEN-LAST:event_CustomerRegisterBtnActionPerformed

    private void cmdBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackToLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdBackToLoginActionPerformed

    private void CAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAreaActionPerformed

    private void CEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEmailActionPerformed

    private void CPhonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPhonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPhonenumberActionPerformed

    private void SUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUsernameActionPerformed

    private void SPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPasswordActionPerformed

    private void SellerRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerRegisterBtnActionPerformed
        //===============================SELLER REGISTRATION FUNCTION==================================   
        boolean Staus_for_reg = true;
            String email = SEmail.getText();
            String username = SUsername.getText();
            String Password = String.valueOf(SPassword.getPassword());
            String address = SAddress.getText();
            String companyname = SCompanyName.getText();
            String no = SPhonenumber.getText();
            //=============================checking for invalid data================================
            if(!check_text(username))      { JOptionPane.showMessageDialog(this,"username length is less than 3 or it doesn't contain letters", "validation", 2); Staus_for_reg=false;  }
            else if(!check_password(Password)) { JOptionPane.showMessageDialog(this,"The password length is less than 6 or not contain digits and letters!", "validation", 2); Staus_for_reg=false;  }
            else if(!check_email(email))       {JOptionPane.showMessageDialog(this,"Email is invalid try again", "validation", 2); Staus_for_reg=false;}
            else if(check_phone(no))           {JOptionPane.showMessageDialog(this,"Phone no contains digits or it's not 11 digit", "validation", 2); Staus_for_reg=false;}
            else if(!check_text(companyname))      { JOptionPane.showMessageDialog(this,"company name length is less 3 or it doesn't contain letters", "validation", 2); Staus_for_reg=false;  }
            else if(!check_text(address))      { JOptionPane.showMessageDialog(this,"address length is less than 3 or it doesn't contain letters", "validation", 2); Staus_for_reg=false;  }
           //==========================updating the database if the validation is true===========================
            if (Staus_for_reg) {
                cp.Registeration(username, email, address, no, Password, companyname);
                if (cp.status_if_data_in_table) {
                    JOptionPane.showMessageDialog(this, "Email is sign up before or username or company id try again", "validation", 2);
                    Staus_for_reg = false;
                    clear_the_registeration_panel();
                } else {
                     System.out.println("no repeated data");
                }
            }
    }//GEN-LAST:event_SellerRegisterBtnActionPerformed

    private void cmdBackToLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackToLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdBackToLogin1ActionPerformed

    private void SCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SCompanyNameActionPerformed

    private void SEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEmailActionPerformed

    private void SPhonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPhonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPhonenumberActionPerformed

    private void ShipCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShipCompActionPerformed

    private void ShippingRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShippingRegisterBtnActionPerformed
        //=========================== SHIPPING REGISTRATION FUNCTION============================    
            boolean Staus_for_reg=true;
            String email=ShipEmail.getText();
            String ComanyName=ShipComp.getText();
            String address=ShipAddress.getText();
            String addressArea=ShipArea.getText();
            String no=ShipPhone.getText();
            //==========================shipping registration checker=============================//
            if(!check_text(ComanyName))      { JOptionPane.showMessageDialog(this,"company name length is less 3 or it doesn't contain letters", "validation", 2); Staus_for_reg=false;  }
            else if(!check_email(email)){JOptionPane.showMessageDialog(this,"Email is invalid try again", "validation", 2); Staus_for_reg=false; }
            else if(check_phone(no)){JOptionPane.showMessageDialog(this,"Phone no contains digits or it's not 11 digit", "validation", 2); Staus_for_reg=false;}
            else if(!check_text(address))      { JOptionPane.showMessageDialog(this,"address length is less than 3 or it doesn't contain letters", "validation", 2); Staus_for_reg=false;  }
            //============================Register successfully if the data is valid=====================//
            if(Staus_for_reg){
                sh.Registeration(ComanyName, email, address, no, addressArea);
                if(pr.status_if_data_in_table){JOptionPane.showMessageDialog(this,"Email is sign up before or username or company id try again", "validation", 2);Staus_for_reg=false; clear_the_registeration_panel();}
                else
                {
                    System.out.println("no repeated data");
                }}
    }//GEN-LAST:event_ShippingRegisterBtnActionPerformed

    private void cmdBackToLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackToLogin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdBackToLogin2ActionPerformed

    private void ShipAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShipAreaActionPerformed

    private void ShipEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShipEmailActionPerformed

    private void ShipPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShipPhoneActionPerformed

    private void CutomerSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutomerSelectActionPerformed
        RegSlide.show(0);
    }//GEN-LAST:event_CutomerSelectActionPerformed

    private void SellerSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerSelectActionPerformed
        RegSlide.show(1);
    }//GEN-LAST:event_SellerSelectActionPerformed

    private void ShippingSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShippingSelectActionPerformed
        RegSlide.show(2);
    }//GEN-LAST:event_ShippingSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyTextField CAddress;
    private swing.MyTextField CArea;
    private swing.MyTextField CEmail;
    private swing.MyPassword CPassword;
    private swing.MyTextField CPhonenumber;
    private javax.swing.JPanel CustomerPanel;
    private swing.MyButton CustomerRegisterBtn;
    private swing.MyButton CutomerSelect;
    private swing.PanelSlide RegSlide;
    private swing.MyTextField SAddress;
    private swing.MyTextField SCompanyName;
    private swing.MyTextField SEmail;
    private swing.MyPassword SPassword;
    private swing.MyTextField SPhonenumber;
    private swing.MyTextField SUsername;
    private swing.MyButton SellerRegisterBtn;
    private swing.MyButton SellerSelect;
    private swing.MyTextField ShipAddress;
    private swing.MyTextField ShipArea;
    private swing.MyPassword ShipComp;
    private swing.MyTextField ShipEmail;
    private swing.MyTextField ShipPhone;
    private swing.MyButton ShippingRegisterBtn;
    private swing.MyButton ShippingSelect;
    private javax.swing.JButton cmdBackToLogin;
    private javax.swing.JButton cmdBackToLogin1;
    private javax.swing.JButton cmdBackToLogin2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel sellerPanel;
    private javax.swing.JPanel shippingPanel;
    private swing.MyTextField txtname;
    // End of variables declaration//GEN-END:variables
}
