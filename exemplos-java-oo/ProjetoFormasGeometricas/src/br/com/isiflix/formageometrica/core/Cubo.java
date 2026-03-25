package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma2D;
import br.com.isiflix.formageometrica.model.InterfaceForma3D;

public class Cubo extends FormaGeometrica implements InterfaceForma2D, InterfaceForma3D{
	private double lado;

	public Cubo(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 3);
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado * 4;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cubo de lado "+this.lado+" A: "+this.calcularArea()+ " - P: "+this.calcularPerimetro()+" - V: "+this.calcularVolume();
	}
	
	

}
