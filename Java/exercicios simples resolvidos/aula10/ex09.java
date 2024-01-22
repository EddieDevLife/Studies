import java.util.Scanner;

public class ex09
 {
//ex material radioativo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a massa inicial do material radioativo em gramas: ");
        double massa = sc.nextDouble();
        double massaFinal = 0.5; // massa em gramas
        int segundos = 0;
        double massaInicial = massa;
        
        while (massa >= massaFinal) {
            massa /= 2.0;
            segundos += 50;
        }
        
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;
        
        System.out.printf("Massa inicial: %.2f g%n", massaInicial );
        System.out.printf("Massa final: %.2f g%n", massa);
        System.out.printf("Tempo necessário: horas: %02d min:%02d seg:%02d%n", horas, minutos, segundos);
        
        sc.close();
    }

}
