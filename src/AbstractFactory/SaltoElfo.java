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
public class SaltoElfo implements Salto {

    @Override
    public  ArrayList<String> operacion() {
         ArrayList<String> SalElf = new ArrayList<String>();
        SalElf.add("Recursos\\ImagenesElfo\\Salto\\SalElf1.jpg");
        SalElf.add("Recursos\\ImagenesElfo\\Salto\\SalElf2.jpg");
        SalElf.add("Recursos\\ImagenesElfo\\Salto\\SalElf3.jpg");
        SalElf.add("Recursos\\ImagenesElfo\\Salto\\SalElf4.jpg");
        SalElf.add("Recursos\\ImagenesElfo\\Salto\\SalElf5.jpg");
        SalElf.add("Recursos\\ImagenesElfo\\Salto\\SalElf6.jpg");
        SalElf.add("/Sonidos/ElfoSalto.wav");
        return SalElf;
    }
}
