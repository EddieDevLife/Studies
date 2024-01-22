package ex01;

public class Triangulo {
    int ladoA;
    int ladoB;
    int ladoC;
    double areaTriangulo;
    double p;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.p = (ladoA + ladoB + ladoC)/2;
    }
    
    public double calcularArea(){
        areaTriangulo = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
        return areaTriangulo;
    }
    
}
