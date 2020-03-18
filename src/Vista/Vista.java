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
import java.awt.Graphics;

/**
 *
 * @author Juan David
 */
public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonHumano = new javax.swing.JButton();
        BotonOrco = new javax.swing.JButton();
        BotonElfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonHumano.setText("Humano");
        BotonHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHumanoActionPerformed(evt);
            }
        });

        BotonOrco.setText("Orco");
        BotonOrco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOrcoActionPerformed(evt);
            }
        });

        BotonElfo.setText("Elfo");
        BotonElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonElfoActionPerformed(evt);
            }
        });

        jLabel1.setText("Que personaje quiere escoger");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonHumano)
                            .addComponent(BotonOrco)
                            .addComponent(BotonElfo))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(BotonHumano)
                .addGap(18, 18, 18)
                .addComponent(BotonOrco)
                .addGap(18, 18, 18)
                .addComponent(BotonElfo)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHumanoActionPerformed
       Builder build = new Builder();
        build.setConstructor(new ConstructorHumano());
        build.CrearPersonaje();
        Vista1 ventana = new Vista1(build.getPersonaje());
        ventana.setVisible(true);
        ventana.setResizable(false);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_BotonHumanoActionPerformed

    private void BotonOrcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOrcoActionPerformed
        Builder build = new Builder();
        build.setConstructor(new ConstructorOrco());
        build.CrearPersonaje();
        Vista1 ventana = new Vista1(build.getPersonaje());
        ventana.setVisible(true);
        ventana.setResizable(false);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_BotonOrcoActionPerformed

    private void BotonElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonElfoActionPerformed
        Builder build = new Builder();
        build.setConstructor(new ConstructorElfo());
        build.CrearPersonaje();
        Vista1 ventana = new Vista1(build.getPersonaje());
        ventana.setVisible(true);
        ventana.setResizable(false);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_BotonElfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonElfo;
    private javax.swing.JButton BotonHumano;
    private javax.swing.JButton BotonOrco;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
