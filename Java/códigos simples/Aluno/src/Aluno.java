import javax.swing.*;

public class Aluno {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private int matricula;

    public void imprimeTela(String nome, String endereco, String telefone, String email, Integer matricula) {

        nome = JOptionPane.showInputDialog("digite o nome do aluno: ");
        endereco = JOptionPane.showInputDialog("digite o endereco do aluno: ");
        matricula = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de matricula do aluno"));
        telefone = JOptionPane.showInputDialog("digite o telefone do aluno: ");
        email = JOptionPane.showInputDialog("digite o endereco de emil do aluno: ");

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }

}
