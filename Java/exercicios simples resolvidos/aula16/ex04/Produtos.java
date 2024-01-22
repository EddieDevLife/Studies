package ex04;
class Produtos {
    protected int codigo;
    protected double preco;
    protected String nome;
    protected int quantidade;

    public Produtos(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;

        switch (codigo){
            case 1:
                this.preco = 7.00;
                this.nome = "Cachorro-Quente";
            break;
            case 2:
                this.preco = 9.00;
                this.nome = "X-Salada";
                break;

            case 3:
                this.preco = 11.0;
                this.nome = "X-Bacon";
                break;
            case 4:
                this.nome = "Torrada";
                this.preco = 5.00;
                break;
            case 5:
                this.nome = "Refrigante";
                this.preco = 4.00;
                break;
            default:
                this.nome = "Invalido";
                this.preco = 0;
        }

    }

    public double calcularValorConta() {
        return quantidade * preco;
    }
}