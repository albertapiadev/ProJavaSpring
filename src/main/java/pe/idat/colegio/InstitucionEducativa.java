/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.colegio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pe.idat.personal.Personal;


/**
 *
 * @author Tapia
 */
@Component("colegio")
public class InstitucionEducativa {
    
    @Autowired
    @Qualifier("alum") //
    private Personal personal;
    
    public InstitucionEducativa(){
        
    };
    public void listarPersonas(){
        personal.listarp();
    }
    
}
