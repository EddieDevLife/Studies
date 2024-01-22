import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        try {
            int a = ler.nextInt();
            int b = ler.nextInt();

            System.out.println("vamos executar a operacao");
        } catch (Exception erro) {
            System.out.println("nao foi digitado um numero decimal! erro:  " + erro);
        } finally {
            System.out.println("***FIM***   até logo");
        }
    }
}