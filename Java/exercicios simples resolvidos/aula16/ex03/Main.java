package ex03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OperacaoMatematica operacao = new OperacaoMatematica();

        System.out.print("Digite um número inteiro: ");
        operacao.setN(input.nextInt());

        System.out.println("O número digitado é " + (operacao.negativoOuPositivo() ? "negativo" : "positivo") + " e " + (operacao.parOuImpar() ? "par" : "ímpar") + ".");
    }
}
