package ex02;

public class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidadeAtual;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidadeAtual = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void desligar() {
        setLigado(false);
        System.out.println("Carro está desligado.");
    }

    public void ligar() {
        setLigado(true);
        System.out.println("O carro está ligado.");
    }

    public void acelerar() {
        if (getMarcha() == -1) {
            setVelocidadeAtual(getVelocidadeAtual() - 10);
        } else if (getMarcha() == 0) {
            setVelocidadeAtual(getVelocidadeAtual());
        } else if (getMarcha() == 1) {
            setVelocidadeAtual(getVelocidadeAtual() + 10);
        } else if (getMarcha() == 2) {
            setVelocidadeAtual(getVelocidadeAtual() + 20);
        } else {
            System.out.println("Marcha inválida!");
        }
        if (getVelocidadeAtual()< 0){
            System.out.println("Veiculo em Marcha Ré");
        } else if (getVelocidadeAtual() == 0) {
            System.out.println("Veiculo em pónto morto");
        } else if (getVelocidadeAtual() < 40 ) {
            System.out.println("Velocidade Média");
        }else if (getVelocidadeAtual() <= 80) {
            System.out.println("Velocidade alta");
        }else{
            System.out.println("Velocidade muito alta");
        }

    }


}
