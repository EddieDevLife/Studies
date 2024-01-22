package ex06;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o imposto do funcionário: ");
        double imposto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

        funcionario.mostrarDados();

        System.out.print("Digite a porcentagem de aumento do salário: ");
        double porcentagem = scanner.nextDouble();

        funcionario.aumentarSalario(porcentagem);

        funcionario.mostrarDados();

        scanner.close();
    }
}



