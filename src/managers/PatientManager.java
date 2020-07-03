/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import BdPackage.Traitement;
import cabinetmedicale.NewJFrame1;
import cabinetmedicale.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hackimos
 */
public class PatientManager implements Manager<Patient> {

    @Override
    public ArrayList<Patient> getAll() {
       try {
            Traitement trm=new Traitement();
            ResultSet rs=trm.exeRead("Select * from Patient;");
            ArrayList<Patient> alp=new ArrayList();
            while(rs.next()){
                Patient P=new Patient();
                P.setId(rs.getInt(1));
                P.setNom(rs.getString(2));
                P.setPrenom(rs.getString(3));
                P.setTel(rs.getString(4));
                P.setCin(rs.getString(5));
                P.setDate_naissance(rs.getString(6));
                P.setSexe(rs.getString(7));
                alp.add(P);}
            return alp;
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }

    @Override
    public Patient FindById(int x) {
        try {
            Traitement trm=new Traitement();
            ResultSet rs=trm.exeRead("select * from Patient where ID="+x+";");
            if(rs.next())
            {Patient P=new Patient();
            P.setId(rs.getInt(1));
            P.setNom(rs.getString(2));
            P.setPrenom(rs.getString(3));
            P.setTel(rs.getString(4));
            P.setCin(rs.getString(5));
            P.setDate_naissance(rs.getString(6));
            P.setSexe(rs.getString(7));
            return P;}
            else {return null;}
        } catch (SQLException ex) {
            Logger.getLogger(PatientManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}

    @Override
    public ArrayList<Patient> FindByString(String x) {
 try {
            Traitement trm=new Traitement();
            ResultSet rs=trm.exeRead("Select * from Patient where prenom like '%"+x+"%';");
            ArrayList<Patient> alp=new ArrayList();
            while(rs.next()){
                Patient P=new Patient();
                P.setId(rs.getInt(1));
                P.setNom(rs.getString(2));
                P.setPrenom(rs.getString(3));
                P.setTel(rs.getString(4));
                P.setCin(rs.getString(5));
                P.setDate_naissance(rs.getString(6));
                P.setSexe(rs.getString(7));
                alp.add(P);}
            return alp;
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }    }

    @Override
    public boolean Update(Patient x) {
Traitement trm=new Traitement();
       trm.exeUpdate("update Patient set Nom='"+x.getNom()+"',Prenom='"+x.getPrenom()+"',Telephone='"+x.getTel()+"',CIN='"+x.getCin()+"',DateNaissance='"+x.getDate_naissance()+"',Sexe='"+x.getSexe()+"' where Id="+x.getId()+";");
        return true;
    }

    @Override
    public boolean Delete(Patient x) {
  Traitement trm=new Traitement();
        trm.exeDelete("Delete from Patient where ID="+x.getId()+";");
        return true;
    }

    @Override
    public boolean Insert(Patient x) {
String sql="Insert into Patient(Nom,Prenom,Telephone,CIN,DateNaissance,Sexe) values('"+x.getNom()+"','"+x.getPrenom()+"','"+x.getTel()+"','"+x.getCin()+"','"+x.getDate_naissance()+"','"+x.getSexe()+"');";
Traitement trm=new Traitement();
trm.exeUpdate(sql);
return true;}
    
}
