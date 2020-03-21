/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;


import AbstractFactory.AtaqueOrco;
import AbstractFactory.DerechaOrco;
import AbstractFactory.IzquierdaOrco;
import AbstractFactory.MuerteOrco;
import AbstractFactory.SaltoOrco;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Juan David
 */
public class ConstructorOrco extends BuilderPersonaje{
     @Override
    public void ConstruirPersonaje() {
        personaje = new Orco();
        ataque= new AtaqueOrco();
        derecha= new DerechaOrco();
        izquierda= new IzquierdaOrco();
        salto= new SaltoOrco();
        muerte= new MuerteOrco();
    }

    @Override
    public void CrearAnimaciones() {
        for (int i = 0; i < 5; i++) {
            try {
                personaje.derecha[i]= new ImageIcon(ImageIO.read(new File(derecha.operacion().get(i))));
            } catch (IOException ex) {
                Logger.getLogger(Orco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 6; i++) {
            try {
                personaje.izquierda[i]= new ImageIcon(ImageIO.read(new File(izquierda.operacion().get(i))));
            } catch (IOException ex) {
                Logger.getLogger(Orco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 5; i++) {
            try {
                personaje.saltar[i] = new ImageIcon(ImageIO.read(new File(salto.operacion().get(i))));
            } catch (IOException ex) {
                Logger.getLogger(Orco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 4; i++) {
            try {
                personaje.morir[i] = new ImageIcon(ImageIO.read(new File(muerte.operacion().get(i))));
            } catch (IOException ex) {
                Logger.getLogger(Orco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                personaje.atacar[i] = new ImageIcon(ImageIO.read(new File(ataque.operacion().get(i))));
            } catch (IOException ex) {
                Logger.getLogger(Orco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


