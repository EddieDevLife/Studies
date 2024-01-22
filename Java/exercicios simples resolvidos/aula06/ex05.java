import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        int a, b, c;
        boolean triangulo;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite as medidas dos lados do triangulo ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        triangulo = (a+b)>c && (a+c)>b && (b+c)>a ? true : false;
        if(triangulo){
            System.out.println("é triangulo");
            if(a==b&&b==c) {
                System.out.println("Equilatero");
              
            }else{
                if(a==b||b==c||c==a){
                    System.out.println("Isóceles ");                 

                }else{
                    System.out.println("Escaleno");
                }
            }

        }else{
            System.out.println("não é triangulo");
        }
         

    }
    
}
