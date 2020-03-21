/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.ArrayList;

/**
 *
 * @author estudiantes
 */
public class IzquierdaOrco implements Izquierda {

    public ArrayList<String> operacion(){
         ArrayList<String> IzqOrc = new ArrayList<String>();
         IzqOrc.add("Recursos\\ImagenesOrco\\Izquierda\\OrcIzq1.jpg");
         IzqOrc.add("Recursos\\ImagenesOrco\\Izquierda\\OrcIzq2.jpg");
         IzqOrc.add("Recursos\\ImagenesOrco\\Izquierda\\OrcIzq3.jpg");
         IzqOrc.add("Recursos\\ImagenesOrco\\Izquierda\\OrcIzq4.jpg");
         IzqOrc.add("Recursos\\ImagenesOrco\\Izquierda\\OrcIzq5.jpg");
         IzqOrc.add("Recursos\\ImagenesOrco\\Izquierda\\OrcIzq6.jpg");
         IzqOrc.add("/Sonidos/Movimiento.wav");
        return IzqOrc;
    }
}
