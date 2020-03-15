/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;
import java.util.ArrayList;

/**
 *
 * @author daza
 */
public class CreadorPersonajes {
    
    private PersoOriginal Personaje;

    public CreadorPersonajes(ArrayList<String> Movimiento) {
        Personaje = new PersoOriginal();
        
        
        Personaje.setDescription(Movimiento);
      
        
    }
    
    

    public Clones CrearClon() {

            return (Clones) Personaje.clone();
        
    } 
}
