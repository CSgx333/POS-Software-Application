/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myUtilitys;
import java.sql.*;
/**
 *
 * @author Asus
 */
public class MyConnect {
     Connection c1;
     Statement s1;
     ResultSet r1;
     public ResultSet GetAllRow(String db, String table){
          try{  
          Class.forName("com.mysql.cj.jdbc.Driver");
         c1 = DriverManager.getConnection("jdbc:mysql://localhost/"+db,"root", "ka9876543210");        
         s1 = c1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         r1 = s1.executeQuery("Select * from "+table);                
      }catch(Exception e){System.out.println(e);}
          return r1;
     }
}
