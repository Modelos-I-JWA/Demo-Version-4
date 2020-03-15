/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import Builder.Personaje;
import java.util.Scanner;

/**
 *
 * @author Nicolas Andrade
 */
public class Implementar  {
        Handler manejadores[];

    

   
    public void operacion(int opt,Personaje per) {
        manejadores = new Handler[2];
        manejadores[1] = new HandlerOptionTwo();
        manejadores[0] = new HandlerOptionOne();
        for(int i=0; i<manejadores.length - 1;i++){
            manejadores[i].setSuccessor(manejadores[i+1]); ;
        }
        manejadores[0].handlerRequest(opt, per);
    }
}