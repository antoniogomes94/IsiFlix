package br.com.isiflix.universipi.main;

import java.util.Scanner;

import br.com.isiflix.universipi.core.Questao;
import br.com.isiflix.universipi.core.QuestaoComDica;
import br.com.isiflix.universipi.core.QuestaoMultiplaEscolha;

public class Simulado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pontos=0;
		String minhaResposta;
		
		Questao questoes[] = new Questao[5];
		questoes[0] = new QuestaoComDica("Quanto vale 1+1?","2","Responda a representação numérica");
		questoes[1] = new Questao("Quem descobriu o Brasil?", "Pedro Alvares Cabral");
		questoes[2] = new QuestaoMultiplaEscolha("Qual a formula da água?","b","H2O2","H2O","NaCl","H2SO4");
		questoes[3] = new QuestaoComDica("Qual a linguagem deste curso?", "Java","Começa com \"Ja\" e termina com \"va\"");
		questoes[4] = new Questao("Qual o nome do professor?", "Isidro");
		
		
		
		
		
		for(Questao q: questoes) {
			System.out.println(q.aplicarQuestao());
			System.out.print("Resposta:");
			minhaResposta = teclado.nextLine();
			if (q.corrigir(minhaResposta)) {
				pontos++;
				System.out.println("Acertou!");
			}
			else {
				System.out.println("Errrrooooooooouuuu (Silva, Fausto)");
			}
		}
		System.out.println("Total de acertos: "+pontos+" de "+questoes.length);
		
	}

}
