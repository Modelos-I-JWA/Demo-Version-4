/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Builder.Personaje;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author Montes Martinez
 */
public class Teletransporte implements Estado{

    @Override
    public void EjecutarAccion(KeyEvent e, ArrayList<Personaje> p) {
            switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                p.get(0).desplazamiento = 5;
                p.get(1).desplazamiento = 5;
                p.get(0).mover();
                p.get(1).mover();
                break;

            case KeyEvent.VK_UP:
                p.get(0).desplazamiento = 6;
                p.get(1).desplazamiento = 6;
                p.get(0).mover();
                p.get(1).mover();
                break;

            case KeyEvent.VK_LEFT:
                p.get(0).desplazamiento = 7;
                p.get(1).desplazamiento = 7;
                p.get(0).mover();
                p.get(1).mover();
                break;

            case KeyEvent.VK_DOWN:
                p.get(0).desplazamiento = 8;
                p.get(1).desplazamiento = 8;
                p.get(0).mover();
                p.get(1).mover();
                break;
        }
    }
}
