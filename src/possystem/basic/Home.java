/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package possystem.basic;
import goods.AddProduct;
import possystem.basic.Product;
import possystem.admin.Admin;
import user.Login;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import possystem.Help1;

/**
 *
 * @author Asus
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        showDate();
        showTime();
    }
    
    public void showDate(){
      Date d = new Date();
      SimpleDateFormat s =  new SimpleDateFormat("dd-MM-yyyy");
      String dat = s.format(d);
      date.setText(dat);
    }
    public void showTime(){
        new Timer (0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent as){
                Date d = new Date();
                SimpleDateFormat s =  new SimpleDateFormat("hh-mm-ss");
                String tim = s.format(d);
                time.setText(tim);
            }
        }).start();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel1.setText("รหัสพนักงาน");

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel2.setText("ชื่อ");

        jLabel4.setText("...");

        jLabel3.setText("...");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(246, 179, 64));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel18.setText("_");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 37));

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel19.setText("X");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 15, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/pos2.png"))); // NOI18N
        jPanel16.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu6.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu3.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu2.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu1.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu4.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu5.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/help.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelID.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelID.setText("000");
        jPanel2.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 50, 20));

        jLabelName.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setText("...");
        jLabelName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 50, 20));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 30, 2));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 30, 2));

        jLabel20.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel20.setText("Welcome");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel22.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("User ID");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, -1));

        jLabel24.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Date");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 50, -1));

        jLabel25.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Time");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 50, -1));

        date.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("...");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 70, -1));

        time.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("...");
        jPanel2.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/user2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 160, 410));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button8.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 690, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu1_2.png")));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu1.png")));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        this.setExtendedState(Home.ICONIFIED);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
       jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu2_2.png")));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
       jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu2.png")));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu3_2.png")));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu3.png")));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu4_2.png")));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu4.png")));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu5_2.png")));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
       jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu5.png")));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu6_2.png")));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/ButtonMenu6.png")));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       AddProduct AddProduct  = new AddProduct();
       AddProduct.setVisible(true);
       AddProduct.jLabelID.setText(jLabelID.getText());
       AddProduct.jLabelName.setText(jLabelName.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/Button9.png")));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/Button8.png")));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       Login Login  = new Login();
       Login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       Product Product  = new Product();
       Product.setVisible(true);
       Product.jLabelID.setText(jLabelID.getText());
       Product.jLabelName.setText(jLabelName.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
       Order Order  = new Order();
       Order.setVisible(true);
       Order.jLabelID.setText(jLabelID.getText());
       Order.jLabelName.setText(jLabelName.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
       Stock Stock  = new Stock();
       Stock.setVisible(true);
       Stock.jLabelID.setText(jLabelID.getText());
       Stock.jLabelName.setText(jLabelName.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       MainSelling MainSeling  = new MainSelling();
       MainSeling.jLabelID.setText(jLabelID.getText());
       MainSeling.jLabelName.setText(jLabelName.getText());
       MainSeling.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       int AdminID=  Integer.parseInt(jLabelID.getText());
       int Chack = 10200;
       System.out.println(AdminID);
       if( AdminID == Chack ){
            Admin Admin  = new Admin();
            Admin.jLabelID.setText(jLabelID.getText());
            Admin.jLabelName.setText(jLabelName.getText());
            Admin.setVisible(true);
            this.dispose();  
       }else{
            javax.swing.JOptionPane.showMessageDialog(null,
                "You are not an admin !", "System",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       Help1 Help1  = new Help1();
       Help1.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    public static transient javax.swing.JLabel jLabelID;
    public static transient javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}