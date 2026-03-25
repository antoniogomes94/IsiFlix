package br.com.isiflix.contaespecial.userinterface;

import br.com.isiflix.contaespecial.core.Conta;
import br.com.isiflix.contaespecial.core.ContaEspecial;

public class Banco {
	public static void main(String[] args) {	
		
		Conta c = new Conta(5432, "987654321", "Isidro", 100);
		
		System.out.println(c);
		
		ContaEspecial e = new ContaEspecial(9876,"362871", "Jose", 100, 1000);
		
		System.out.println(e);
		
		if (e.debitar(300)) {
			System.out.println("Debito efetuado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(e);
	}
}
