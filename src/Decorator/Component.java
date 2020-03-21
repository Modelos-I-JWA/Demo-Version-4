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
public abstract class Component {

    abstract public Personaje doThis(Personaje per);

   
}
