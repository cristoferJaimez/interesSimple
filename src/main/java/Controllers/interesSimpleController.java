/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import Entity.Tabla;
import Services.InteresSimpleServices;
import java.util.ArrayList;
import javax.ejb.EJB;

/**
 *
 * @author cristo
 */
@Named("interesSimpleController")
@SessionScoped
public class interesSimpleController implements Serializable {

//    cosntructor
    public interesSimpleController() {
    }

//EJB    
    @EJB
    private InteresSimpleServices interesServicio;

//    variables
    private int valor;
    private int numCota;
    private float tasaInteres;

    private double neto;
    //lista
    private ArrayList<Tabla> lista = new ArrayList<>();

    // msm
    private String msm;

    public void calcularInteres() {
        msm = "";

//        try {
//                interesServicio.calcular(valor, numCota, tasaInteres);
//        } catch (Exception e) {
//        }
        lista = new ArrayList<>();
        try {
            double inte = (double) (valor * (tasaInteres / 100)) * numCota;
            double valorC = (double) valor / numCota;
            double total = (double) valorC + inte;
            neto = 0;
//            System.out.println(inte);
//            System.out.println(valorC);
//            System.out.println(total);

            for (int i = 1; i <= numCota; i++) {
                neto = (double) neto + total;
                lista.add(new Tabla(inte, i, valorC, total, neto));
            }

            System.out.println(neto);

            msm = "msmOK";

        } catch (Exception e) {
            msm = "msmBad";

            System.out.println("error -> " + e.getMessage());

        }
    }

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter forma">
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNumCota() {
        return numCota;
    }

    public void setNumCota(int numCota) {
        this.numCota = numCota;
    }

    public float getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }
    //</editor-fold>

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public ArrayList<Tabla> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Tabla> lista) {
        this.lista = lista;
    }

}
