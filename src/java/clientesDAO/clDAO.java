/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesDAO;

import entidades.Clientes;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author vidarte
 */
@Stateless
public class clDAO {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext(name = "TP3ej1PU")
    private EntityManager em;
    
    public void crear(Clientes x){
        em.persist(x);
        em.merge(x);
        em.remove(em.merge(x));
        if(2<3){
        Query q= em.createNamedQuery("Clientes.findAll");
        //return (List<Clientes>) q.getResultList();
        }
        else{
            Query w= em.createNamedQuery("Clientes.findByCliCodigo");
            //return (Clientes) w.getFirstResult();
        }
    }
}
