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
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Person extends javax.swing.JFrame {
    Connection c1;
    Statement s1;
    ResultSet r1;
    Connection c2;
    Statement s2;
    ResultSet r2;
    Connection c3;
    Statement s3;
    ResultSet r3;
    /**
     * Creates new form GetGroupId
     */
    public Person() {
        initComponents();
        init();
        Load();
        Load2();
    }
    
    private void init(){
         jTable1.fixTable(jScrollPane1);
         jTable4.fixTable(jScrollPane4);
    }
    
     public void Search(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         c1 = DriverManager.getConnection("jdbc:mysql://localhost/logindb", "root", "ka9876543210");
         s1 = c1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         r1 = s1.executeQuery("Select * from user where id="+Integer.parseInt(search.getText()));
        int rec=0;
         while(r1.next()){
             rec++;
         }
         
         String[][] datatable = new String[rec][3];
         String[] head = {"ID", "Username", "Password"};
         int count=0;
         r1.first();  
         datatable[count][0] = r1.getString("id");
         datatable[count][1] = r1.getString("uname");
         datatable[count][2] =r1.getString("password");
         count++;
         while (r1.next()){
                datatable[count][0] = r1.getString("id");
                datatable[count][1] = r1.getString("uname");
                datatable[count][2] =r1.getString("password");
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
         c1 = DriverManager.getConnection("jdbc:mysql://localhost/logindb","root", "ka9876543210");
         s1 = c1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         r1 = s1.executeQuery("Select * from user");
         int rec=0;
         while(r1.next()){
             rec++;
         }
         
         String[][] datatable = new String[rec][3];
         String[] head = {"ID", "Username", "Password"};
         int count=0;
         r1.first();  
         datatable[count][0] = r1.getString("id");
         datatable[count][1] = r1.getString("uname");
         datatable[count][2] =r1.getString("password");
         count++;
         while (r1.next()){
                datatable[count][0] = r1.getString("id");
                datatable[count][1] = r1.getString("uname");
                datatable[count][2] =r1.getString("password");
                count++;
         }
         
          jTable1.setModel(new javax.swing.table.DefaultTableModel(datatable,head));
        }catch(Exception e){
         javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

      public void Search2(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         c2 = DriverManager.getConnection("jdbc:mysql://localhost/personel", "root", "ka9876543210");
         s2 = c2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         r2 = s2.executeQuery("Select * from profile where id="+Integer.parseInt(search3.getText()));
        int rec=0;
         while(r2.next()){
             rec++;
         }
         
         String[][] datatable = new String[rec][10];
         String[] head = {"ID", "Fname", "Lname", "Email", "Tel", "Role", "Aumpher", "Graduate", "NameTitle", "Province"};
         int count=0;
         r2.first();  
         datatable[count][0] = r2.getString("id");
         datatable[count][1] = r2.getString("fname");
         datatable[count][2] = r2.getString("lname");
         datatable[count][3] = r2.getString("email");
         datatable[count][4] = r2.getString("tel");
         datatable[count][5] = r2.getString("role");
         datatable[count][6] = r2.getString("id_aumpher");
         datatable[count][7] = r2.getString("id_graduate");
         datatable[count][8] = r2.getString("id_title");
         datatable[count][9] = r2.getString("id_province");    
         count++;
         while (r2.next()){
                datatable[count][0] = r2.getString("id");
                datatable[count][1] = r2.getString("fname");
                datatable[count][2] = r2.getString("lname");
                datatable[count][3] = r2.getString("email");
                datatable[count][4] = r2.getString("tel");
                datatable[count][5] = r2.getString("role");
                datatable[count][6] = r2.getString("id_aumpher");
                datatable[count][7] = r2.getString("id_graduate");
                datatable[count][8] = r2.getString("id_title");
                datatable[count][9] = r2.getString("id_province");        
                count++;
         }
          jTable4.setModel(new javax.swing.table.DefaultTableModel(datatable,head));
      }catch(Exception e){
          javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
      }
     }
     
     public void Load2(){
         try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         c2 = DriverManager.getConnection("jdbc:mysql://localhost/personel","root", "ka9876543210");
         s2 = c2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         r2 = s2.executeQuery("Select * from profile");
         int rec=0;
         while(r2.next()){
             rec++;
         }
         
         String[][] datatable = new String[rec][10];
         String[] head = {"ID", "Fname", "Lname", "Email", "Tel", "Role", "Aumpher", "Graduate", "NameTitle", "Province"};
         int count=0;
         r2.first();  
         datatable[count][0] = r2.getString("id");
         datatable[count][1] = r2.getString("fname");
         datatable[count][2] = r2.getString("lname");
         datatable[count][3] = r2.getString("email");
         datatable[count][4] = r2.getString("tel");
         datatable[count][5] = r2.getString("role");
         datatable[count][6] = r2.getString("id_aumpher");
         datatable[count][7] = r2.getString("id_graduate");
         datatable[count][8] = r2.getString("id_title");
         datatable[count][9] = r2.getString("id_province");    
         count++;
         while (r2.next()){
                datatable[count][0] = r2.getString("id");
                datatable[count][1] = r2.getString("fname");
                datatable[count][2] = r2.getString("lname");
                datatable[count][3] = r2.getString("email");
                datatable[count][4] = r2.getString("tel");
                datatable[count][5] = r2.getString("role");
                datatable[count][6] = r2.getString("id_aumpher");
                datatable[count][7] = r2.getString("id_graduate");
                datatable[count][8] = r2.getString("id_title");
                datatable[count][9] = r2.getString("id_province");        
                count++;
         }
          jTable4.setModel(new javax.swing.table.DefaultTableModel(datatable,head));
        }catch(Exception e){
         javax.swing.JOptionPane.showMessageDialog(null,
                    e, "System",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        search = new GUI.TextFieldSuggestion();
        jLabel6 = new javax.swing.JLabel();
        roundPanel4 = new GUI.swing.RoundPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        roundPanel3 = new GUI.swing.RoundPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new GUI.swing.table.Table();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        search3 = new GUI.TextFieldSuggestion();
        jLabel22 = new javax.swing.JLabel();
        roundPanel7 = new GUI.swing.RoundPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

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
        jLabel43.setText("Person");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, 20));

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel18.setText("_");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 20, 37));

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel19.setText("X");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 30, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/arrorw.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

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

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel2.setText("Account");

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 0, 16)); // NOI18N
        jLabel5.setText("SearchID");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button4.png"))); // NOI18N
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

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap())
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(jLabel2)
                .addContainerGap(454, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        roundPanel4.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        roundPanel4.setRound(10);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button22.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/delete.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        roundPanel3.setRound(10);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable4.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jScrollPane4.setViewportView(jTable4);

        jLabel20.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel20.setText("Profile");

        jLabel21.setFont(new java.awt.Font("TH SarabunPSK", 0, 16)); // NOI18N
        jLabel21.setText("SearchID");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button4.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(458, 458, 458))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        roundPanel7.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        roundPanel7.setRound(10);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button21.png"))); // NOI18N
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

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/delete.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });

        javax.swing.GroupLayout roundPanel7Layout = new javax.swing.GroupLayout(roundPanel7);
        roundPanel7.setLayout(roundPanel7Layout);
        roundPanel7Layout.setHorizontalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel7Layout.setVerticalGroup(
            roundPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel7Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1200, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Admin Admin = new Admin();
        Admin.setVisible(true);
        Admin.jLabelID.setText(jLabelID.getText());
        Admin.jLabelName.setText(jLabelName.getText());
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        this.setExtendedState(Person.ICONIFIED);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
       Search2();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button22.png")));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button22_2.png")));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        AddAccount AddAccount  = new AddAccount();
        AddAccount.setVisible(true);
        AddAccount.jLabelID.setText(jLabelID.getText());
        AddAccount.jLabelName.setText(jLabelName.getText());
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button4.png")));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button5.png")));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Search();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        Connection c3 = null;
        String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        int c_id=  Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        int Chack = 10200;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try{
                c3 = DriverManager.getConnection("jdbc:mysql://localhost/logindb", "root", "ka9876543210");
                String sql3 = "DELETE FROM user  WHERE id="+ id;
                PreparedStatement preparedStmt3 = c3.prepareStatement(sql3);
                if( c_id == Chack){
                     javax.swing.JOptionPane.showMessageDialog(null,
                "Admin cannot be deleted !", "System",
                javax.swing.JOptionPane.ERROR_MESSAGE);
                }else{
                     c3.setAutoCommit(false);
                     preparedStmt3.execute();
                }
            }catch (SQLException e1) {}
            c3.commit();
            c3.close();
            javax.swing.JOptionPane.showMessageDialog(null,
                "Successfully Deleted Data !", "System",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            Load();
        }catch(Exception e) {
            try{
                c3.rollback();
            }catch(Exception e1){}
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
         jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/delete2.png")));
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
         jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/delete.png")));
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        AddProfile AddProfile  = new AddProfile();
        AddProfile.setVisible(true);
        AddProfile.jLabelID.setText(jLabelID.getText());
        AddProfile.jLabelName.setText(jLabelName.getText());
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button21_2.png")));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/button21.png")));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        Connection c3 = null;
        String id = jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString();
        int c_id=  Integer.parseInt( jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
        int Chack = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try{
                c3 = DriverManager.getConnection("jdbc:mysql://localhost/personel", "root", "ka9876543210");
                String sql3 = "DELETE FROM profile  WHERE id="+ id;
                PreparedStatement preparedStmt3 = c3.prepareStatement(sql3);
                if( c_id == Chack){
                     javax.swing.JOptionPane.showMessageDialog(null,
                "Admin cannot be deleted !", "System",
                javax.swing.JOptionPane.ERROR_MESSAGE);
                }else{
                     c3.setAutoCommit(false);
                     preparedStmt3.execute();
                }
            }catch (SQLException e1) {}
            c3.commit();
            c3.close();
            javax.swing.JOptionPane.showMessageDialog(null,
                "Successfully Deleted Data !", "System",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model2 = (DefaultTableModel) jTable4.getModel();
            model2.setRowCount(0);
            Load2();
        }catch(Exception e) {
            try{
                c3.rollback();
            }catch(Exception e1){}
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
         jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/delete2.png")));
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
         jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Program/delete.png")));
    }//GEN-LAST:event_jLabel24MouseExited

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
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Person().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static transient javax.swing.JLabel jLabelID;
    public static transient javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    public static transient GUI.swing.table.Table jTable1;
    public static transient GUI.swing.table.Table jTable4;
    private GUI.swing.RoundPanel roundPanel2;
    private GUI.swing.RoundPanel roundPanel3;
    private GUI.swing.RoundPanel roundPanel4;
    private GUI.swing.RoundPanel roundPanel7;
    private GUI.TextFieldSuggestion search;
    private GUI.TextFieldSuggestion search3;
    // End of variables declaration//GEN-END:variables

}
