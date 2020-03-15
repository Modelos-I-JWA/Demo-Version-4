package AbstractFactory;

import AbstractFactory.Ataque;
import AbstractFactory.Derecha;

public interface FabricaAbstracta {

    public Salto crearSalto();

    public Izquierda crearIzquierda();

    public Derecha crearDerecha();

    public Ataque crearAtaque();
    
    public Muerte crearMuerte();
}
