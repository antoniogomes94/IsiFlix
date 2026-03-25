import java.util.Scanner;
public class BEE1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod, qtd;
        double total=0.0;
        // Entrada
        cod = teclado.nextInt();
        qtd = teclado.nextInt();
        if (cod == 1){    // o codigo é 1?? então beleza!!
            total = qtd * 4.00;
        }
        else if (cod == 2){
            total = qtd * 4.50;
        }
        else if (cod == 3){
            total = qtd * 5.00;
        }
        else if (cod == 4){
            total = qtd * 2.00;
        }
        else if (cod == 5){
            total = qtd * 1.50;
        }
        System.out.printf("Total: R$ %.2f\n", total);



        teclado.close();
    }
}