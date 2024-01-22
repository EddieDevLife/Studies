package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = input.nextInt();


        System.out.print("Digite a quantidade do produto: ");
        int quantidade = input.nextInt();

        Produtos produto = new Produtos(codigo, quantidade);

        System.out.println(produto.quantidade + " unidades do produto " + produto.nome+  " valor da conta a pagar: R$ " + produto.calcularValorConta());
    }
}

