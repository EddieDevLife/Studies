package ex05;

public class Retangulo {
    private double largura;
    private double altura;

    // Construtor da classe Retangulo
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Métodos para calcular área, perímetro e diagonal
    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    //Descobriremos a diagonal utilizando o teorema de Pitágoras
    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
}

