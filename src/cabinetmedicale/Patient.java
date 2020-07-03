
package cabinetmedicale;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author hackimos
 */
public class Patient {
   private int id;
   private String Nom;
  private  String Prenom;
   private String Tel;
   private String Cin;
   private String date_naissance;
    private String sexe;

    public Patient() {
    }

    public Patient(int id, String Nom, String Prenom, String Tel, String Cin, String date_naissance, String sexe) {
        this.id = id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Tel = Tel;
        this.Cin = Cin;
        this.date_naissance = date_naissance;
        this.sexe = sexe;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getTel() {
        return Tel;
    }

    public String getCin() {
        return Cin;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public void setCin(String Cin) {
        this.Cin = Cin;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
    
   /* public int CalculAge()
    {
    Date d=new Date();
    return (d.getYear()-this.date_naissance.getYear());
    
    
    }*/
    public void Afficher()
    {
    JOptionPane.showMessageDialog(null,"Identifiant: "+id+"\nNom: "+Nom+"\nPrenom: "+Prenom+"\nTel: "+Tel+"\nCIN"+Cin+"\nSexe: "+sexe);
    }
    
    
    
       
}
