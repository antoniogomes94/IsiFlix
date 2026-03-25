
public class MainClass {
	public static void main(String[] args) {
		
		Veiculo v;
		v = new Carro("Bmw x6", "2023", 5);
		
		v.acelerar();
		v.frear();
		
		Veiculo v2 = new Moto("CG 125", "1978", 125);
		v2.acelerar();
		v2.frear();
	}
}
