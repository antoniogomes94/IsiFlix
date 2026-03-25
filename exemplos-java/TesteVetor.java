import java.util.Scanner;
public class TesteVetor{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double notas[]; // declaro o vetor
        notas = new double[5];
        
        for (int pos=0; pos < 5; pos++){
            System.out.println("Digite a nota do aluno "+pos);
            notas[pos] = teclado.nextDouble();
        }

        for (int pos=0; pos < 5 ; pos++){
            System.out.printf("Nota do aluno %d = %.2f\n ", pos, notas[pos]);
        }
        
        teclado.close();
    }
}