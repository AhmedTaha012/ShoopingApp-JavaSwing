/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.shooping;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlling_the_products.Products;
import javax.swing.plaf.basic.BasicScrollBarUI;
public class ProductFrame extends javax.swing.JFrame {
    /////////////////////////////Intializations////////////////////////////////////////////////////
    JLabel [] labels; //This array of the top buttons 
  
    public ProductFrame() {
 
        
        
        initComponents();
        
        
                jScrollPane1.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
    @Override
    protected void configureScrollBarColors() {
        this.thumbColor = Color.LIGHT_GRAY;
        this.trackColor=Color.WHITE;
    }
});
    }
   
   public void addLabeltoTabel(){
      labels=new JLabel[]{LogOut,Home,Cart};
   }
   
   public void setLabelBackground(JLabel j1){
    j1.setBackground(new Color(72,54,106));
   }
    
   public void resetLabelBackground(JLabel j1){
    j1.setBackground(new Color(109,82,159));
   }
    
     public void setPanelBackground(JPanel j1){
    j1.setBackground(new Color(72,54,106));
   }
    
   public void resetPanelBackground(JPanel j1){
    j1.setBackground(new Color(109,82,159));
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        LogOut = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Cart = new javax.swing.JLabel();
        AddProductLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        SmartPhonesPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SmartPhonesIcon = new javax.swing.JLabel();
        HomePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        HomeIcon = new javax.swing.JLabel();
        HeadPhonesPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        HeadPhonesIcon = new javax.swing.JLabel();
        LaptopsPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LaptopsIcon = new javax.swing.JLabel();
        TelevisonPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TelevisonIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllInPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 255));

        jPanel2.setBackground(new java.awt.Color(109, 82, 159));
        jPanel2.setForeground(new java.awt.Color(255, 153, 255));

        LogOut.setBackground(new java.awt.Color(109, 82, 159));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-emergency-exit-50.png"))); // NOI18N
        LogOut.setToolTipText("Exit");
        LogOut.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        LogOut.setFocusable(false);
        LogOut.setIconTextGap(20);
        LogOut.setOpaque(true);
        LogOut.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LogOutMouseMoved(evt);
            }
        });
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutMouseExited(evt);
            }
        });

        Home.setBackground(new java.awt.Color(109, 82, 159));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-home-page-50.png"))); // NOI18N
        Home.setLabelFor(Home);
        Home.setOpaque(true);
        Home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HomeMouseMoved(evt);
            }
        });
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        Cart.setBackground(new java.awt.Color(109, 82, 159));
        Cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-favorite-cart-50.png"))); // NOI18N
        Cart.setLabelFor(Cart);
        Cart.setOpaque(true);
        Cart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CartMouseMoved(evt);
            }
        });
        Cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CartMouseExited(evt);
            }
        });

        AddProductLabel.setBackground(new java.awt.Color(109, 82, 159));
        AddProductLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-add-product-50.png"))); // NOI18N
        AddProductLabel.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(109, 82, 159));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-shop-50.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HAPPYSHOOP");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-sign-out-24.png"))); // NOI18N
        jLabel9.setToolTipText("logout");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(385, 385, 385)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddProductLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOut))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home)
                    .addComponent(Cart)
                    .addComponent(AddProductLabel)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );

        MainPanel.setBackground(new java.awt.Color(109, 82, 159));

        SmartPhonesPanel.setBackground(new java.awt.Color(109, 82, 159));
        SmartPhonesPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SmartPhonesPanelMouseMoved(evt);
            }
        });
        SmartPhonesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SmartPhonesPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SmartPhonesPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SmartPhonesPanelMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SMART PHONES");

        SmartPhonesIcon.setBackground(new java.awt.Color(109, 82, 159));
        SmartPhonesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-smartphones-100.png"))); // NOI18N
        SmartPhonesIcon.setOpaque(true);

        HomePanel.setBackground(new java.awt.Color(109, 82, 159));
        HomePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HomePanelMouseMoved(evt);
            }
        });
        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomePanelMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOME PAGE ");

        HomeIcon.setBackground(new java.awt.Color(109, 82, 159));
        HomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-home-office-100.png"))); // NOI18N
        HomeIcon.setOpaque(true);

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomePanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(HomeIcon)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(HomeIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SmartPhonesPanelLayout = new javax.swing.GroupLayout(SmartPhonesPanel);
        SmartPhonesPanel.setLayout(SmartPhonesPanelLayout);
        SmartPhonesPanelLayout.setHorizontalGroup(
            SmartPhonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartPhonesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SmartPhonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SmartPhonesPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SmartPhonesIcon)
                        .addGap(91, 91, 91))
                    .addGroup(SmartPhonesPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        SmartPhonesPanelLayout.setVerticalGroup(
            SmartPhonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartPhonesPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(SmartPhonesIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(HomePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HeadPhonesPanel.setBackground(new java.awt.Color(109, 82, 159));
        HeadPhonesPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HeadPhonesPanelMouseMoved(evt);
            }
        });
        HeadPhonesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadPhonesPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HeadPhonesPanelMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("HEADPHONES");

        HeadPhonesIcon.setBackground(new java.awt.Color(109, 82, 159));
        HeadPhonesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-headphones-100.png"))); // NOI18N
        HeadPhonesIcon.setOpaque(true);

        javax.swing.GroupLayout HeadPhonesPanelLayout = new javax.swing.GroupLayout(HeadPhonesPanel);
        HeadPhonesPanel.setLayout(HeadPhonesPanelLayout);
        HeadPhonesPanelLayout.setHorizontalGroup(
            HeadPhonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPhonesPanelLayout.createSequentialGroup()
                .addGroup(HeadPhonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeadPhonesPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(HeadPhonesIcon))
                    .addGroup(HeadPhonesPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        HeadPhonesPanelLayout.setVerticalGroup(
            HeadPhonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPhonesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeadPhonesIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LaptopsPanel.setBackground(new java.awt.Color(109, 82, 159));
        LaptopsPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LaptopsPanelMouseMoved(evt);
            }
        });
        LaptopsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaptopsPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LaptopsPanelMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("    LAPTOPS");

        LaptopsIcon.setBackground(new java.awt.Color(109, 82, 159));
        LaptopsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-laptop-100.png"))); // NOI18N
        LaptopsIcon.setOpaque(true);

        javax.swing.GroupLayout LaptopsPanelLayout = new javax.swing.GroupLayout(LaptopsPanel);
        LaptopsPanel.setLayout(LaptopsPanelLayout);
        LaptopsPanelLayout.setHorizontalGroup(
            LaptopsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LaptopsPanelLayout.createSequentialGroup()
                .addGroup(LaptopsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LaptopsPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(LaptopsIcon))
                    .addGroup(LaptopsPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        LaptopsPanelLayout.setVerticalGroup(
            LaptopsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LaptopsPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LaptopsIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TelevisonPanel.setBackground(new java.awt.Color(109, 82, 159));
        TelevisonPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TelevisonPanelMouseMoved(evt);
            }
        });
        TelevisonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelevisonPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TelevisonPanelMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("   TELEVISON");

        TelevisonIcon.setBackground(new java.awt.Color(109, 82, 159));
        TelevisonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-television-100.png"))); // NOI18N
        TelevisonIcon.setOpaque(true);

        javax.swing.GroupLayout TelevisonPanelLayout = new javax.swing.GroupLayout(TelevisonPanel);
        TelevisonPanel.setLayout(TelevisonPanelLayout);
        TelevisonPanelLayout.setHorizontalGroup(
            TelevisonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelevisonPanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(TelevisonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelevisonPanelLayout.createSequentialGroup()
                        .addComponent(TelevisonIcon)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelevisonPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        TelevisonPanelLayout.setVerticalGroup(
            TelevisonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelevisonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelevisonIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(SmartPhonesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(HeadPhonesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(LaptopsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(TelevisonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelevisonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SmartPhonesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HeadPhonesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LaptopsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1328, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 54, 106), 5));

        jScrollPane1.setBackground(new java.awt.Color(109, 82, 159));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 54, 106), 5));

        AllInPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout AllInPanelLayout = new javax.swing.GroupLayout(AllInPanel);
        AllInPanel.setLayout(AllInPanelLayout);
        AllInPanelLayout.setHorizontalGroup(
            AllInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1316, Short.MAX_VALUE)
        );
        AllInPanelLayout.setVerticalGroup(
            AllInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(AllInPanel);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1318, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(72, 54, 106));

        jTextField1.setBackground(new java.awt.Color(109, 82, 159));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Search");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shooping/icons8-google-web-search-40.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 887, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 286, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        resetLabelBackground(Home);
    }//GEN-LAST:event_HomeMouseExited

     /// This to function for setting and resting the color of the button when we move across them 
    private void HomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseMoved
        setLabelBackground(Home);
    }//GEN-LAST:event_HomeMouseMoved

    private void LogOutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseMoved
        setLabelBackground(LogOut);
    }//GEN-LAST:event_LogOutMouseMoved

    private void LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseExited
       resetLabelBackground(LogOut);
    }//GEN-LAST:event_LogOutMouseExited

    private void CartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartMouseMoved
        setLabelBackground(Cart);
    }//GEN-LAST:event_CartMouseMoved

    private void CartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartMouseExited
       resetLabelBackground(Cart);
    }//GEN-LAST:event_CartMouseExited

    private void HomePanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseMoved
     setPanelBackground(HomePanel);
     setLabelBackground(HomeIcon);
    }//GEN-LAST:event_HomePanelMouseMoved

    private void HomePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseExited
        resetPanelBackground(HomePanel);
        resetLabelBackground(HomeIcon);
    }//GEN-LAST:event_HomePanelMouseExited

    private void SmartPhonesPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmartPhonesPanelMouseExited
          resetPanelBackground(SmartPhonesPanel);
          resetLabelBackground(SmartPhonesIcon);
    }//GEN-LAST:event_SmartPhonesPanelMouseExited

    private void SmartPhonesPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmartPhonesPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SmartPhonesPanelMousePressed

    private void HeadPhonesPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadPhonesPanelMouseExited
          resetPanelBackground(HeadPhonesPanel);
          resetLabelBackground(HeadPhonesIcon);
    }//GEN-LAST:event_HeadPhonesPanelMouseExited

    private void HeadPhonesPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadPhonesPanelMouseMoved
      setPanelBackground(HeadPhonesPanel);
       setLabelBackground(HeadPhonesIcon);
    }//GEN-LAST:event_HeadPhonesPanelMouseMoved

    private void SmartPhonesPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmartPhonesPanelMouseMoved
        setPanelBackground(SmartPhonesPanel);
        setLabelBackground(SmartPhonesIcon);
    }//GEN-LAST:event_SmartPhonesPanelMouseMoved

    private void LaptopsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaptopsPanelMouseExited
           resetPanelBackground(LaptopsPanel);
               resetLabelBackground(LaptopsIcon);
           
    }//GEN-LAST:event_LaptopsPanelMouseExited

    private void LaptopsPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaptopsPanelMouseMoved
           setPanelBackground(LaptopsPanel);
           setLabelBackground(LaptopsIcon);
    }//GEN-LAST:event_LaptopsPanelMouseMoved

    private void TelevisonPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelevisonPanelMouseExited
           resetPanelBackground(TelevisonPanel);
           resetLabelBackground(TelevisonIcon);
    }//GEN-LAST:event_TelevisonPanelMouseExited

    private void TelevisonPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelevisonPanelMouseMoved
      setPanelBackground(TelevisonPanel);
      setLabelBackground(TelevisonIcon);
    }//GEN-LAST:event_TelevisonPanelMouseMoved

    private void LaptopsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaptopsPanelMouseClicked
        AllInPanel.removeAll();
        Products pr=new Products();
        pr.Drawing_on_Panel(AllInPanel, jScrollPane1,"laptops");
        AllInPanel.revalidate();
         AllInPanel.repaint();
 
    }//GEN-LAST:event_LaptopsPanelMouseClicked

    private void HeadPhonesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadPhonesPanelMouseClicked
         AllInPanel.removeAll();
         Products pr=new Products();
         pr.Drawing_on_Panel(AllInPanel, jScrollPane1,"headphones");
         AllInPanel.revalidate();
         AllInPanel.repaint();
    }//GEN-LAST:event_HeadPhonesPanelMouseClicked

    private void TelevisonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelevisonPanelMouseClicked
          AllInPanel.removeAll();
         Products pr=new Products();
         pr.Drawing_on_Panel(AllInPanel, jScrollPane1,"tv");
         AllInPanel.revalidate();
         AllInPanel.repaint();

    }//GEN-LAST:event_TelevisonPanelMouseClicked

    private void SmartPhonesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmartPhonesPanelMouseClicked
         AllInPanel.removeAll();
         Products pr=new Products();
         pr.Drawing_on_Panel(AllInPanel, jScrollPane1,"mobilephones");
         AllInPanel.revalidate();
         AllInPanel.repaint();
    }//GEN-LAST:event_SmartPhonesPanelMouseClicked

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddProductLabel;
    private javax.swing.JPanel AllInPanel;
    private javax.swing.JLabel Cart;
    private javax.swing.JLabel HeadPhonesIcon;
    private javax.swing.JPanel HeadPhonesPanel;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel HomeIcon;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel LaptopsIcon;
    private javax.swing.JPanel LaptopsPanel;
    private javax.swing.JLabel LogOut;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel SmartPhonesIcon;
    private javax.swing.JPanel SmartPhonesPanel;
    private javax.swing.JLabel TelevisonIcon;
    private javax.swing.JPanel TelevisonPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
