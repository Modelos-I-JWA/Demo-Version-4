/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.ArrayList;

/**
 *
 * @author estudiantes
 */
public class DerechaElfo implements Derecha {

    @Override
    public ArrayList<String> operacion() {
        ArrayList<String> DerElf = new ArrayList<String>();
        DerElf.add("Recursos\\ImagenesElfo\\Derecha\\ElfDer1.jpg");
        DerElf.add("Recursos\\ImagenesElfo\\Derecha\\ElfDer2.jpg");
        DerElf.add("Recursos\\ImagenesElfo\\Derecha\\ElfDer3.jpg");
        DerElf.add("Recursos\\ImagenesElfo\\Derecha\\ElfDer4.jpg");
        DerElf.add("Recursos\\ImagenesElfo\\Derecha\\ElfDer5.jpg");
        DerElf.add("Recursos\\ImagenesElfo\\Derecha\\ElfDer6.jpg");
        DerElf.add("/Sonidos/Movimiento.wav");
        return DerElf;
    }
}
