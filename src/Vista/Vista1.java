/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Builder.Builder;
import Builder.ConstructorElfo;
import Builder.ConstructorHumano;
import Builder.ConstructorOrco;
import Builder.Elfo;
import Builder.Personaje;
import chainofresponsability.Implementar;
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

    public static JLabel Imagen = new JLabel();
    Implementar imp = new Implementar();
    Personaje per;
    int aux = 0;
    public int n = 130;

    public Vista1(Personaje per) {
        initComponents();
    
        panel.add(Imagen);
        System.out.print(aux);
        per.setPanel(panel);
        this.p.add(per);
        this.p.add(per.clone());
        this.p.get(0).setHitbox(20, 0, this.p.get(1).getAncho(), this.p.get(1).getAlto());
        this.p.get(1).setHitbox(20, 200, this.p.get(1).getAncho(), this.p.get(1).getAlto());
        this.p.get(1).setDesplazamientoVertical(200);
        panel.add(this.p.get(0));
        panel.add(this.p.get(1));
        this.per = per;

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                p.get(0).desplazamiento = 1;
                p.get(1).desplazamiento = 1;
                p.get(0).mover();
                p.get(1).mover();
                break;
                
            case KeyEvent.VK_UP:
                p.get(0).desplazamiento = 2;
                p.get(1).desplazamiento = 2;
                p.get(0).mover();
                p.get(1).mover();
                break;
                
            case KeyEvent.VK_LEFT:
                p.get(0).desplazamiento = 3;
                p.get(1).desplazamiento = 3;
                p.get(0).mover();
                p.get(1).mover();
                break;
                
            case KeyEvent.VK_DOWN:
                p.get(0).desplazamiento = 4;
                p.get(1).desplazamiento = 4;
                p.get(0).mover();
                p.get(1).mover();
                break;
                
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
        aux++;
    }//GEN-LAST:event_BotonClonarActionPerformed

    private void BotonPoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPoderActionPerformed
   
    }//GEN-LAST:event_BotonPoderActionPerformed

    private void BajarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajarVActionPerformed

        imp.operacion(1, per);
    }//GEN-LAST:event_BajarVActionPerformed

    private void SubirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirVActionPerformed
        imp.operacion(2, per);

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

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
