public class  {
    private int numeroPedido;
    private String nomeAtendente;
    private int metaDiariaAtendente;
    private String codigoProduto;
    private int valor;
    private int quantidade;
    private String nomeCliente;
    private String CPF;
    private int avaliacaoCliente;


    public Pedidos(int numeroPedido, String nomeAtendente, int metaDiariaAtendente, String codigoProduto, int valor, int quantidade, String nomeCliente, String CPF, int avaliacaoCliente) {
        this.numeroPedido = numeroPedido;
        this.nomeAtendente = nomeAtendente;
        this.metaDiariaAtendente = metaDiariaAtendente;
        this.codigoProduto = codigoProduto;
        this.valor = valor;
        this.quantidade = quantidade;
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.avaliacaoCliente = avaliacaoCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getNomeAtendente() {
        return nomeAtendente;
    }

    public int getMetaDiariaAtendente() {
        return metaDiariaAtendente;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public int getAvaliacaoCliente() {
        return avaliacaoCliente;
    }
}
