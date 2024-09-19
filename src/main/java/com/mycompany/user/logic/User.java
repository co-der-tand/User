
package com.mycompany.user.logic;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)        
   private int id;
    @Basic
   private String user ;
   private String password;
   @ManyToOne
   @JoinColumn(name="id_rol")
   private Rol rol;
  
   

    public User() {
    }

    public User(int id, String user, String password, Rol rol) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.rol = rol;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

   
    
    
    
}
