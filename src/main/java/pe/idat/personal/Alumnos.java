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
@Component("alum")
public class Alumnos implements Personal{
    
    public Alumnos(){
       
    }
    
    @Override
    public void listarp(){
        System.out.println("Lista de Alumnos");
    }
    
}
