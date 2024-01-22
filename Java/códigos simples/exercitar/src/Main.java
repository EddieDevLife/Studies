
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String aluno;
        float nota1, nota2, media, soma, mediaTurma;
        soma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("nome do aluno");
            aluno = teclado.next

            System.out.println("Nota 1: ");
            nota1 = teclado.nextFloat();

            System.out.println("nota 2: ");
            nota2 = teclado.nextFloat();

            teclado.nextLine();
            media = (nota1 + nota2) / 2;

            soma = soma + media;
            System.out.printf("a média do aluno é %.1f\n", media);
            if (media >= 6) {
                System.out.println("Aluno aprovado");

            } else {
                System.out.println("reprovado! Estude mais!");
            }

        }
        mediaTurma = soma / 3;
        System.out.println(mediaTurma);
        teclado.close();
    }
}