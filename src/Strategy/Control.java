/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Builder.Personaje;
import Decorator.Component;
import Decorator.RealComponent;
import Decorator.WrapperUno;
import java.awt.event.KeyEvent;
import Vista.Vista1;

/**
 *
 * @author AndresFWilT
 */
public abstract class Control extends Selector {

    Selector s = new Selector();

    public void operar(int c, Personaje a) {
        if (c == 1) {
            s.selector(c, a);
        }
        if (c == 2) {
            s.selector(c,a);
        }
        if (c == 3) {
            s.selector(c,a);
        }
    }

}

