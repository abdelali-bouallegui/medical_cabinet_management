/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BdPackage;
import cabinetmedicale.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hackimos
 */
public class Traitement {
    MyConnexion cnx=MyConnexion.getInstance();
    
  public boolean exeCreate(String sql){
        try {
            Statement stm = cnx.getConnection().createStatement();
            stm.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
 public ResultSet exeRead(String sql)
 {
        try {
         Statement stm = cnx.getConnection().createStatement();
             return(stm.executeQuery(sql));
                  
      }
       catch (SQLException ex) {
            Logger.getLogger(Traitement.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
 }
 public void exeUpdate(String sql)
 {
  
            Statement stm;
        try {
            stm = cnx.getConnection().createStatement();
             stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Traitement.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
 }
 public void exeDelete(String sql)
 {
          Statement stm;
        try {
            stm = cnx.getConnection().createStatement();
             stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Traitement.class.getName()).log(Level.SEVERE, null, ex);
        }
     
 }
 
}
