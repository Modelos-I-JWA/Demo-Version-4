/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Builder.Personaje;

/**
 *
 * @author Nicolas Andrade
 */
public class WrapperUno extends OptionalWrapper {

    public WrapperUno(Component componente) {
        super(componente);
    }

    @Override
    public Personaje doThis(Personaje per) {
        per.ampliar=100;
        return componente.doThis(per);
    }

    

}
