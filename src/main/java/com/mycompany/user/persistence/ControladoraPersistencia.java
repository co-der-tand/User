
package com.mycompany.user.persistence;

import com.mycompany.user.logic.Rol;
import com.mycompany.user.logic.User;
import com.mycompany.user.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    UserJpaController userJpa = new UserJpaController();
    RolJpaController rolJpa = new RolJpaController();

  

    public void createUser(User us) {
       userJpa.create(us);
    }

  

    public List<User> traerUsuarios() {
       return userJpa.findUserEntities();
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
    }

    public Rol traerRol(int id) {
        return rolJpa.findRol(id);
    }

    public User traerUser(int id) {
        
       return userJpa.findUser(id);
    }

    public void editarUser(User us) {
    
        try {
            userJpa.edit(us);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void eliminarUser(int id) {
        try {
            userJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

   

    
}
