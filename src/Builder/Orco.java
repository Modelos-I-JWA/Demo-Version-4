/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Juan David
 */
public class Orco extends Personaje{
    public Orco() {
        super.setHilo(5,6, 5, 4, 3, velocidad);
        super.ancho = 250;
        super.alto = 150;
        super.relacion = 3;
        super.derecha = new ImageIcon[5];
        super.izquierda= new ImageIcon[6];
        super.saltar = new ImageIcon[5];
        super.morir = new ImageIcon[4];
        super.atacar = new ImageIcon[3];
        super.hitbox = new Rectangle(desplazamientoHorizontal+(ancho/2)-10, desplazamientoVertical+(alto/4), (ancho/2)-40, (alto/2)+25); 
    }
}
