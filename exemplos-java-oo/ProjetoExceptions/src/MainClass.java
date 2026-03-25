import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

//      MULTICATCH
//		try {
//			Produto p = new Produto();
//			p.setId(0);
//			p.setDescricao("Computador");
//
//			System.out.println(p);
//		} catch (IsiException | ArithmeticException | InputMismatchException e) {
//			System.out.println("Erro - " + e.getMessage());
//		} 

		try (Scanner teclado = new Scanner(System.in)) {
			
			System.out.println("Digite o primeiro valor");
			int v1 = teclado.nextInt();
			System.out.println("Digite o segundo valor");
			int v2 = teclado.nextInt();
			int r = v1 / v2;
			System.out.println("Resultado = " + r);

		} catch (Exception ex) {
			System.out.println("Epa! " + ex.getMessage());
		}
	}

}
