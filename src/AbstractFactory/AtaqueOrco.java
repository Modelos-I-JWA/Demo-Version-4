/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Andrade
 */
public class AtaqueOrco implements Ataque {

    @Override
    public ArrayList<String> operacion() {
        ArrayList<String> AtqOrc = new ArrayList<String>();
        AtqOrc.add("Recursos\\ImagenesOrco\\Ataque\\AtqOrc1.jpg");
        AtqOrc.add("Recursos\\ImagenesOrco\\Ataque\\AtqOrc2.jpg");
        AtqOrc.add("Recursos\\ImagenesOrco\\Ataque\\AtqOrc3.jpg");
        AtqOrc.add("/Sonidos/OrcoAtaque.wav");
        return AtqOrc;
    }
}
