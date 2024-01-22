import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int n;
        String resp;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite um numero ");
        n = sc.nextInt();
        if( n >= 0){
            resp = n % 2 == 0 ? "Par" : "Impar";
            System.out.println(resp);
        } else{
            System.out.println("negativo");
        }  
        sc.close();
    }
    
}
