import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        int a, b, resp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero e tecle enter");
        a = sc.nextInt();
        System.out.println("Digite outro numero e tecle enter");
        b = sc.nextInt();
        resp = a > b ? (a + b) : ( b -a );
        
        System.out.println(resp);
        
    }
    
}
