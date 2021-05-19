/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author cristo
 */
public class Tabla {
    //valor a retornar

    private double valorInteres;
    private int mes;
    private double valorCuota;
    private double TotalaPagar;

    private double total;
    private double sumaPrestamo;

    public Tabla() {
    }

    public Tabla(double valorInteres, int mes, double valorCuota, double TotalaPagar,double total) {
        super();
        this.valorInteres = valorInteres;
        this.mes = mes;
        this.valorCuota = valorCuota;
        this.TotalaPagar = TotalaPagar;
        this.total = total;
    }

//<editor-fold defaultstate="collapsed" desc="Setter and Getter "POJO"">
    public double getValorInteres() {
        return valorInteres;
    }
    
    public void setValorInteres(double valorInteres) {
        this.valorInteres = valorInteres;
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public double getValorCuota() {
        return valorCuota;
    }
    
    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }
    
    public double getTotalaPagar() {
        return TotalaPagar;
    }
    
    public void setTotalaPagar(double TotalaPagar) {
        this.TotalaPagar = TotalaPagar;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    
    public double getSumaPrestamo() {
        return sumaPrestamo;
    }
    
    public void setSumaPrestamo(double sumaPrestamo) {
        this.sumaPrestamo = sumaPrestamo;
    }
    
//</editor-fold>
}
