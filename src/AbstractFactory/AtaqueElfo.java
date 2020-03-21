/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.ArrayList;

/**
 *
 * @author AndresWilT-PC
 */
public class AtaqueElfo implements Ataque{

    @Override
    public ArrayList<String> operacion() {
        ArrayList<String> AtqElf = new ArrayList<String>();
        AtqElf.add("Recursos\\ImagenesElfo\\Ataque\\AtqElf1.jpg");
        AtqElf.add("Recursos\\ImagenesElfo\\Ataque\\AtqElf2.jpg");
        AtqElf.add("Recursos\\ImagenesElfo\\Ataque\\AtqElf3.jpg");
        AtqElf.add("Recursos\\ImagenesElfo\\Ataque\\AtqElf4.jpg");
        AtqElf.add("Recursos\\ImagenesElfo\\Ataque\\AtqElf5.jpg");
        AtqElf.add("/Sonidos/ElfoAtaque.wav");
        return AtqElf;
    }
    
}
