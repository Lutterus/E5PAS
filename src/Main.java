/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Marcelo Yamaguti
 */
public class Main {
	public static void main(String args[]) {
		ArrayList<FigurasGeometricas> figurasGeometricas = new ArrayList<FigurasGeometricas>();
		figurasGeometricas.add(new Quadrado(11.11));
		figurasGeometricas.add(new Quadrado(22.22));
		figurasGeometricas.add(new Quadrado(33.33));
		figurasGeometricas.add(new Circulo(44.44));
		figurasGeometricas.add(new Circulo(55.55));
		figurasGeometricas.add(new Circulo(66.66));
		// Calcula a area de todas as figuras geometricas
		double areaTotal = 0;

		for (FigurasGeometricas figurasGeometrica : figurasGeometricas) {
			areaTotal += figurasGeometrica.calculaArea();
		}
		System.out.println("Area total: " + areaTotal);

		// "Desenha" todos as figuras geometricas
		for (FigurasGeometricas figurasGeometrica : figurasGeometricas) {
			figurasGeometrica.desenha();
		}
	}
}
