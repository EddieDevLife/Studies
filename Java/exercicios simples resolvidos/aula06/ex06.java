import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int n;
        String resposta; 

        Scanner sc = new Scanner(System.in);
        System.out.println("escolha um numero inteiro");
        n = sc.nextInt();
        resposta = n > 10 ? "maior" : "menor";
        System.out.println("Numero e " + resposta + " que 10");
        
        resposta = n > 5 ? "maior" : "menor";
        System.out.println("Numero e " + resposta + " que 5");
           

    }
    
}
