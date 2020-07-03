/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import BdPackage.Traitement;
import cabinetmedicale.NewJFrame1;
import cabinetmedicale.Patient;
import cabinetmedicale.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hackimos
 */
public class UserManager implements Manager<User>{

    @Override
    public ArrayList<User> getAll() {
     try {
            Traitement trm=new Traitement();
            ResultSet rs=trm.exeRead("Select * from User;");
            ArrayList<User> alp=new ArrayList();
            while(rs.next()){
                User U=new User();
                U.setId(rs.getInt(1));
                U.setLogin(rs.getString(2));
                U.setPassword(rs.getString(3));
                U.setProfession(rs.getString(4));
                alp.add(U);}
            return alp;
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public User FindById(int x) {
try {
            Traitement trm=new Traitement();
            ResultSet rs=trm.exeRead("select * from User where ID="+x+";");
            if(rs.next())
            {User U=new User();
           U.setId(rs.getInt(1));
                U.setLogin(rs.getString(2));
                U.setPassword(rs.getString(3));
                U.setProfession(rs.getString(4));
            return U;}
            else {return null;}
        } catch (SQLException ex) {
            Logger.getLogger(PatientManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }    }

    @Override
    public ArrayList<User> FindByString(String x) {
try {
            Traitement trm=new Traitement();
            ResultSet rs=trm.exeRead("Select * from Patient where login like '%"+x+"%';");
            ArrayList<User> alp=new ArrayList();
            while(rs.next()){
        
               User U=new User();
           U.setId(rs.getInt(1));
                U.setLogin(rs.getString(2));
                U.setPassword(rs.getString(3));
                U.setProfession(rs.getString(4));
                alp.add(U);}
            return alp;
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }    
    }

    @Override
    public boolean Update(User x) {
Traitement trm=new Traitement();
       trm.exeUpdate("update User set id='"+x.getId()+"',login='"+x.getLogin()+"',password='"+x.getPassword()+"',profession='"+x.getProfession()+"';");
        return true;
    }

    @Override
    public boolean Delete(User x) {
Traitement trm=new Traitement();
        trm.exeDelete("Delete from User where ID="+x.getId()+";");
        return true;
    }

    @Override
    public boolean Insert(User x) {
String sql="Insert into User(login,password,profession) values('"+x.getLogin()+"','"+x.getPassword()+"','"+x.getProfession()+"');";
Traitement trm=new Traitement();
trm.exeUpdate(sql);
return true;
    }
    
}
