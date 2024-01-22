public class Main {

    static int previsao = 200;
    static int producao = 250;
    static int inicial = 50;
    static int estoqueFinal;




    public static void main(String[] args) {

        estoqueFinal = (inicial + producao) - previsao;

        System.out.println("estoque final previsto de "+ estoqueFinal+ " unidades");
    }
}