/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import Builder.Personaje;

/**
 *
 * @author estudiantes
 */
public class HandlerOptionTwo extends Handler{

    @Override
    public void handlerRequest(int opt, Personaje per) {
        if(opt == 2){
            per.setvAnimacion(per.getvAnimacion() + 5);
            System.out.println(per.getVelocidad()+" jjj");
        }
    }

    
    
}
