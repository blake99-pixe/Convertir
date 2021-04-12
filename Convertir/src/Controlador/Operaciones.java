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
public class Operaciones {
  
    
    public double a_Kelvin(double centigrados) {
        Conversion c = new Conversion();
        c.kelvin = centigrados + 273;
        return c.kelvin;
    }
    
    public double a_reamur(double centigrados){
       Conversion c = new Conversion();
        c.reamur = (80 * centigrados)/100;
        return  c.reamur;
    }
}
