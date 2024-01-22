package ex02;
import java.util.Scanner;

public class Atividade02{
    public static void main(String[]args){
        double cotacao;
        double quantidadeDeDolar;
        double valorEmReais;
        
        //criar um objeto para poder chamar o metodo conversor
        Conversor conversor = new Conversor();

        Scanner sc = new Scanner(System.in);
        System.out.println("digite a cotação do dólar");
        cotacao = sc.nextDouble();

        System.out.println("digite a quantidade desejada de dolares");
        quantidadeDeDolar = sc.nextDouble();

        valorEmReais = conversor.converterDolarParaReal(quantidadeDeDolar, cotacao);

        // Impressão do resultado
        System.out.printf("Valor em reais a ser pago: %.2f", valorEmReais);

    }

}