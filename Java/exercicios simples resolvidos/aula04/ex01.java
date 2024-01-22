import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        String correntista;
        int agencia;
        int conta;        

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do correntista: ");
        correntista = sc.nextLine();
        System.out.println("digite o numero da agencia: ");
        agencia = sc.nextInt();
        System.out.println("digite o numero da conta: ");
        conta = sc.nextInt(); 

        System.out.println("Cliente: " + correntista);
        System.out.println("agencia: " + agencia);
        System.out.println("conta: " + conta);
    }
}
