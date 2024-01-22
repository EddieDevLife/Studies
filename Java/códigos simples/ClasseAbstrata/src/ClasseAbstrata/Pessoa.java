package ClasseAbstrata;

public abstract class  Pessoa {

    private int numero;
    private String bairro;
    private String cidade;
    private String unidadeFederacao;
    private int telefone;
    private String email;
    private String disciplinasMinistradas;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUnidadeFederacao() {
        return unidadeFederacao;
    }

    public void setUnidadeFederacao(String unidadeFederacao) {
        this.unidadeFederacao = unidadeFederacao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(String disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }
}
