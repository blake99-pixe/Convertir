/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author FOSTER
 */
public class Conversion {

    double centigrados, kelvin, reamur;
    
    public Conversion (){
    }
    
    public Conversion(double centigrados, double kelvin, double reamur) {
        this.centigrados = centigrados;
        this.kelvin = kelvin;
        this.reamur = reamur;
    }

    public double getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getReamur() {
        return reamur;
    }

    public void setReamur(double reamur) {
        this.reamur = reamur;
    }

}
