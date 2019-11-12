/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo Yamaguti
 */
public class Quadrado implements FigurasGeometricas {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	/**
	 * Set the value of lado
	 *
	 * @param lado new value of lado
	 */
	public void setLado(double lado) {
		this.lado = lado;
	}

	/**
	 * Get the value of lado
	 *
	 * @return the value of lado
	 */
	public double getLado() {
		return lado;

	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}

	@Override
	public double calculaPerimetro() {
		return 4 * lado;
	}

	@Override
	public void desenha() {
		// Desenha um circulo
		System.out.println("Quadrado de lado: " + lado);
	}

}
