import java.util.Scanner;

/**
 * ex07
 */
public class ex07 {
    public static void main(String[] args) {
        int operacao;
        int n1, n2;
        float total;
        Scanner sc = new Scanner(System.in);

        System.out.println("escolha o primerio numero");
        n1 = sc.nextInt();
        System.out.println("escolha o segundo numero");
        n2 = sc.nextInt();

        System.out.println(
                "Escolha a operadcao desejada \n TECLE \n [1] para soma\n [2] para divisao\n [3] para multiplicacao\n [4] para subtracao");
        operacao = sc.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("resultado: " + (n1 + n2));

                break;

            case 2:
                System.out.println("resultado: " + ((float) n1 / n2));

                break;
            case 3:
                System.out.println("resultado: " + (n1 * n2));

                break;
            case 4:
                System.out.println("resultado: " +(n1 - n2));

                break;
            default:
                break;
        }
    }

}