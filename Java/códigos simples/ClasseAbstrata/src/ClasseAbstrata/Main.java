package ClasseAbstrata;

public class Main {
    public static void main(String[] args) {

        PessoaFisica f = new PessoaFisica();
        f.setCPF(316316336);
        f.setRG(402112556);
        f.setBairro("jardim lagoa azul");
        f.setTelefone(123598868);
        f.setEmail("ederson@ederson.com");// e é só seguir com os demais dados


        PessoaJuridica j = PessoaJuridica();
        j.setCNPJ("100.222.22/0001-25");
        j.setEmail("empresa@google.com");
        j.setRazaoSocial("3332222-ficção");
        j.setCidade("Valinhos");
    }

}