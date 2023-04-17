/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package possystem;

/**
 *
 * @author Asus
 */
import javax.swing.JFrame;
public class POSSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        user.Login mainmenu = new user.Login();
        mainmenu.setVisible(true);
        
        //เต็มจอ
        //mainmenu.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
    
}
