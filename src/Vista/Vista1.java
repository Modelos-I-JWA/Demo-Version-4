package Vista;

import Builder.Builder;
import Builder.ConstructorElfo;
import Builder.ConstructorHumano;
import Builder.ConstructorOrco;
import Builder.Elfo;
import Builder.Poder;
import Builder.Personaje;
import Decorator.Component;
import Decorator.RealComponent;
import Decorator.WrapperUno;
import Observer.Observador;
import State.Estado;
import State.Movimiento;
import State.Teletransporte;
import Strategy.Control;
import Strategy.Selector;
import chainofresponsability.Implementar;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Juan David
 */
public class Vista1 extends javax.swing.JFrame implements KeyListener {

    ArrayList<Personaje> p = new ArrayList<>();
    ArrayList<Personaje> poderes = new ArrayList<>();
    Observador observar=new Observador();
    Estado estado;
    Graphics g;
    Boolean est;
    Boolean newEst=false;
    public static JLabel Imagen = new JLabel();
    Selector s = new Selector();
    Personaje per;
   
    int c;
    Control ctr = new Control() {};


    public Vista1(Personaje per, Personaje poder) {
        initComponents();
        this.setEstado(true);
        est=this.getvAnimacion();
        panel.add(Imagen);
        per.setPanel(panel);
      
        this.p.add(per);
        this.p.add(per.clone());
        this.p.get(0).setHitbox(20, 0, this.p.get(1).getAncho(), this.p.get(1).getAlto());
        this.p.get(1).setHitbox(20, 200, this.p.get(1).getAncho(), this.p.get(1).getAlto());
        this.p.get(1).setDesplazamientoVertical(200);
        panel.add(this.p.get(0));
        panel.add(this.p.get(1));
        
        poder.setPanel(panel);
        this.poderes.add(poder);
        this.poderes.get(0).setDesplazamientoVertical(300);
        this.poderes.get(0).setDesplazamientoHorizontal(480);
        this.poderes.get(0).setHitbox(400, 300, this.poderes.get(0).getAncho() , this.poderes.get(0).getAlto());
        panel.add(this.poderes.get(0));

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(est){
            estado=new Movimiento();
            estado.EjecutarAccion(e,p);
        }else{
            estado=new Teletransporte();
            estado.EjecutarAccion(e,p);
        }
                
        switch (e.getKeyCode()) {
           
            case KeyEvent.VK_X:
                p.get(0).atacar();
                p.get(1).atacar();
                break;

            case KeyEvent.VK_Z:
                p.get(0).morir();
                p.get(1).morir();
                break;

            case KeyEvent.VK_C:
                p.get(0).saltar();
                p.get(1).saltar();
            default:
                break;
        }
        for (int i = 0; i < p.size(); i++) {
            for (int j = 0; j < poderes.size(); j++) {
                if (p.get(i).getHitbox().intersects(poderes.get(j).getHitbox())) {
                    notificar(newEst);
                    
                }
            }
        }
        
    }
    public void notificar(boolean est) {
            this.setEstado(observar.update(est));
    }
    public  void setEstado(boolean est) {
    this.est=est;
    }

    public boolean getvAnimacion() {
        return est;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        BotonClonar = new javax.swing.JButton();
        BotonPoder = new javax.swing.JButton();
        BajarV = new javax.swing.JButton();
        SubirV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        BotonClonar.setText("Clonar");
        BotonClonar.setFocusable(false);
        BotonClonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClonarActionPerformed(evt);
            }
        });
        BotonClonar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KP(evt);
            }
        });

        BotonPoder.setText("Poder");
        BotonPoder.setFocusable(false);
        BotonPoder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPoderActionPerformed(evt);
            }
        });
        BotonPoder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KP(evt);
            }
        });

        BajarV.setText("Bajar Vida");
        BajarV.setFocusable(false);
        BajarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajarVActionPerformed(evt);
            }
        });
        BajarV.addKeyListener(new java.awt.event.KeyAdapter() {			//KeyPressed (Importante añadir este metodo a cada boton nuevo agregado)
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KP(evt);
            }
        });

        SubirV.setText("Subir Vida");
        SubirV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirVActionPerformed(evt);
            }
        });
        SubirV.addKeyListener(new java.awt.event.KeyAdapter() {			//KeyPressed (Importante añadir este metodo a cada boton nuevo agregado)
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KP(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonClonar)
                    .addComponent(BotonPoder)
                    .addComponent(BajarV)
                    .addComponent(SubirV))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BotonClonar)
                .addGap(185, 185, 185)
                .addComponent(BotonPoder)
                .addGap(60, 60, 60)
                .addComponent(BajarV)
                .addGap(18, 18, 18)
                .addComponent(SubirV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonClonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClonarActionPerformed

    }//GEN-LAST:event_BotonClonarActionPerformed

    private void BotonPoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPoderActionPerformed
        c = 1;
        ctr.operar(c, per);
    }//GEN-LAST:event_BotonPoderActionPerformed

    private void BajarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajarVActionPerformed
        c = 2;
        ctr.operar(c, per);
    }//GEN-LAST:event_BajarVActionPerformed

    private void SubirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirVActionPerformed
        c = 3;
        ctr.operar(c, per);

    }//GEN-LAST:event_SubirVActionPerformed

    private void KP(java.awt.event.KeyEvent evt) {
        keyPressed(evt);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BajarV;
    private javax.swing.JButton BotonClonar;
    private javax.swing.JButton BotonPoder;
    private javax.swing.JButton SubirV;
    public javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

}
