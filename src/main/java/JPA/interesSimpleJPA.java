/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import Entity.Tabla;
import Interface.IinteresSimple;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
@Stateless
public class interesSimpleJPA implements IinteresSimple {

    private ArrayList<Tabla> lista = new ArrayList<>();

    @Override
    public void interesSimple(int valor, int numCuota, float tasaInteres) {
        lista = new ArrayList<>();
        try {
            float inte = (float) (valor * (tasaInteres / 100)) * numCuota;
            float valorC = valor / numCuota;
            float total = valorC + inte;
            System.out.println(inte);
            System.out.println(valorC);
            System.out.println(total);
            for (int i = 1; i <= numCuota; i++) {
                lista.add(new Tabla(inte, i, valorC, total,0));
            }

        } catch (Exception e) {

        }
    }

}
