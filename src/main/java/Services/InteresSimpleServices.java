/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Interface.IinteresSimple;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
@Stateless
public class InteresSimpleServices {
    
    @EJB
    private IinteresSimple iInteres;
    
    
    public void calcular(int valor, int numCuota, float tasaInteres){
        iInteres.interesSimple(valor, numCuota, tasaInteres);
    }
}
