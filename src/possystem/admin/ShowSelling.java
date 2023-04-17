/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package possystem.admin;

import possystem.basic.*;
import goods.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class ShowSelling extends javax.swing.JFrame {
    Connection c1;
    Statement s1;
    ResultSet r1;
    int number[];
    String data[];
    int value;
    InputStream in;
    Connection c;
    Statement s;
    ResultSet r;
    /**
     * Creates new form GetGroupId
     */
    public ShowSelling() {
        initComponents();
        Load();
        init();
    }
    public void Search(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         c = DriverManager.getConnection("jdbc:mysql://localhost/sellingdb", "root", "ka9876543210");
         s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         r = s.executeQuery("Select * from dailysale where d_id="+Integer.parseInt(search.getText()));
        int rec=0;
         while(r.next()){
             rec++;
         }
         
         String[][] datatable = new String[rec][11];
         String[] head = {"SelingID", "ProductID", "Name", "ID Unit", "Price", "Amount", "TotalPrice", "Discount", "Date Sale", "EmployeeID", "Employee Name"};
         int count=0;
         r.first();
         datatable[count][0] = r.getString("d_id");
         datatable[count][1] = r.getString("p_id");
         datatable[count][2] =r.getString("p_name");
         datatable[count][3] =r.getString("id_unit");
         datatable[count][4] =r.getString("price");
         datatable[count][5] =r.getString("amount");
         datatable[count][6] =r.getString("total_price");
         datatable[count][7] =r.getString("discount");
         datatable[count][8] =r.getString("date_sale");
         datatable[count][9] =r.getString("id_emp");
         datatable[count][10] =r.getString("emp_name");
         count++;
         while (r.next()){
                datatable[count][0] = r.getString("d_id");
                datatable[count][1] = r.getString("p_id");
                datatable[count][2] =r.getString("p_name");
                datatable[count][3] =r.getString("id_unit");
                datatable[count][4] =r.getString("price");
                datatable[count][5] =r.getString("amount");
                datatable[count][6] =r.getString("total_price");
                datatable[count][7] =r.getString("discount");
                datatable[count][8] =r.getString("date_sale");
                datatable[count][9] =r.getString("id_emp");
                datatable[count][10] =r.getString("emp_name");
                count++;
         }
         
          jTable1.setModel(new javax.swing.table.DefaultTableModel(datatable,head));
      }catch(Exception e){
          javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }
    public void Load(){
         try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         c1 = DriverManager.getConnection("jdbc:mysql://localhost/sellingdb","root", "ka9876543210");
         s1 = c1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         r1 = s1.executeQuery("Select * from dailysale");
         int rec=0;
         while(r1.next()){
             rec++;
         }
         
         String[][] datatable = new String[rec][11];
         String[] head = {"SelingID", "ProductID", "Name", "ID Unit", "Price", "Amount", "TotalPrice", "Discount", "Date Sale", "EmployeeID", "Employee Name"};
         int count=0;
         r1.first();  
         datatable[count][0] = r1.getString("d_id");
         datatable[count][1] = r1.getString("p_id");
         datatable[count][2] =r1.getString("p_name");
         datatable[count][3] =r1.getString("id_unit");
         datatable[count][4] =r1.getString("price");
         datatable[count][5] =r1.getString("amount");
         datatable[count][6] =r1.getString("total_price");
         datatable[count][7] =r1.getString("discount");
         datatable[count][8] =r1.getString("date_sale");
         datatable[count][9] =r1.getString("id_emp");
         datatable[count][10] =r1.getString("emp_name");
         count++;
         while (r1.next()){
                datatable[count][0] = r1.getString("d_id");
                datatable[count][1] = r1.getString("p_id");
                datatable[count][2] =r1.getString("p_name");
                datatable[count][3] =r1.getString("id_unit");
                datatable[count][4] =r1.getString("price");
                datatable[count][5] =r1.getString("amount");
                datatable[count][6] =r1.getString("total_price");
                datatable[count][7] =r1.getString("discount");
                datatable[count][8] =r1.getString("date_sale");
                datatable[count][9] =r1.getString("id_emp");
                datatable[count][10] =r1.getString("emp_name");
                count++;
         }
         
          jTable1.setModel(new javax.swing.table.DefaultTableModel(datatable,head));
        }catch(Exception e){
         javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void init(){
        jTable1.fixTable(jScrollPane1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search = new GUI.TextFieldSuggestion();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        roundPanel2 = new GUI.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new GUI.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();

        jLabelID.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelID.setText("000");

        jLabelName.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setText("...");
        jLabelName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(246, 179, 64));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Selling History");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, 20));

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel18.setText("_");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 10, 20, 37));

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel19.setText("X");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 10, 30, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/arrorw.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel1.setText("SearchID");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button4.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1440, 90));

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        roundPanel2.setRound(10);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1383, Short.MAX_VALUE)
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/delete.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(702, 702, 702)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 147, 1440, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         String d_id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
         Connection c1 = null;
         try{
            try{
                c1 = DriverManager.getConnection("jdbc:mysql://localhost/sellingdb", "root", "ka9876543210");
                String sql2 = "DELETE FROM dailysale WHERE d_id="+d_id;
                PreparedStatement preparedStmt2 = c1.prepareStatement(sql2);
                c1.setAutoCommit(false);
                preparedStmt2.execute();
            }catch (SQLException e1) {
                javax.swing.JOptionPane.showMessageDialog(null,
                    e1, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            c1.commit();
            c1.close();
            javax.swing.JOptionPane.showMessageDialog(null,
                "Successfully Deleted Data !", "System",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            Load();
            }catch(Exception e) {
                javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            try{
                c1.rollback();
            }catch(Exception e1){javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
       }        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/delete2.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/delete.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        this.setExtendedState(ShowSelling.ICONIFIED);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Search();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button5.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
         jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button4.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Admin myapp = new Admin();
        myapp.setVisible(true);
        myapp.jLabelID.setText(jLabelID.getText());
        myapp.jLabelName.setText(jLabelName.getText());
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(ShowSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowSelling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel7;
    public static transient javax.swing.JLabel jLabelID;
    public static transient javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.swing.table.Table jTable1;
    private GUI.swing.RoundPanel roundPanel2;
    private GUI.TextFieldSuggestion search;
    // End of variables declaration//GEN-END:variables
}
