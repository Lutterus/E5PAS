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
public class Circulo {
    
    private double raio;

    /**
     * Get the value of raio
     *
     * @return the value of raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * Set the value of raio
     *
     * @param raio new value of raio
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return Math.PI * raio * raio;
    }    

    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    public void desenha() {
        // Desenha um circulo
        System.out.println("Circulo de raio: "+raio);
    }
    
}
