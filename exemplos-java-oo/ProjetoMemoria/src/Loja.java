
public class Loja {
	public static void main(String[] args) {
// exemplificando referencias de memória
		
		//		Produto p1, p2;
		
//		p1 = new Produto(1, "Computador", 1000);
//		
//		System.out.println("p1 = "+ p1.exibirInfo());
//		
//		//p2 = p1; // isso não cria cópia.. isso cria apenas uma nova referência ao mesmo objeto
//
//		p2 = new Produto(p1.getId(), p1.getNome(), p1.getPreco());
//		p2.setPreco(1500);
//		System.out.println("p2 = "+ p2.exibirInfo());
//		System.out.println("p1 = "+ p1.exibirInfo());
		
		
//		System.out.println("Antes da correcao...");
//		System.out.println("p1 = "+p1.exibirInfo());
//		Atualizador a = new Atualizador(7.5);
//		a.atualizarPreco(p1);
//		
//		System.out.println("Após correçao de preços...");
//		System.out.println("p1 = "+p1.exibirInfo());

		// exemplificando o Garbage Collector
//		for (int i=0; i<100; i++) {
//			p1 = new Produto(i,"Produto"+i,i*10);
//		}
//		System.gc();
		
		
		String s1, s2;
		
		s1 = "Oi, quer tc?";
		//s2 = "Oi, quer tc?"; // s2 = s1
		s2 = s1;
		
		s2 = "vamo testar o que o isidro falou";
		
		System.out.println(s1);
		System.out.println(s2);
		
//		s1 = new String("Oi, quer tc?");
//		s2 = new String("Oi, quer tc?"); 
		
//		if (s1 == s2) {
//			System.out.println("Apontam para a mesma área da memória");
//		}
//		else {
//			System.out.println("Apontam para áreas diferentes da memória");
//		}
//		
//		if (s1.equals(s2)) {
//			System.out.println("Mesmo conteúdo");
//		}
//		else {
//			System.out.println("Conteúdos Diferentes");
//		}
	}
}
