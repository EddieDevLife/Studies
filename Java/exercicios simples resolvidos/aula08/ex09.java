import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        int a, b;
        float aux;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        a = sc.nextInt();
        System.out.println("Digite outro numero inteiro");
        b = sc.nextInt();

        if(a >= b){
            aux = a % b;
        }else{
            aux = b % a;
        }

        if(aux == 0){
            System.out.println(" Os numeros sao multiplos");
        }else{
            System.out.println("Nao sao multiplos");
        }
    }
    
}
