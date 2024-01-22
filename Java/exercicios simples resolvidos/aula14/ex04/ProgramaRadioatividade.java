package ex04;
import java.util.Scanner;

public class ProgramaRadioatividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebe a massa inicial em gramas
        System.out.print("Digite a massa inicial em gramas: ");
        double massaInicial = sc.nextDouble();

        // Define a massa final em gramas
        double massaFinal = 0.5;

        // Define o intervalo de tempo em segundos
        int intervaloTempo = 50;

        // Calcula o número de ciclos necessários para atingir a massa final
        int numCiclos = (int) Math.ceil(Math.log(massaFinal/massaInicial)/Math.log(0.5));

        // Calcula o tempo total em segundos
        int tempoTotal = numCiclos * intervaloTempo;

        // Calcula o tempo em horas e minutos
        int horas = tempoTotal / 3600;
        int minutos = (tempoTotal % 3600) / 60;

        // Imprime os resultados
        System.out.println("Massa inicial: " + massaInicial + " gramas");
        System.out.println("Massa final: " + massaFinal + " gramas");
        System.out.println("Tempo necessário: " + horas + " horas e " + minutos + " minutos");

        sc.close();
    }
}
