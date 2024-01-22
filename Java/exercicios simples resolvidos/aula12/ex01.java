import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // fiz um vetor para armazenar os nomes dos alunos
        String[] nomesAlunos = new String[5];

        // mais uma matris para armazenar as notas de cada aluno
        double[][] notas = new double[5][2];

        // Lê o nome de cada aluno e suas notas
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do aluno " + (i+1) + ": ");
            nomesAlunos[i] = entrada.nextLine();

            // aproveitando o mesmo contador para adicionar alunos e notas
            System.out.print("Nota da prova 1: ");
            notas[i][0] = entrada.nextDouble();

            System.out.print("Nota da prova 2: ");
            notas[i][1] = entrada.nextDouble();

            // Lê o caractere '\n' que sobra no buffer após a leitura de um double para não dar falha no java
            entrada.nextLine();
        }

        // Calcular a média da turma usando o For e atraves das matrizes contendo aluno[i] e nota[0 ou 1] conforme abaixo 
        double mediaTurma = 0;
        for (int i = 0; i < 5; i++) {
            mediaTurma += (notas[i][0] + notas[i][1])/2;
        }
        mediaTurma /= 5;

        System.out.println("Média da turma: " + mediaTurma);

        // Imprime os alunos com média maior que a média da turma
        // o For ira executar o laço 5 vezes porem o "if" só vai permitir imprimir qdo encontrar uma media de aluno maior
        // o nome do aluno precisa estar na ordem correta de 0 a 4 conforme as notas
        System.out.println("Alunos com média maior que a média da turma:");
        for (int i = 0; i < 5; i++) {
            double mediaAluno = (notas[i][0] + notas[i][1])/2;
            if (mediaAluno > mediaTurma) {
                System.out.println(nomesAlunos[i] + " - média: " + mediaAluno);
            }
        }

        entrada.close();
    }
}
