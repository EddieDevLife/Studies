package Heranca;

public class Main {
    public static void main(String[] args) {
        Veiculos v1 = new Mod1();
        Veiculos v2 = new Mod2();
        v1.setAnoFabricacao("1990");
        v1.setCombustivel("gasolina");
        v1.setMarca("Ford");
        v1.setModelo("sedan");
        System.out.println("Ex: combustivel: "+ v1.getCombustivel() + " marca: " + v1. getMarca() +" modelo: " + v1.getModelo());
    }
}