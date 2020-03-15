/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author daza
 */
public abstract class OptionalWrapper implements Component{
    protected Component componente;

    public OptionalWrapper(Component componente) {
        this.componente = componente;
    }
    
    

    
}
