package ex07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do primeiro trimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do segundo trimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do terceiro trimestre: ");
        double nota3 = scanner.nextDouble();

        Estudante estudante = new Estudante(nome, nota1, nota2, nota3);

        estudante.mostrarDados();

        scanner.close();
    }

}
