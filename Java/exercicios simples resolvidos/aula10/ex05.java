
import java.util.Scanner;

public class ex05 {
//leito de codigo de produtos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, produtoA = 0, produtoB = 0, produtoC = 0;
        
        while (true) {
            System.out.print("Digite o código do produto (1 a 3) ou 4 para sair: ");
            codigo = sc.nextInt();
            
            switch (codigo) {
                case 1:
                produtoA++;
                    break;
                case 2:
                produtoB++;
                    break;
                case 3:
                produtoC++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    System.out.printf("Quantidade de clientes que compraram Produto A: %d%n", produtoA);
                    System.out.printf("Quantidade de clientes que compraram Produto B: %d%n", produtoB);
                    System.out.printf("Quantidade de clientes que compraram Produto C: %d%n", produtoC);
                    
                    return;
                default:
                    System.out.println("Código inválido! Tente novamente.");
                    
                    break;
            }
            sc.close();    
        }
        
    }
}
