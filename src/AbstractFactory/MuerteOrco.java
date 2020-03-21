/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.ArrayList;


public class MuerteOrco implements Muerte {

    @Override
    public ArrayList<String> operacion() {
        ArrayList<String> MuerOrc = new ArrayList<String>();
        MuerOrc.add("Recursos\\ImagenesOrco\\Muerte\\MuerOrc1.jpg");
        MuerOrc.add("Recursos\\ImagenesOrco\\Muerte\\MuerOrc2.jpg");
        MuerOrc.add("Recursos\\ImagenesOrco\\Muerte\\MuerOrc3.jpg");
        MuerOrc.add("Recursos\\ImagenesOrco\\Muerte\\MuerOrc4.jpg");  
        return MuerOrc;
    }
    
}
