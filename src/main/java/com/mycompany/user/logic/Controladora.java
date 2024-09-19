package com.mycompany.user.logic;

import com.mycompany.user.persistence.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public User validateUser(String user, String password) {

        User usu = null;

        List<User> listUser = controlPersis.traerUsuarios();

        for (User us : listUser) {

            if (us.getUser().equals(user)) {

                if (us.getPassword().equals(password)) {

                    usu = us;
                    return usu;
                }

            }

        }

        return usu;
    }

    public void createUser(String user, String password, int rol) {

        User us = new User();
     
        Rol r = controlPersis.traerRol(rol);
    
        us.setUser(user);
        us.setPassword(password);
        us.setRol(r);
        

        controlPersis.createUser(us);
        
        
    }

    public List<User> traerUsuariosComunes() {
        return controlPersis.traerUsuarios();
    }

    public List<User> traerUsuarios() {

        return controlPersis.traerUsuarios();

    }


    public User traerUser(int id) {
       return controlPersis.traerUser(id);
    }

    public void editarUser(User us, String user, String password, int idRol) {
     
        Rol r = controlPersis.traerRol(idRol);
      
        
        
        us.setUser(user);
        us.setPassword(password);
        us.setRol(r);
        
        controlPersis.editarUser(us);
        
    }

    public void eliminarUsuario(int id) {
        controlPersis.eliminarUser(id);
    }

    public List<Rol> traerRoles() {
       return controlPersis.traerRoles();
    }

}
