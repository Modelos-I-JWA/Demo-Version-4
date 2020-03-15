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

public class IzquierdaHumano implements Izquierda {

    @Override
    public ArrayList<String> operacion() {
         ArrayList<String> IzqHum = new ArrayList<String>();
        IzqHum.add("Recursos\\ImagenesHumano\\Izquierda\\IzqHum1.jpg");
        IzqHum.add("Recursos\\ImagenesHumano\\Izquierda\\IzqHum2.jpg");
        IzqHum.add("Recursos\\ImagenesHumano\\Izquierda\\IzqHum3.jpg");
        IzqHum.add("Recursos\\ImagenesHumano\\Izquierda\\IzqHum4.jpg");
        IzqHum.add("Recursos\\ImagenesHumano\\Izquierda\\IzqHum5.jpg");
        IzqHum.add("/Sonidos/Movimiento.wav");
        return IzqHum;
    }

}
