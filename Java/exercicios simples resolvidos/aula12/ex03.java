
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("escreva um numero inteiro");
        numero = sc.nextInt();

        System.out.println("resposta: ");
        ehpar(numero);
    }

    private static void ehpar(int n) {
        if (n % 2 == 0) {
            System.out.println("O numero é par!");

        } else {
            System.out.println("O numero é impar!");

        }

    }

}
