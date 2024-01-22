package ex07;


    public class Estudante {
        private String nome;
        private double nota1;
        private double nota2;
        private double nota3;

        public Estudante(String nome, double nota1, double nota2, double nota3) {
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        public double calcularNotaFinal() {
            return nota1 * 0.3 + nota2 * 0.35 + nota3 * 0.35;
        }

        public boolean estaAprovado() {
            return calcularNotaFinal() >= 6.0;
        }

        public double pontosFaltandoParaAprovacao() {
            double notaFinal = calcularNotaFinal();
            return estaAprovado() ? 0.0 : 6.0 - notaFinal;
        }

        public void mostrarDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Nota final: " + calcularNotaFinal());
            if (estaAprovado()) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
                System.out.println("Pontos faltando para aprovação: " + pontosFaltandoParaAprovacao());
            }
        }
    }


