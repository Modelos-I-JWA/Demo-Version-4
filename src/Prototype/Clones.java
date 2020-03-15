/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.ArrayList;

/**
 *
 * @author daza
 */
public class Clones implements Cloneable {

     ArrayList<String> Movimiento = new ArrayList<String>();


    public ArrayList<String> getDescription() {
        return Movimiento;
    }

    public void setDescription(ArrayList<String> movimiento) {
        this.Movimiento = movimiento;
    }





    @Override
    public Clones clone() {
        Clones clonMov = null;
        try {
            clonMov = (Clones) super.clone();
            clonMov.setDescription(Movimiento);
    
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return clonMov;
    } 

    public ArrayList<String> ClonarAccion() {
        return Movimiento;
    }
}
