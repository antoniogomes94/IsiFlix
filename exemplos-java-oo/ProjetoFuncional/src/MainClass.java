
public class MainClass {
	public static void main(String[] args) {
		
		InterfaceX obj = new InterfaceX() {
			public int metodo(int valor) {
				return valor*2;
			}
		};
		
		InterfaceX obj2 = new InterfaceX() {
			public int metodo(int valor) {
				return valor * valor;
			}
		};
		
		
		InterfaceX obj3 = (n) -> { return n * 5; };
		InterfaceX obj4 = (n) -> { return n * n * n; };
		
		System.out.println("Retorno da instancia 1 = " + obj.metodo(4));
		System.out.println("Retorno da instancia 2 = " + obj2.metodo(4));
		System.out.println("Retorno do lambda    3 = " + obj3.metodo(4));
		System.out.println("Retorno do lambda    4 = " + obj4.metodo(4));
		
		
	}

}
