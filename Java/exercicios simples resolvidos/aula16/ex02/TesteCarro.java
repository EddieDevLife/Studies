package ex02;

public class TesteCarro {
    public static void main(String[] args) {
        //Criando dois carros
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //Ligando o primeiro carro
        carro1.ligar();

        //Acelerando o primeiro carro em marcha média (1)
        carro1.setMarcha(1);
        carro1.acelerar();

        //Acelerando o primeiro carro em marcha alta (2)
        carro1.setMarcha(2);
        carro1.acelerar();

        //Desligando o primeiro carro
        carro1.desligar();

        //Ligando o segundo carro
        carro2.ligar();

        //Acelerando o segundo carro em marcha ré (-1)
        carro2.setMarcha(-1);
        carro2.acelerar();

        //Acelerando o segundo carro em marcha inválida (4)
        carro2.setMarcha(4);
        carro2.acelerar();

        //acelerando o carro1 até chegar a 1000km
        carro1.setMarcha(1);
        carro1.acelerar();

        carro1.setMarcha(2);
        carro1.acelerar();

        carro1.acelerar();
        carro1.acelerar();


        System.out.println("Velocidade atual do carro1: " + carro1.getVelocidadeAtual() + " km/h");
        System.out.println("Velocidade atual do carro2: " + carro2.getVelocidadeAtual() + " km/h");
    }
}
