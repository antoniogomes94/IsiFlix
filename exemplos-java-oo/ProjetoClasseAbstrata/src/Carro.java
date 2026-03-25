
public class Carro extends Veiculo{
	
	private int lugares;

	public Carro(String marcaModelo, String ano, int lugares) {
		super(marcaModelo, ano);
		this.lugares = lugares;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro "+super.marcaModelo+" Acelera no pé! Vruuummmmmm!!!");
		
	}

	@Override
	public void frear() {
		System.out.println("Carro "+super.marcaModelo+ " Freia na mão!! IIIICCHHHHH");
		
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}
	
	
}
