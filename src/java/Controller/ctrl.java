/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import clientesDAO.clDAO;
import entidades.Clientes;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author vidarte
 */
@Named(value = "ctrl")
@SessionScoped
public class ctrl implements Serializable {

    /**
     * Creates a new instance of ctrl
     */
    @EJB
    private clDAO cd;
    public ctrl() {
    }
    
    public void crearr(Clientes x){
        cd.crear(x);
        
    }
}
