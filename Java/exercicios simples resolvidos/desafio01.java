import java.util.Scanner;

public class desafio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o preço: R$ ");
        double preco = input.nextDouble();
        System.out.print("Informe a categoria (1-limpeza; 2-alimentação; 3-vestuário): ");
        int categoria = input.nextInt();
        System.out.print("Informe a situação (R-refrigerado; N-não refrigerado): ");
        String situacao = input.next();

        double aumento = 0;
        if (preco <= 25) {
            if (categoria == 1) {
                aumento += preco * 0.05;
            } else if (categoria == 2) {
                aumento += preco * 0.08;
            } else if (categoria == 3) {
                aumento += preco * 0.1;
            }
        } else {
            if (categoria == 1) {
                aumento += preco * 0.12;
            } else if (categoria == 2) {
                aumento += preco * 0.15;
            } else if (categoria == 3) {
                aumento += preco * 0.18;
            }

        }

        double desconto;
        double precoComAumento = preco + aumento;
        System.out.printf("Preço com aumento: R$ %.2f", precoComAumento);

        if (categoria == 2 && situacao != "N" ) {
            desconto = 0.08;

        } else {
            if (categoria == 2 || situacao != "N") {
                desconto = 0.05;

            } else {
                desconto = 0;
            }
        }
        double novoPreco = precoComAumento - (desconto * precoComAumento);
        System.out.println(" o desconto será de " + (desconto * 100) + " % e o preco sera: R$" + novoPreco);

        if (novoPreco <= 50) {
            System.out.println("Classificaçao: ** Barato **");
        } else if (novoPreco <= 120) {
            System.out.println("Classificaçao: ** Normal **");
        } else {
            System.out.println("Classificaçao: ** Caro **");

        }

        input.close();
    }
}
