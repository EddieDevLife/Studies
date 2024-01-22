import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array para armazenar os nomes dos times
        String[] times = new String[10];

        // Lê o nome de cada time
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do time " + (i+1) + ": ");// i + 1 porque o vetor começa em zero e não em um
            times[i] = input.nextLine();
        }

        System.out.println("Tabela do Campeonato:");

        // Imprime a tabela do campeonato

        //Para evitar jogos repetidos, o segundo loop começa em i+1. Cada jogo é impresso duas vezes, uma para a ida e outra para a volta.
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                System.out.println(times[i] + " X " + times[j]);
                System.out.println(times[j] + " X " + times[i]);
            }
        }

        input.close();
    }
    
}
