import java.util.Scanner;

public class ex004 {
public static void main(String[] args) {
    double produto;
    double total;
    Scanner sc = new Scanner(System.in);
    System.out.println("digite p valor do produto");
    produto = sc.nextDouble();
    total = produto >= 30 ? produto * 0.80 : produto * 0.90;
    System.out.println(" valor do produto com desconto: " + total); 
}    
}
