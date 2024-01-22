package ex03;

public class OperacaoMatematica {


        protected int N;

        public void setN(int n) {
            this.N = n;
        }

        public boolean parOuImpar() {
            return N % 2 == 0;
        }

        public boolean negativoOuPositivo() {
            return N < 0;
        }

        /* A variável N foi definida como protected para que possa ser acessada pelas subclasses de OperacaoMatematica.
         Porém, como não há subclasses na implementação atual, poderíamos definir a variável como private sem causar
         impactos. No entanto, se futuramente houver necessidade de criar subclasses, essa mudança pode causar
         problemas de acesso a variável. Portanto, é importante avaliar as necessidades do projeto antes de definir
         a visibilidade dos membros da classe.
         */

    }



