package ex03;

public class SalarioFuncionario {
    public static void main(String[] args) {
        int anoAtual = 2022;
        double salarioInicial = 2000.00;
        double aumento = 0.015; // 1,5% de aumento em 2017
        double salarioAtual = salarioInicial ;
        //criar tabela:
        System.out.println("Salário do funcionário nos anos de 2016 a " + anoAtual + ":");
        System.out.println("Ano\tSalário");
        System.out.println("----\t-------");
        System.out.println("2016\tR$" + salarioInicial);
        salarioAtual = salarioInicial + salarioInicial * aumento ;
        System.out.println("2017\tR$" + salarioAtual);
         
        for (int ano = 2018; ano <= anoAtual; ano++) {
            aumento *= 2; // aumenta o percentual de aumento em relação ao ano anterior
            salarioAtual += salarioAtual * aumento; // calcula o novo salário com o aumento
            System.out.printf("%d\tR$%.2f\n", ano, salarioAtual); // imprime o ano e o salário formatado
        }
    }
}
