package Builder;

import AbstractFactory.Ataque;
import AbstractFactory.Derecha;
import AbstractFactory.FabricaAbstracta;
import AbstractFactory.FabricaHumanos;
import AbstractFactory.Izquierda;
import AbstractFactory.Muerte;
import AbstractFactory.Salto;


public abstract class BuilderPersonaje {

    protected Personaje personaje;
    protected Ataque ataque;
    protected Derecha derecha;
    protected Izquierda izquierda;
    protected Salto salto;
    protected Muerte muerte;

    public Personaje getPersonaje() {
        return personaje;
    }

    public abstract void ConstruirPersonaje();
    public abstract void CrearAnimaciones();
}