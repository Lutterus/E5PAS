/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIP;

import OCP.*;
import SRP.*;
import java.util.ArrayList;

/**
 *
 * @author Marcelo Yamaguti
 */
public class Main {
    public static void main(String args[]) {
        ArrayList<Quadrado> quadrados = new ArrayList<Quadrado>();
        ArrayList<Circulo> circulos = new ArrayList<Circulo>();
        quadrados.add(new Quadrado(11.11));
        quadrados.add(new Quadrado(22.22));
        quadrados.add(new Quadrado(33.33));
        circulos.add(new Circulo(44.44));
        circulos.add(new Circulo(55.55));
        circulos.add(new Circulo(66.66));
        // Calcula a area de todas as figuras geometricas
        double areaTotal = 0;
        for(Quadrado q : quadrados)
            areaTotal += q.calculaArea();
        for(Circulo c : circulos)
            areaTotal += c.calculaArea();
        System.out.println("Area total: " + areaTotal);
        // "Desenha" todos as figuras geometricas
        for(Quadrado q : quadrados)
            q.desenha();
        for(Circulo c : circulos)
            c.desenha();            
    }
}
