/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIP;

import OCP.*;
import SRP.*;

/**
 *
 * @author Marcelo Yamaguti
 */
public class Quadrado {
    private double lado;

    /**
     * Get the value of lado
     *
     * @return the value of lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Set the value of lado
     *
     * @param lado new value of lado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calculaArea() {
        return lado * lado;
    }    
    
    public double calculaPerimetro() {
        return 4 * lado;
    }    
    
    public void desenha() {
        // Desenha um circulo
        System.out.println("Quadrado de lado: " + lado);
    }

    
}
