import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        int inicio;
        int fim;
        int tempo;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a hora de inicio");
        inicio = sc.nextInt();
        System.out.println("digite a hora final ");
        fim = sc.nextInt();

        if ((fim - inicio) > 0) {
            tempo = fim - inicio;
        } else {
            tempo = 24 - inicio + fim;
        }

        System.out.println("tempo de jogo: " + tempo + " horas");
    }

}
