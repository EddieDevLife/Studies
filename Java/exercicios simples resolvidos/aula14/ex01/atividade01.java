package ex01;
/**
 * atividade01 usando conceito de classes formula de Heron para descobrir area de triangulo qualquer 
 */
public class atividade01 {

    public static void main(String[] args) {
        
        // numeros escolhidos aleatoriamente para testar
        Triangulo trianguloX = new Triangulo(3,4,5);
        Triangulo trianguloY = new Triangulo(3, 3, 6);
        
        
        if (trianguloX.calcularArea() > trianguloY.calcularArea()) {
            System.out.println("O triângulo X tem a maior área.");
        } else if (trianguloX.calcularArea() < trianguloY.calcularArea()) {
            System.out.println("O triângulo Y tem a maior área.");
        } else {
            System.out.println("Os dois triângulos têm a mesma área.");
        }
     }
}