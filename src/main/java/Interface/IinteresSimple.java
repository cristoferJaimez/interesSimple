/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.ejb.Local;


/**
 *
 * @author cristo
 */
@Local
public interface IinteresSimple {
    
    void interesSimple(int valor, int numCuota, float tasaInteres);
    
}
