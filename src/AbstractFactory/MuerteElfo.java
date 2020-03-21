/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.ArrayList;

/**
 *
 * @author famil
 */
public class MuerteElfo implements Muerte {

     @Override
     public ArrayList<String> operacion() {
        ArrayList<String> MuerElf = new ArrayList<String>();
        MuerElf.add("Recursos\\ImagenesElfo\\Muerte\\ElfMuer1.jpg");
        MuerElf.add("Recursos\\ImagenesElfo\\Muerte\\ElfMuer2.jpg");
        MuerElf.add("Recursos\\ImagenesElfo\\Muerte\\ElfMuer3.jpg");
        MuerElf.add("Recursos\\ImagenesElfo\\Muerte\\ElfMuer4.jpg");
        MuerElf.add("Recursos\\ImagenesElfo\\Muerte\\ElfMuer5.jpg");
        MuerElf.add("/Sonidos/ElfoMuerte.wav");
        return MuerElf;
    }
}
