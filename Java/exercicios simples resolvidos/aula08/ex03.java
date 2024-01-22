import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        float salario;
        float financiamento;
        String resp;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite o valor do financiamento desejado ");
        financiamento = sc.nextFloat();
        System.out.println("digite o valor do seu salario");
        salario = sc.nextFloat(); 
        
        resp = financiamento <= (5 * salario) ? "Financiamento concedido" : " Financiamento negado";
        
        System.out.println(resp);
        
        System.out.println("Obrigado por nos consultar");
          
        sc.close();
    }
    
}

