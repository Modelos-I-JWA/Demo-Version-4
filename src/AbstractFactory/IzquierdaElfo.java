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
public class IzquierdaElfo implements Izquierda {

    @Override
     public ArrayList<String> operacion() {
         ArrayList<String> IzqElf = new ArrayList<String>();
        IzqElf.add("Recursos\\ImagenesElfo\\Izquierda\\ElfIzq1.jpg");
        IzqElf.add("Recursos\\ImagenesElfo\\Izquierda\\ElfIzq2.jpg");
        IzqElf.add("Recursos\\ImagenesElfo\\Izquierda\\ElfIzq3.jpg");
        IzqElf.add("Recursos\\ImagenesElfo\\Izquierda\\ElfIzq4.jpg");
        IzqElf.add("Recursos\\ImagenesElfo\\Izquierda\\ElfIzq5.jpg");
        IzqElf.add("Recursos\\ImagenesElfo\\Izquierda\\ElfIzq6.jpg");
        IzqElf.add("/Sonidos/Movimiento.wav");
        return IzqElf;
    }
}
