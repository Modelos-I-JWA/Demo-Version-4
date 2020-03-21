package AbstractFactory;

import java.util.ArrayList;

public class SaltoHumano implements Salto {

    @Override
    public  ArrayList<String> operacion() {
        ArrayList<String> SalHum = new ArrayList<String>();
        SalHum.add("Recursos\\ImagenesHumano\\Salto\\SalHum1.jpg");
        SalHum.add("Recursos\\ImagenesHumano\\Salto\\SalHum2.jpg");
        SalHum.add("Recursos\\ImagenesHumano\\Salto\\SalHum3.jpg");
        SalHum.add("/Sonidos/HumanoSalto.wav");
        return SalHum;
    }
}
