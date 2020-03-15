/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;
import Builder.Personaje;
import java.awt.event.KeyEvent;
/**
 *
 * @author AndresFWilT
 */
public class Flechas extends Control {
    public Flechas(KeyEvent evento, Personaje personaje) {
        super(evento, personaje);
    }
    
    public void identificarEvento() {
        if (evento != null) {
            switch (evento.getKeyCode()) {
                case 39:
                    accion = 1;
                    break;
                case 38:
                    accion = 2;
                    break;
                case 37:
                    accion = 3;
                    break;
                case 40:
                    accion = 4;
                    break;
                case 97:
                    accion = 5;
                    break;
                case 98:
                    accion = 7;
                    break;
                case 99:
                    accion = 6;
                    break;
                default:
                    break;
            }
        }
    }
}
