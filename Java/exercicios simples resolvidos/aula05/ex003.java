import java.util.Scanner;
public class ex003 {
    public static void main(String[] args) {
     int dia;
        String quinzena;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o dia do mes que estamos");
        dia = sc.nextInt();
        quinzena = dia <= 15 ? "primeira quinzena" : "segunda quinzena";
        System.out.println("Estamos na " + quinzena);

    }
}
