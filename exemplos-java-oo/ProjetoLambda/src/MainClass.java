import java.util.ArrayList;
import java.util.function.Predicate;

public class MainClass {
	public static void main(String[] args) {

		ArrayList<Cliente> lista = new ArrayList<Cliente>();

		lista.add(new Cliente(1, "isidro", "isidro@isidro.com", true));
		lista.add(new Cliente(2, "jose", "jose@email.com", false));
		lista.add(new Cliente(3, "ana", "ana@email.com", true));
		lista.add(new Cliente(4, "pedro", "pedro@email.com", true));
		lista.add(new Cliente(5, "maria", "maria@email.com", false));
		lista.add(new Cliente(6, "joao", "joao@email.com", true));
		lista.add(new Cliente(7, "paulo", "paulo@email.com", true));
		lista.add(new Cliente(8, "felipe", "felipe@email.com", false));
		lista.add(new Cliente(9, "joana", "joana@email.com", true));
		lista.add(new Cliente(10, "isadora", "isadora@email.com", true));

		System.out.println("----- TUDAO ------");
		lista.forEach(c -> {
				System.out.println(c);
		});
		
		System.out.println("---------------------------");
		// criterio 1 - apenas os ativos
		
		//exibePorCriterio(lista, c -> c.isAtivo());
//		exibePorCriterio(lista, c -> c.getNome().length() > 4);
		exibePorCriterio(lista, c -> c.getNome().startsWith("is"));
	}
	
	public static void exibePorCriterio(ArrayList<Cliente> lista, Predicate<Cliente> predicate) {
		lista.forEach( c -> { 
			if (predicate.test(c)) {
				System.out.println(c);
			}
		} );
	}

}
