public class ex07 {
    //calcular aumento de funcionario

    public static void main(String[] args) {
        double salario = 2000.0;
        double aumento = 0.015;
        int ano = 2010;
        
        System.out.printf("Salário em %d: R$%.2f%n \n", ano, salario);
        System.out.println("Logo apos desde 2011 sempre o aumento dobra de porcentagem resultando em:");
        
        for (ano = 2011; ano <= 2022; ano++) {
            aumento *= 2;
            salario *= (1 + aumento);
            System.out.printf("Salário em %d: R$%.2f%n", ano, salario);
        }
    }
}
