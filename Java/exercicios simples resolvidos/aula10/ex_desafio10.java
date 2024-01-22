import java.util.Scanner;

public class ex_desafio10 {

    //eleição de 5 candidatos a lider de turma
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] candidatos = new String[5];
        int[] votos = new int[5];
        int totalVotos = 0;
        
        // Recebe os nomes dos candidatos
        System.out.println("Digite os nomes dos candidatos a líder de turma:");
        for (int i = 0; i < 5; i++) {
            candidatos[i] = sc.nextLine();
        }
        
        // Recebe os votos dos alunos
        System.out.println("Digite o número do candidato escolhido (1 a 5), ou 0 para encerrar a votação:");
        int voto = sc.nextInt();
        while (voto != 0) {
            if (voto >= 1 && voto <= 5) {
                votos[voto-1]++;
                totalVotos++;
            } else {
                System.out.println("Voto Inválido");
            }
            System.out.println("Digite o número do candidato escolhido (1 a 5), ou 0 para encerrar a votação:");
            voto = sc.nextInt();
        }
        
        // Mostra o total de votos de cada candidato e o candidato vencedor
        int maiorVoto = 0;
        int indiceVencedor = 0;
        System.out.println("Total de votos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(candidatos[i] + ": " + votos[i]);
            if (votos[i] > maiorVoto) {
                maiorVoto = votos[i];
                indiceVencedor = i;
            }
        }
        System.out.println("Total de votos na eleição: " + totalVotos);
        System.out.println("Candidato vencedor: " + candidatos[indiceVencedor]);
        
        sc.close();
    }
}
