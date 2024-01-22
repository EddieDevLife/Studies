package ClasseAbstrata;

public class PessoaFisica extends Pessoa {
    private long CPF;

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    private long RG;


}