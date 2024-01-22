import java.util.Scanner;
//imposto de renda
public class ex13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o salário: R$ ");
        double salario = leitor.nextDouble();
        double imposto = 0;
        
        if (salario <= 1903.98) {
            imposto = 0;
        } else if (salario <= 2826.65) {
            imposto = salario * 0.075;
        } else if (salario <= 3751.05) {
            imposto = salario * 0.15;
        } else if (salario <= 4664.68) {
            imposto = salario * 0.225;
        } else {
            imposto = salario * 0.275;
        }
        
        System.out.printf("Imposto de renda: R$ %.2f", imposto);
        leitor.close();
    }
}
