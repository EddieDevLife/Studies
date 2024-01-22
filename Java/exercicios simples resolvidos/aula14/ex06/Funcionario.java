package ex06;



    public class Funcionario {
        private String nome;
        private double salarioBruto;
        private double imposto;

        public Funcionario(String nome, double salarioBruto, double imposto) {
            this.nome = nome;
            this.salarioBruto = salarioBruto;
            this.imposto = imposto;
        }

        public double calcularSalarioLiquido() {
            return salarioBruto - imposto;
        }

        public void aumentarSalario(double porcentagem) {
            salarioBruto += salarioBruto * porcentagem / 100.0;
        }

        public void mostrarDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Salário líquido: " + calcularSalarioLiquido());
        }

    }
