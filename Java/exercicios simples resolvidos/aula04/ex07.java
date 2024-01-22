import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        int codigo1;
        int nPecas1;
        float valor1;
        float total1;

        int codigo2;
        int nPecas2;
        float valor2;
        float total2;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o codigo da peca 1");
        codigo1 = sc.nextInt();
        System.out.println("digite o numero de pecas 1");
        nPecas1 = sc.nextInt();
        System.out.println("digite o valor das peca 1");
        valor1 = sc.nextInt();
        
        total1 = valor1 * nPecas1;

        System.out.println("digite o codigo da peca 2");
        codigo2 = sc.nextInt();
        System.out.println("digite o numero de pecas 2");
        nPecas2 = sc.nextInt();
        System.out.println("digite o valor das peca 2");
        valor2 = sc.nextInt();
        
        total2 = valor2 * nPecas2;

        System.out.printf("valor total a pagar: R$ %.2f ", (total1 + total2));
    }
    
}
