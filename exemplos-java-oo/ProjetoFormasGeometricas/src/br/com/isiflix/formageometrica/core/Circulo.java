package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma2D;

public class Circulo extends FormaGeometrica implements InterfaceForma2D {
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.raio, 2) * Math.PI;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.raio;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cirulo de Raio "+this.raio+" A: "+this.calcularArea()+" - P: "+this.calcularPerimetro();
	}
	

}
