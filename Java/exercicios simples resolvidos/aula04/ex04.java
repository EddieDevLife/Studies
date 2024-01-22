import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int raio;
        double pi = 3.14159;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o raio do circulo ");
        raio = sc.nextInt();

        area = pi * (raio * raio);
        System.out.printf("a area do circulo e de: %.2f", area);
        System.out.println();
        System.out.printf("a area do circulo e de: %.4f", area);


    }    
}
