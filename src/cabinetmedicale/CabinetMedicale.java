/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinetmedicale;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hackimos
 */
public class CabinetMedicale { 

 //this.setIconImage (new ImageIcon(getClass().getResource("/img/logo.png")).getImage()); 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
     SplashScreen   SS=new SplashScreen();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CabinetMedicale.class.getName()).log(Level.SEVERE, null, ex);
                }
                new NewJFrame0().setVisible(true);
            }
        });
        
    }
    //cabinet medicale click droit apres propriété apres build compiling ... 
}
