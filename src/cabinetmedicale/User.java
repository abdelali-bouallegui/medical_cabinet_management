/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinetmedicale;

import java.util.logging.Logger;

/**
 *
 * @author hackimos
 */
public class User {
 private int id;
 private String login;
 private String password;
 private String profession;

    public User() {
    }

    public User(int id, String login, String password, String profession) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getProfession() {
        return profession;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
   
 
 
 
}
