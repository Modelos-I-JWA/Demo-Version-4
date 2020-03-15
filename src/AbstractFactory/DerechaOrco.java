package AbstractFactory;

import java.util.ArrayList;

public class DerechaOrco implements Derecha {

    @Override
    public ArrayList<String> operacion() {
        ArrayList<String> DerOrc = new ArrayList<String>();
        DerOrc.add("Recursos\\ImagenesOrco\\Derecha\\DerOrc1.jpg");
        DerOrc.add("Recursos\\ImagenesOrco\\Derecha\\DerOrc2.jpg");
        DerOrc.add("Recursos\\ImagenesOrco\\Derecha\\DerOrc3.jpg");
        DerOrc.add("Recursos\\ImagenesOrco\\Derecha\\DerOrc4.jpg");
        DerOrc.add("Recursos\\ImagenesOrco\\Derecha\\DerOrc5.jpg");
        DerOrc.add("/Sonidos/Movimiento.wav");
        return DerOrc;
    }
}
