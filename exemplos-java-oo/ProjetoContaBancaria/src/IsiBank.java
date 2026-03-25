//import java.util.Scanner;

public class IsiBank {
	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		Conta c1 = new Conta(1234,5,"Professor Isidro","987.654.321-00");
		double valor;
		int opcao;
		
		do {
			System.out.println("*** IsiBank ***");
			System.out.println("1 - Extrato / 2 - Deposito / 3 - Saque / -1 - Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println(c1.exibirInfo());
				break;
			case 2:
				System.out.println("Digite o valor a depositar");
				valor = teclado.nextDouble();
				c1.depositar(valor);
				break;
			case 3:
				System.out.println("Digite o valor do saque");
				valor = teclado.nextDouble();
				if (c1.sacar(valor)) {
					System.out.println("Saque autorizado");
				}
				else {
					System.out.println("Saldo insuficiente");
				}
				break;
			case -1:
				System.out.println("Obrigado por utilizar nossos servicos");
				break;
			default:
				System.out.println("Opcao Invalida!");
			}
			
		} while (opcao != -1);
		
		
		
		teclado.close();
	}
}
