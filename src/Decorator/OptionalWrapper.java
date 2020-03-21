/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Nicolas Andrade
 */
public abstract class OptionalWrapper extends Component{
    protected Component componente;

    public OptionalWrapper(Component componente) {
        this.componente = componente;
    }
}
