package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma3D;

public class Paralelepipedo extends FormaGeometrica implements InterfaceForma3D {
	private double altura;
	private double largura;
	private double profundidade;
	public Paralelepipedo(double altura, double largura, double profundidade) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}
	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return this.altura * this.largura * this.profundidade;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Paralelepipedo de medidas (a/l/p) "+this.altura+"/"+this.largura+"/"+this.profundidade+" V: "+this.calcularVolume();
	}
	
	

}
