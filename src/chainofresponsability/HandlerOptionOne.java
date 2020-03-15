/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import Builder.Personaje;

/**
 *
 * @author Nicolas Andrade
 */
public class HandlerOptionOne extends Handler {
    //Personaje vida;

    @Override
    public void handlerRequest(int opt, Personaje per) {
        if (opt == 1) {
            per.setVelocidad(per.getVelocidad() + 30);
            System.out.println(per.getVelocidad());
        } else {
            successor.handlerRequest(opt, per);
        }
    }

}
