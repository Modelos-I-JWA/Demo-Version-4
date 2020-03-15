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
public abstract class Handler {
    Handler successor;
    
    public abstract void handlerRequest(int opt, Personaje per);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
        
    
    
}


