/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author daza
 */
public class PonerArmadura extends OptionalWrapper{

    public PonerArmadura(Component componente) {
        super(componente);
    }
    
    
    @Override
    public String doThis() {
        return componente.doThis()+"/Armadura/Armadura.jpg";
    }
   
    
}
