import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        double A, B, C;
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite 3 numeros inteiros correspondentes a A, B, C respectivamente");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        System.out.printf("a área do triângulo retângulo que tem A por base e C por altura = %.3f \n" , (A * C)/2);
        System.out.printf("a área do círculo de raio C %.3f \n" , (C*C*pi));
        System.out.printf("a área do trapézio que tem A e B por bases e C por altura %.3f \n" , (((A + B) * C)/2));
        System.out.printf("a área do quadrado que tem lado B e %.3f \n", (B*B));
        System.out.printf("a área do retângulo que tem lados A e B. %.3f \n" , (A * B));
    }
}
