package Builder;

import java.util.ArrayList;

public class Builder {

    private BuilderPersonaje constructor;

    public void setConstructor(BuilderPersonaje constructor) {
        this.constructor = constructor;
    }

    public Personaje getPersonaje() {
        return constructor.getPersonaje();

    }

    public void CrearPersonaje() {
        constructor.ConstruirPersonaje();
        constructor.CrearAnimaciones();
    }
}
