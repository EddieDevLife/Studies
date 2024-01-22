package aula10;
import java.util.Scanner;

public class ex01 {

    // NumeroPrimo 
       public static void main(String[] args) {
    
          int numero;
          boolean ehPrimo = true;
    
          Scanner input = new Scanner(System.in);
    
          System.out.print("Digite um número inteiro positivo: ");
          numero = input.nextInt();
    
          // Verifica se o número é primo
          for (int i = 2; i <= numero / 2; i++) {
             if (numero % i == 0) {
                ehPrimo = false;
                break;
             }
          }
    
          // Imprime o resultado
          if (ehPrimo) {
             System.out.println(numero + " é um número primo.");
          } else {
             System.out.println(numero + " não é um número primo.");
          }
       }
    
}
