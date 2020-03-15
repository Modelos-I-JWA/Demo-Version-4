/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.ArrayList;


/**
 *
 * @author Juan
 */
public class Prototype {

    
     public ArrayList<String>  prototype(int NoPersonajes,ArrayList<String> Mov) {
      
        
        CreadorPersonajes PerCreator = new CreadorPersonajes(Mov);
        Clones[] PersonajeClonado = new Clones[NoPersonajes];
        for(int i=0;i<NoPersonajes;i++)
        PersonajeClonado[i] = PerCreator.CrearClon();
        
        return PerCreator.CrearClon().ClonarAccion();
     }
}
