package ex01;

public class ContaBanco {
    private String tipoConta;
    private boolean status;
    private double saldo;
    private String nomeCliente;
    private String numeroConta;
    public ContaBanco(String tipoConta, String nomeCliente, String numeroConta) {
        if (!tipoConta.equals("CC") && !tipoConta.equals("CP")) {
            throw new IllegalArgumentException("Tipo de conta inválido. Escolha CC ou CP");
        }
        this.tipoConta = tipoConta;
        this.status = false;
        this.saldo = 0;
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
    }

    public void abrirConta() {
        this.status = true;
        if (this.tipoConta.equals("CC")) {
            this.saldo += 50;
        } else {
            this.saldo += 150;
        }
    }

    public void fecharConta() {
        if (this.saldo != 0) {
            throw new RuntimeException("Não é possível fechar conta com dinheiro na conta");
        }
        if (this.status == false) {
            throw new RuntimeException("Conta já está fechada");
        }
        this.status = false;
    }

    public void depositar(double valor) {
        if (this.status == false) {
            throw new RuntimeException("Conta fechada. Não é possível depositar");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.status == false) {
            throw new RuntimeException("Conta fechada. Não é possível sacar");
        }
        if (this.saldo < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public boolean isStatus() {
        return status;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void pagarMensal() {
        double taxa = 0;
        if (this.tipoConta.equals("CC")) {
            taxa = 12;
        } else {
            taxa = 20;
        }
        if (this.status == true) {
            this.saldo -= taxa;
        }



    }

    public void extrato() {
        System.out.println("Nome do cliente: " + getNomeCliente() + " Numero da Conta: " + getNumeroConta() + " Saldo: " + getSaldo() + "  Status => conta ativa? R: " + getStatus());

    }
}



