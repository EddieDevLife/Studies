import java.util.Scanner;

public class ex06 {
    //calcular quadrado e cubo em cada linha

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        
        System.out.print("Digite um número inteiro positivo: ");
        x = input.nextInt();
        
        for (int i = 1; i <= x; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d -> quadrado: %d cubo: %d%n", i, quadrado, cubo);
        }
    }
}
