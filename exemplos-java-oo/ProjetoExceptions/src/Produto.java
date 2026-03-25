
public class Produto {
	private int id;
	private String descricao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) throws IsiException {
		if (id <= 0) {
			throw new IsiException("ID nao pode ser zero ou negativo");
		}
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) throws IsiException {
		if (descricao == null || descricao.length() == 0) {
			throw new IsiException("Descricao precisa ser obrigatoria");
		}
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}
	
	

}
