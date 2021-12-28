/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.personal;

import org.springframework.stereotype.Component;

/**
 *
 * @author Tapia
 */
@Component("docen")
public class Docentes implements Personal {
    
    public Docentes(){
        
    }
    
    @Override
    public void listarp(){
        System.out.println("Lista de Docentes");
    }
}
