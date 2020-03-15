package AbstractFactory;

import AbstractFactory.Ataque;
import AbstractFactory.DerechaOrco;
import AbstractFactory.Derecha;
import AbstractFactory.AtaqueOrco;

public class FabricaOrcos implements FabricaAbstracta {

    @Override
    public Salto crearSalto() {
        return new SaltoOrco();
    }

    @Override
    public Izquierda crearIzquierda() {
        return new IzquierdaOrco();
    }

    @Override
    public Derecha crearDerecha() {
        return new DerechaOrco();
    }

    @Override
    public Ataque crearAtaque() {
        return new AtaqueOrco();
    }

    @Override
    public Muerte crearMuerte() {
        return new MuerteOrco();
    }
}
