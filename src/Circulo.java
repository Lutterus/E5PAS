/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo Yamaguti
 */
public class Circulo implements FigurasGeometricas {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	/**
	 * Set the value of raio
	 *
	 * @param raio new value of raio
	 */
	public void setLado(double raio) {
		this.raio = raio;
	}

	/**
	 * Get the value of raio
	 *
	 * @return the value of raio
	 */
	public double getLado() {
		return raio;

	}

	@Override
	public double calculaArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public double calculaPerimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public void desenha() {
		// Desenha um circulo
		System.out.println("Circulo de raio: " + raio);
	}

}
