package br.com.isiflix.universipi.core;

public class Questao {
	protected String enunciado;
	protected String resposta;
	public Questao(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return "Q: "+this.enunciado;
	}
	
	public boolean corrigir(String respAluno) {
		return this.resposta.equals(respAluno);
	}
	
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	
}
