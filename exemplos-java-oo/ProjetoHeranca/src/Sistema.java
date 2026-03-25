
public class Sistema {
	public static void main(String[] args) {
//		Pessoa p = new Pessoa();
//		p.setNome("Isidro");
//		p.setEmail("isidro@isidro.com");
//		p.setTelefone("987654321");
//		
//		Estudante e = new Estudante();
//		e.setNome("Jose");
//		e.setEmail("jose@jose.com");
//		e.setTelefone("912345678");
//		e.setNumeroMatricula(12345);
//		e.setCurso("Java");
//		
//		System.out.println(p.exibir());
//		System.out.println(e.exibir());
//		
		Pessoa cadastro[] = new Pessoa[5];
		cadastro[0] = new Pessoa("isidro","isidro@isidro.com","98876");
		cadastro[1] = new Pessoa("maria","maria@maria.com","123456");
		cadastro[2] = new Pessoa("jose","jose@jose.com", "988765");
		cadastro[3] = new Pessoa("pedro","pedro@pedro.com","765");
		cadastro[4] = new Pessoa("ana","ana@ana.com","827273");
		
		for (Pessoa p: cadastro) {
			System.out.println(p.exibir());
		}
		
		
	}

}
