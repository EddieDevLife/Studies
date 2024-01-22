import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digiter um numero qualquer");
        n = sc.nextInt();

        if( n >= 0 && n <= 25){
            System.out.println("Esta no intervalo [0,25]");
        }else{
            if( n > 25 && n <= 50) {
                System.out.println("Esta no intervalo [26,50]");
                
            } else {
                if ( n > 50 && n <= 75) {
                    System.out.println("Esta no intervalo [51,75]");
                    
                } else {
                    if ( n > 75 && n <= 100) {
                        System.out.println("Esta no intervalo [76,100]");
                    } else {
                        System.out.println("Fora do intervalo");
                    }
                    
                }
                
            }
        }

    }
    
}
