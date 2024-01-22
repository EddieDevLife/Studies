package ClasseAbstrata;

public class PessoaJuridica extends Pessoa {
    private String razaoSocial;
    private String nomeFantasia;
    private long inscricaoMunicipal;
    private long inscricaoEstadual;
    private String CNPJ;
    private String webSite;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public long getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(long inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public long getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(long inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
