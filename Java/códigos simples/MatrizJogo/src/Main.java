import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int mario [][] = new int[628][74];
        int point[] = new int[64];

        int i, j;

        for (i = 0; i < 678; i++) {
            System.out.println();
            for (j = 0; j < 64; j++;){
                System.out.println("pontos do jagador %d no nivel:  ", i + 1, j + 1);
                mario[i][j] = ler.nextInt();
                point[j] = 0;
            }
        for (i = 0; i < 678; i ++)
            for (j = 0; j <64; i++)
                point[j] = point[J] + mario[i][j];

        };
        for (j =0; j < 64; j++)

        System.out.println("total de pontos dos jogadores do nivel %d é de %d ",j + 1, point[j]);
    }
}