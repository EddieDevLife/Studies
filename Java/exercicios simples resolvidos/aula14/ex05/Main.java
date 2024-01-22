package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebe a largura e altura do retângulo
        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        // Cria um objeto da classe Retangulo
        Retangulo retangulo = new Retangulo(largura, altura);

        // Imprime a área, perímetro e diagonal do retângulo
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
        System.out.println("Diagonal do retângulo: " + retangulo.calcularDiagonal());

        sc.close();
    }
}


