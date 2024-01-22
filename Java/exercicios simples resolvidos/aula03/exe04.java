import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {

        int base;
        int altura;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite a base do triangulo");
        base = sc.nextInt();
        System.out.println("digite a altura do triangulo");
        altura = sc.nextInt();

        System.out.println("base = " + base + " altura e = " + altura + " e a area e = " + ((base * altura) / 2));
    }
    
}
