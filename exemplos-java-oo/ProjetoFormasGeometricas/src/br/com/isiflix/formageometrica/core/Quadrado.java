package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma2D;

public class Quadrado extends FormaGeometrica implements InterfaceForma2D {
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.lado * this.lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado * 4;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Quadrado de lado "+this.lado+" A: "+this.calcularArea()+" - P: "+this.calcularPerimetro();
	}
	

}
