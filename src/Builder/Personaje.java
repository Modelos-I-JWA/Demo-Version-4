package Builder;

import Strategy.Control;
import Vista.Vista1;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import Vista.Vista1;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class Personaje extends JComponent implements Cloneable {

    protected ImageIcon[] derecha;
    protected ImageIcon[] izquierda;
    protected ImageIcon[] saltar;
    protected ImageIcon[] morir;
    protected ImageIcon[] atacar;
    protected Control ctr;
    static ImageIcon img;
    public int desplazamiento;
    public int tempDesplazamiento;
    int x = 0;
    int numero = 0;
    int ancho = 0;
    int alto = 0;
    int desplazamientoVertical = 0;
    int desplazamientoHorizontal = 0;
    int relacion = 0;
    public int velocidad;
    public int vAnimacion;
    public int ampliar;
    Rectangle hitbox;
    Rectangle poder;
    static JPanel panel;
    static JLabel Imagen = null;
    public Thread hilo;

    // CONSTRUCTOR
    public Personaje() {

        velocidad = 240;
        vAnimacion = 24;
        ampliar = 0;
        hilo = null;
        derecha = null;
        izquierda = null;
        saltar = null;
        morir = null;
        atacar = null;
        x = 0;
        numero = 0;
        ancho = 0;
        alto = 0;
        relacion = 0;

    }

    public int isRelacion() {
        return relacion;
    }

    public void setDesplazamientoVertical(int desplazamiento) {
        this.desplazamientoVertical = desplazamiento;
    }

    public void setDesplazamientoHorizontal(int desplazamiento) {
        this.desplazamientoHorizontal = desplazamiento;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setHilo(final int derecha, final int izquierda, final int saltar, final int morir, final int atacar, final int sleep) {
        this.hilo = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        switch (x) {
                            case 0:
                                numero++;
                                switch (desplazamiento) {
                                    case 1:
                                        desplazamientoHorizontal += vAnimacion;
                                        hitbox.x += vAnimacion;
                                        tempDesplazamiento = desplazamiento;
                                        desplazamiento = 0;
                                        break;
                                    case 2:
                                        desplazamientoVertical -= vAnimacion;
                                        hitbox.y -= vAnimacion;
                                        tempDesplazamiento = desplazamiento;
                                        desplazamiento = 0;
                                        break;
                                    case 3:
                                        desplazamientoHorizontal -= vAnimacion;
                                        hitbox.x -= vAnimacion;
                                        tempDesplazamiento = desplazamiento;
                                        desplazamiento = 0;
                                        break;
                                    case 4:
                                        desplazamientoVertical += vAnimacion;
                                        hitbox.y += vAnimacion;
                                        tempDesplazamiento = desplazamiento;
                                        desplazamiento = 0;
                                        break;

                                    //TELETRANSPORTACION 
                                    case 5:
                                        desplazamientoHorizontal += 240;
                                        hitbox.x += 240;
                                        tempDesplazamiento = desplazamiento;
                                        desplazamiento = 0;
                                        break;
                                    case 6:
                                        desplazamientoVertical -= 240;
                                        hitbox.y -= 240;
                                        tempDesplazamiento = desplazamiento;
                                        desplazamiento = 0;
                                        break;
                                    case 7:
                                        desplazamientoHorizontal -= 240;
                                        hitbox.x -= 240;
                                        tempDesplazamiento = desplazamiento;
                                        desplazamiento = 0;
                                        break;
                                    case 8:
                                        desplazamientoVertical += 240;
                                        hitbox.y += 240;
                                        tempDesplazamiento = desplazamiento;
                                        desplazamiento = 0;
                                        break;
                                    default:
                                        break;
                                }
                                numero = numero % derecha;
                                panel.repaint();
                                hilo.sleep(sleep);
                                break;
                            case 1:
                                panel.repaint();
                                hilo.sleep(sleep);
                                if (numero >= saltar - 1) {
                                    numero = saltar - 1;
                                } else {
                                    numero++;
                                }
                                break;
                            case 2:
                                panel.repaint();
                                hilo.sleep(sleep);
                                if (numero >= morir - 1) {
                                    numero = morir - 1;
                                } else {
                                    numero++;
                                }
                                break;
                            case 3:
                                panel.repaint();
                                hilo.sleep(sleep);
                                if (numero >= atacar - 1) {
                                    numero = atacar - 1;
                                } else {
                                    numero++;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                } catch (java.lang.InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        };
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
        setBounds(0, 0, panel.getWidth(), panel.getHeight());
    }

    public ImageIcon[] getDerecha() {
        return derecha;
    }

    public void setDerecha(ImageIcon[] derecha) {
        this.derecha = derecha;
    }

    public ImageIcon[] getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(ImageIcon[] izquierda) {
        this.izquierda = izquierda;
    }

    public ImageIcon[] getSaltar() {
        return saltar;
    }

    public void setSaltar(ImageIcon[] saltar) {
        this.saltar = saltar;
    }

    public ImageIcon[] getMorir() {
        return morir;
    }

    public void setMorir(ImageIcon[] morir) {
        this.morir = morir;
    }

    public ImageIcon[] getAtacar() {
        return atacar;
    }

    public void setAtacar(ImageIcon[] atacar) {
        this.atacar = atacar;
    }

    // CLONE
    @Override
    public Personaje clone() {
        Personaje PersonajeClonado = null;
        try {
            PersonajeClonado = (Personaje) super.clone();
            if (PersonajeClonado.isRelacion() == 1) {
                PersonajeClonado.setHilo(6, 6, 6, 5, 5, velocidad);
            } else if (PersonajeClonado.isRelacion() == 2) {
                PersonajeClonado.setHilo(5, 5, 3, 7, 5, velocidad);
            } else if (PersonajeClonado.isRelacion() == 3) {
                PersonajeClonado.setHilo(5, 6, 5, 4, 3, velocidad);
            }

        } catch (CloneNotSupportedException e) {
        }
        return PersonajeClonado;
    }

    // PINTAR EN PANEL
    @Override
    public void paint(Graphics g) {
        try {
            g.drawRect(hitbox.x, hitbox.y, hitbox.width, hitbox.height);

            switch (x) {
                case 0:
                    g.drawImage(derecha[numero].getImage(), 50 + desplazamientoHorizontal, 0 + desplazamientoVertical, ancho, alto + ampliar, null);
                    break;
                case 1:

                    g.drawImage(saltar[numero].getImage(), 50 + desplazamientoHorizontal, desplazamientoVertical, ancho, alto + ampliar, null);

                    break;
                case 2:

                    g.drawImage(morir[numero].getImage(), 50 + desplazamientoHorizontal, desplazamientoVertical, ancho, alto + ampliar, null);

                    break;
                case 3:

                    g.drawImage(atacar[numero].getImage(), 50 + desplazamientoHorizontal, desplazamientoVertical, ancho, alto + ampliar, null);

                    break;
                default:
                    break;
            }
        } catch (Exception ex) {

        }
    }

    // ANIMACIONES
    public void mover() {
        x = 0;
        if (!((tempDesplazamiento > 0) && (tempDesplazamiento < 9))) {
            numero = 0;
        }
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }

    public void saltar() {
        x = 1;
        numero = 0;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }

    public void morir() {
        x = 2;
        numero = 0;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }

    public void atacar() {
        x = 3;
        numero = 0;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }

    public void interrumpir() {
        try {
            hilo.interrupt();
        } catch (Exception ex) {
            System.out.println("hilo " + hilo.getName() + " no interrumpido");
        }
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setvAnimacion(int vAnimacion) {
        if (vAnimacion < 0) {
            vAnimacion = 0;
        }
        this.vAnimacion = vAnimacion;
    }

    public int getvAnimacion() {
        return vAnimacion;
    }

    public int getDesplazamientoHorizontal() {
        return desplazamientoHorizontal;
    }

    public int getDesplazamientoVertical() {
        return desplazamientoVertical;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public Rectangle getHitbox() {
        return hitbox;
    }

    public void setHitbox(int x, int y, int ancho, int alto) {
        hitbox = new Rectangle(x+140, y , ancho/2, alto-40 );
    }

}
