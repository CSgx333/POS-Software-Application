/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package possystem.basic;

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
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class InputDataToStock extends javax.swing.JFrame {
    Connection c1;
    Statement s1;
    ResultSet r1;
    int number[];
    String data[];
    Connection c2;
    Statement s2;
    ResultSet r2;
    Connection c3;
    Statement s3;
    ResultSet r3;
    int saling_row = 0;
    /**
     * Creates new form GetGroupId
     */
    public InputDataToStock() {
        initComponents();
        LoadOrder();
        LoadStock();
        init();
    }
    
    public void LoadOrder(){
         try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         c1 = DriverManager.getConnection("jdbc:mysql://localhost/warehouse","root", "ka9876543210");
         s1 = c1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         r1 = s1.executeQuery("Select * from curorder");
         int rec=0;
         while(r1.next()){
             rec++;
         }
         
         String[][] datatable = new String[rec][11];
         String[] head = {"CurID", "ProductID", "Name", "ID Unit", "SupplierID", "Price", "Amount", "TotalPrice", "Discount", "Date Order", "Date Sent"};
         int count=0;
         r1.first();  
         datatable[count][0] = r1.getString("cur_id");
         datatable[count][1] =r1.getString("p_id");
         datatable[count][2] =r1.getString("p_name");
         datatable[count][3] =r1.getString("id_unit");
         datatable[count][4] =r1.getString("sp_id");
         datatable[count][5] =r1.getString("price");
         datatable[count][6] =r1.getString("cur_amount");
         datatable[count][7] =r1.getString("total_price");
         datatable[count][8] =r1.getString("cur_discount");
         datatable[count][9] =r1.getString("date_order");
         datatable[count][10] =r1.getString("date_sent");
         count++;
         while (r1.next()){
             datatable[count][0] = r1.getString("cur_id");
            datatable[count][1] =r1.getString("p_id");
            datatable[count][2] =r1.getString("p_name");
            datatable[count][3] =r1.getString("id_unit");
            datatable[count][4] =r1.getString("sp_id");
            datatable[count][5] =r1.getString("price");
            datatable[count][6] =r1.getString("cur_amount");
            datatable[count][7] =r1.getString("total_price");
            datatable[count][8] =r1.getString("cur_discount");
            datatable[count][9] =r1.getString("date_order");
            datatable[count][10] =r1.getString("date_sent");
             count++;
         }
         
          jTable1.setModel(new javax.swing.table.DefaultTableModel(datatable,head));
        }catch(Exception e){
         javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    public void LoadStock(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         c1 = DriverManager.getConnection("jdbc:mysql://localhost/warehouse","root", "ka9876543210");
         s1 = c1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         r1 = s1.executeQuery("Select * from stock");
         int rec=0;
         while(r1.next()){
             rec++;
         }
         
         String[][] datatable = new String[rec][7];
         String[] head = {"StockID", "ProductID", "Name", "ID Unit", "SupplierID", "Price", "Amount"};
         int count=0;
         r1.first();  
         datatable[count][0] = r1.getString("st_id");
         datatable[count][1] =r1.getString("p_id");
         datatable[count][2] =r1.getString("p_name");
         datatable[count][3] =r1.getString("id_unit");
         datatable[count][4] =r1.getString("sp_id");
         datatable[count][5] =r1.getString("price");
         datatable[count][6] =r1.getString("amount");
         count++;
         while (r1.next()){
             datatable[count][0] = r1.getString("st_id");
            datatable[count][1] =r1.getString("p_id");
            datatable[count][2] =r1.getString("p_name");
            datatable[count][3] =r1.getString("id_unit");
            datatable[count][4] =r1.getString("sp_id");
            datatable[count][5] =r1.getString("price");
            datatable[count][6] =r1.getString("amount");
             count++;
         }
         
          jTable2.setModel(new javax.swing.table.DefaultTableModel(datatable,head));
        }catch(Exception e){
         javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    

    private void init(){
        jTable1.fixTable(jScrollPane1);
        jTable2.fixTable(jScrollPane3);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        roundPanel2 = new GUI.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new GUI.swing.table.Table();
        jLabel1 = new javax.swing.JLabel();
        roundPanel3 = new GUI.swing.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new GUI.swing.table.Table();
        jLabel5 = new javax.swing.JLabel();

        jLabelName.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setText("...");
        jLabelName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelID.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelID.setText("000");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(246, 179, 64));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Adjust Stock");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, 20));

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel18.setText("_");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 20, 37));

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel19.setText("X");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 30, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/arrorw.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

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

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel1.setText("Order");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        roundPanel3.setRound(10);

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel3.setText("Stock");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 820, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button15.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel5)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 57, 900, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        this.setExtendedState(InputDataToStock.ICONIFIED);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Order Order = new Order();
        Order.setVisible(true);
        Order.jLabelID.setText(jLabelID.getText());
        Order.jLabelName.setText(jLabelName.getText());
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String cur_id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String p_id = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String p_name = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String id_unit = jTable1.getValueAt(jTable1.getSelectedRow(),3).toString();
        String sp_id = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String price = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String cur_amount = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String total_price = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
        String cur_discount = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
        String data_order = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString();
        String date_sent = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
         int p_idSave = Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
         Connection c1 = null, c2 = null;
         int p_idOrder = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
         int p_idStock = Integer.parseInt(jTable2.getValueAt(p_idSave, 6).toString());
         p_idStock = p_idStock - p_idOrder; 
         float total_price2 = Float.parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
         try{
             try {
                c1 = DriverManager.getConnection("jdbc:mysql://localhost/warehouse", "root", "ka9876543210");
                c1.setAutoCommit(false);        
                    String sql = "update warehouse.stock SET amount ="+ p_idStock +
                        " WHERE p_id="+Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                    PreparedStatement preparedStmt = c1.prepareStatement(sql);
                    preparedStmt.executeUpdate();
               c3 = DriverManager.getConnection("jdbc:mysql://localhost/sellingdb", "root", "ka9876543210");
               s3 = c3.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
               r3 = s3.executeQuery("Select * from budget");
               r3.next();
               float money =  Float.parseFloat(r3.getString("money"));
               money = money + total_price2;
               String sql2 = "update sellingdb.budget SET money ="+ money + " WHERE idBudget="+ 1;
               PreparedStatement preparedStmt2 = c3.prepareStatement(sql2);
               preparedStmt2.executeUpdate();
               c1.commit();
            } catch (Exception e1) {
                javax.swing.JOptionPane.showMessageDialog(null,
                    e1, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
            try{
                c2 = DriverManager.getConnection("jdbc:mysql://localhost/warehouse", "root", "ka9876543210");
                String sql2 = "DELETE FROM curorder WHERE cur_id="+cur_id;
                PreparedStatement preparedStmt2 = c2.prepareStatement(sql2);
                c2.setAutoCommit(false);
                preparedStmt2.execute();
            }catch (SQLException e1) {
                javax.swing.JOptionPane.showMessageDialog(null,
                    e1, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            c2.commit();
            c2.close();
            javax.swing.JOptionPane.showMessageDialog(null,
                "Successfully Deleted Data !", "System",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            model2.setRowCount(0);
            LoadOrder();
            LoadStock();
            }catch(Exception e) {
                javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            try{
                c2.rollback();
            }catch(Exception e1){javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
       }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button15_2.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button15.png")));
    }//GEN-LAST:event_jLabel5MouseExited

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
            java.util.logging.Logger.getLogger(InputDataToStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputDataToStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputDataToStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputDataToStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputDataToStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    public static transient javax.swing.JLabel jLabelID;
    public static transient javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private GUI.swing.table.Table jTable1;
    private GUI.swing.table.Table jTable2;
    private GUI.swing.RoundPanel roundPanel2;
    private GUI.swing.RoundPanel roundPanel3;
    // End of variables declaration//GEN-END:variables
}
