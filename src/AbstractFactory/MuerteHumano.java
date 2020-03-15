/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.ArrayList;

/**
 *
 * @author famil
 */
public class MuerteHumano implements Muerte {
    
     @Override
     public ArrayList<String> operacion() {
        ArrayList<String> MuerHum = new ArrayList<String>();
        MuerHum.add("Recursos\\ImagenesHumano\\Muerte\\MuerHum1.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\Muerte\\MuerHum2.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\Muerte\\MuerHum3.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\Muerte\\MuerHum4.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\Muerte\\MuerHum5.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\Muerte\\MuerHum6.jpg");
        MuerHum.add("Recursos\\ImagenesHumano\\Muerte\\MuerHum7.jpg");
        MuerHum.add("/Sonidos/HumanoMuerte.wav");
        return MuerHum;
    }
} 
