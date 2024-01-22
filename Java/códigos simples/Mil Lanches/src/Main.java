public class Main {
    public static void main(String[] args) {

        Pedidos cliente = new Pedidos(122,"joão",10,"abc123",50,1,"Miclele","123.123.123-12",8);
        System.out.println("exemplo de aplicacao: Nome: "+ cliente.getNomeCliente()+ "  mostrar avaliacao do cliente:  nota "+cliente.getAvaliacaoCliente());
    }
}