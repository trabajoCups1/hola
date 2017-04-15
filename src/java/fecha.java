/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import java.time.LocalTime;
/**
 *
 * @author vidarte
 */
@Named(value = "fecha")
@Dependent
public class fecha {

    
    /**
     * Creates a new instance of fecha
     */
    public fecha() {
        
    }
    
    public String saludo(){
        LocalTime horaActual = LocalTime.now();
        int hora= horaActual.getHour();
        if(hora<12 && hora>=8){
            return "Buenos Dias";
        }else if(hora>=12 && hora<20){
            return "Buenas Tardes";            
        }else{
            return "Buenas Noches";
        }
    }
    
}
