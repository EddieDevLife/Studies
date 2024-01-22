import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args) {
        float n1, n2, n3, media;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite a primeira nota ");
        n1 = sc.nextFloat();
        
        System.out.println("digite a segunda nota ");
        n2 = sc.nextFloat();
        
        System.out.println("digite a terceira nota ");
        n3 = sc.nextFloat();
        
        media = ( n1 + n2 + n3 )/3 ;

        if ( media >= 7 ){
            System.out.println("Aprovado");
        }else{
            if(media < 7 && media >= 5){
                System.out.println("Recuperação");

            }else{
                System.out.println("Reprovado");
            }
        }

        
    }
    
}



