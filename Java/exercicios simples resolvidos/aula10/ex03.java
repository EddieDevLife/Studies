import java.util.Scanner;
public class ex03 {
    

    // calcular divisores de um numero qualquer
    
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int n;
            
            System.out.print("Digite um número inteiro: ");
            n = teclado.nextInt();
            
            System.out.printf("Divisores de %d: ", n);
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }

            teclado.close();    
            }
        }   
    }
       
