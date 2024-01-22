import java.util.Scanner;

public class ex08 {

    //Calcular media das 2 provas dos 3 alunos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[3][2];
        double mediaTurma = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o nome do aluno %d: ", i+1);
            String nome = sc.next();
            System.out.printf("Digite a nota da prova 1 do aluno %d: ", i+1);
            notas[i][0] = sc.nextDouble();
            System.out.printf("Digite a nota da prova 2 do aluno %d: ", i+1);
            notas[i][1] = sc.nextDouble();
            
            double mediaAluno = (notas[i][0] + notas[i][1]) / 2;
            System.out.printf("O aluno %s teve média %.1f e está %s%n", 
                    nome, mediaAluno, mediaAluno >= 6.0 ? "APROVADO" : "REPROVADO");
            
            mediaTurma += mediaAluno;
        }
        
        mediaTurma /= 3;
        System.out.printf("Média da turma: %.1f%n", mediaTurma);
        
        sc.close();
    }
}
