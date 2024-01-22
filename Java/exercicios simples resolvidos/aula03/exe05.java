import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        String nomeAluno;
        int idade;
        float n1, n2, n3, n4, media;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do aluno: ");
        nomeAluno = sc.nextLine();

        System.out.println("digite a idade: ");
        idade = sc.nextInt();

        System.out.println("DIGITE AS 4 NOTAS: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Aluno: " + nomeAluno + " tem " + idade + " anos de idade e sua media anual foi: " + media);

    }

}
