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
public class SaltoOrco implements Salto {

    @Override
    public ArrayList<String> operacion() {
        ArrayList<String> SalOrc = new ArrayList<String>();
        SalOrc.add("Recursos\\ImagenesOrco\\Salto\\SalOrc1.jpg");
        SalOrc.add("Recursos\\ImagenesOrco\\Salto\\SalOrc2.jpg");
        SalOrc.add("Recursos\\ImagenesOrco\\Salto\\SalOrc3.jpg");
        SalOrc.add("Recursos\\ImagenesOrco\\Salto\\SalOrc4.jpg");
        SalOrc.add("Recursos\\ImagenesOrco\\Salto\\SalOrc5.jpg");
        SalOrc.add("/Sonidos/OrcoSalto.wav");
        return SalOrc;
    }

}
