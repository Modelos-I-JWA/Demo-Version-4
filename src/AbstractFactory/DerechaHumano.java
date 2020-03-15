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
public class DerechaHumano implements Derecha {

    @Override
    public ArrayList<String> operacion() {
        ArrayList<String> DerHum = new ArrayList<String>();
        DerHum.add("Recursos\\ImagenesHumano\\Derecha\\DerHum1.jpg");
        DerHum.add("Recursos\\ImagenesHumano\\Derecha\\DerHum2.jpg");
        DerHum.add("Recursos\\ImagenesHumano\\Derecha\\DerHum3.jpg");
        DerHum.add("Recursos\\ImagenesHumano\\Derecha\\DerHum4.jpg");
        DerHum.add("Recursos\\ImagenesHumano\\Derecha\\DerHum5.jpg");
        DerHum.add("/Sonidos/Movimiento.wav");
        return DerHum;
    }
}
