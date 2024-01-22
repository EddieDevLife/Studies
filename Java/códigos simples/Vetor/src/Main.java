
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int numeroPastas = 5;
        int[] pasta = new int[numeroPastas];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < pasta.length; i++) {
            System.out.println("informe o numero da pasta: ");
            pasta[i] = teclado.nextInt();
        }
        Arrays.sort(pasta);
        for (int valor : pasta){
            System.out.println(valor + " ");
        }

    }
}
        /*
        int[] num = new int[numer];
        num[0]=10;
        num[2]=2;
        num[1]=5;
        num[3]=3;
        num[4]=9;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        char[] gabarito = {'a', 'a', 'd', 'b', 'c'};
        char[] respostas = new char[5];
        int nota = 0;

        respostas[0] = 'a';
        respostas[1] = 'a';
        respostas[2] = 'c';
        respostas[3] = 'b';
        respostas[4] = 'c';

        for (int i = 0; i < gabarito.length; i++){
            if(gabarito[i] == respostas[i]){
                nota++;
            }
        }
        System.out.println("nota do aluno " + nota);
    */




