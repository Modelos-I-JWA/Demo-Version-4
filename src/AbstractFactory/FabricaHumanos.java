/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Ataque;
import AbstractFactory.AtaqueHumano;
import AbstractFactory.DerechaHumano;
import AbstractFactory.Derecha;
import java.util.Scanner;


public class FabricaHumanos implements FabricaAbstracta {

    @Override
    public Salto crearSalto() {
        return new SaltoHumano();
    }

    @Override
    public Izquierda crearIzquierda() {
        return new IzquierdaHumano();
    }

    @Override
    public Derecha crearDerecha() {
        return new DerechaHumano();
    }

    @Override
    public Ataque crearAtaque() {
        return new AtaqueHumano();
    }

        @Override
    public Muerte crearMuerte() {
        return new MuerteHumano();
    }
}
