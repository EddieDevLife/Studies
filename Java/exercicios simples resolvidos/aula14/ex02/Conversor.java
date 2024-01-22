package ex02;

public class Conversor {

    private static final double IOF = 0.06;
    
    public double converterDolarParaReal(double valorDolar, double cotacao) {
        double valorReal = valorDolar * cotacao;
        valorReal = valorReal + (valorReal * IOF);
        return valorReal;
    }
    
}
