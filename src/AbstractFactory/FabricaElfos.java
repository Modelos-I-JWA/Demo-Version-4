/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Ataque;
import AbstractFactory.DerechaElfo;
import AbstractFactory.AtaqueElfo;
import AbstractFactory.Derecha;

/**
 *
 * @author estudiantes
 */
public class FabricaElfos implements FabricaAbstracta {

    @Override
    public Salto crearSalto() {
        return new SaltoElfo();
    }

    @Override
    public Izquierda crearIzquierda() {
        return new IzquierdaElfo();
    }

    @Override
    public Derecha crearDerecha() {
        return new DerechaElfo();
    }

    @Override
    public Ataque crearAtaque() {
        return new AtaqueElfo();
    }
    
    @Override
    public MuerteElfo crearMuerte() {
        return new MuerteElfo();
    }
}
