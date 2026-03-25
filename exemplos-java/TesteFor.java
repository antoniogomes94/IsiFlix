import java.util.Scanner;
public class TesteFor{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Digite um valor");
        numero = teclado.nextInt();

        // contador = contador + 1
        // contador++         (errado)-> contador = contador++
        // contador += 1
        for (int contador = 1 ; contador <= 10 ; contador++ ){
            if (contador == 5){
                continue;
            }
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
        }
        teclado.close();
    }
}