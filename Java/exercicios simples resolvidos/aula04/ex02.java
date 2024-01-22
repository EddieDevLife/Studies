import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int anoAtual;
        int anoNascimento;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o ano atual");
        anoAtual = sc.nextInt();
        System.out.println("digite seu ano de nascimento: ");
        anoNascimento = sc.nextInt();
        
        System.out.println("sua idade e de: " + (anoAtual - anoNascimento) + " anos ");
    }
    
}
