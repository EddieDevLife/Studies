import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        
        int A, B, C, D;
        int diferenca;
        Scanner sc = new Scanner(System.in);
        
        

        System.out.println("DIGITE 4 valores inteiros referentes a A, B ,C, D respectivamente: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("A formula DIFERENCA = (A * B - C * D): ");
        System.out.println("DIFERENCA" + diferenca);

    }    
}
