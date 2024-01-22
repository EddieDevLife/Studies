import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int soma;
        int sub;
        double div;
        int multi;

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        n1 = entrada.nextInt();
        System.out.println("digite o segundo numero");
        n2 = entrada.nextInt();

        sub = n1 -n2;
        soma = n1 + n2;
        div = (double) n1 / n2;
        multi = n1 * n2 ;
        System.out.println("soma= " + soma);
        System.out.println("multiplicaçao= " + multi);
        System.out.println("divisao= " + div);
        System.out.println("subtracao= " + sub);
    }
}
