import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int funcionario;
        int horas;
        float salarioHora;
        float salario;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero do funcionario");
        funcionario = sc.nextInt();
        System.out.println("digite as horas trabalhadas ");
        horas = sc.nextInt();
        System.out.println("digite o valor que o funcionario ganha por horas ");
        salarioHora = sc.nextFloat();
        salario = salarioHora * horas;

        System.out.println("Funcionario numero: " + funcionario );
        System.out.printf("Recebe SALARIO = R$ %.2f",salario);
    }
    
}
