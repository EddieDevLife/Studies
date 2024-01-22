import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        int i;
        float a, b, c, maior, menor;
        float medio = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("se [1], escrever os três valores A, B e C em ordem crescente;");
        System.out.println("se [2], escrever os três valores A, B e C em ordem decrescente;");
        System.out.println("se [3], escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;");
System.out.println( "---------------------------------------------------------------------------------");
        System.out.println("digite um numero de 1 a 3");
        i = sc.nextInt();

        while (i != 1 && i != 2 && i != 3) {
            System.out.println("Escolha um numero de 1 a 3:");
            System.out.println("se  1, escrever os três valores A, B e C em ordem crescente;");
            System.out.println("se 2, escrever os três valores A, B e C em ordem decrescente;");
            System.out.println(" se  3, escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;");

            i = sc.nextInt();
        }

        System.out.println("agora digite 3 numero reais e tecle enter");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        maior = a;
        menor = a;

        if (maior < b) {
            maior = b;
        }
        if (maior < c) {
            maior = c;
        }
        if (menor > b) {
            menor = b;
        }
        if (menor > c) {
            menor = c;
        }
        if (menor != a && maior != a) {
            medio = a;
        }
        if (menor != b && maior != b) {
            medio = b;
        }
        if (menor != c && maior != c) {
            medio = c;
        }

        switch (i) {
            case 1:
                System.out.println(menor + " " + medio + " " + maior);
                break;
            case 2:
                System.out.println(maior + " " + medio + " " + menor);
                break;
            case 3:
                System.out.println(medio + " " + maior + " " + menor);
                break;
            default:
                break;
        }

    }
}
