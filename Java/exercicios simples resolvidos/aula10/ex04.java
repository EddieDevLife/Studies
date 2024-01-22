import java.util.Scanner;

public class ex04 {
// ler coordenada e anuciar quadrante
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        
        while (true) {
            System.out.println("Atenção! O algoritmo só será interrompido quando alguma das coordenadas for nula!");
            System.out.print("Digite a coordenada X: ");
            x = input.nextInt();
            System.out.print("Digite a coordenada Y: ");
            y = input.nextInt();
            
            if (x == 0 || y == 0) {
                System.out.println("Algoritmo Interrompido!!");
                break;
            } else if (x > 0 && y > 0) {
                System.out.println("O ponto está no primeiro quadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("O ponto está no segundo quadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("O ponto está no terceiro quadrante.");
            } else {
                System.out.println("O ponto está no quarto quadrante.");
            }
        }
    }
}
