import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int v;

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Faca sua doacao tecle \n[1] para doar R$10 \n[2] para doar R$25\n[3] para doar R$50\n[4] para doar outros valores\n[5] para cancelar");

        v = sc.nextInt();
        switch (v) {
            case 1:
                System.out.println("Obrigado voce doou R$10,00");

                break;
            case 2:
                System.out.println("Obrigado voce doou R$25,00");

                break;
            case 3:
                System.out.println("Obrigado voce doou R$50,00");

                break;
            case 4:
                System.out.println("Obrigado voce doou outros valores");

                break;
            default:
                break;
        }
    }

}
