import java.util.Scanner;

class ex01{
    public static void main(String[] args) {
        int n;
        String resp;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero para saber se é imper ou par ");
        n = sc.nextInt();
        resp = n % 2 == 0 ? "Par" : "Impar";
        System.out.println(resp); 
    }
}