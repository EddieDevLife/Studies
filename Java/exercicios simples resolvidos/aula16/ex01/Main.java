package ex01;

public class Main {
    public static void main(String[] args) {
        ContaBanco contaJoao = new ContaBanco("CC", "João Silva", "0001");
        ContaBanco contaMaria = new ContaBanco("CP","Maria Silva", "0002");

        contaJoao.abrirConta();
        contaMaria.abrirConta();

        contaMaria.pagarMensal();
        contaJoao.pagarMensal();

        contaJoao.depositar(300);
        contaMaria.depositar(400);


        contaMaria.extrato();
        contaJoao.extrato();
    }
}
