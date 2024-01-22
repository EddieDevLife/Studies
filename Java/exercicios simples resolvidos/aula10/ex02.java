import java.util.Scanner;

public class ex02 {
//Validador de Senha 2023
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            
            if (senha != 2023) {
                System.out.println("Senha Inválida! Tente novamente.");
            }
            
        } while (senha != 2023);
        
        System.out.println("Acesso Permitido.");
        sc.close();
    }
}
