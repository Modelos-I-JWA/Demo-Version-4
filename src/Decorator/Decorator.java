/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import java.util.ArrayList;


/**
 *
 * @author daza
 */
public class Decorator{

   public String DecoratorArmadura() {
        Component real = new Original();
        Component Armadura = new PonerArmadura(real);
       return  Armadura.doThis();
    }
    
}
