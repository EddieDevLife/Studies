import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int somaTotal = 0;
        int linha3 = 0;
        int coluna2 = 0;
        int diagonal = 0;
        for( int i = 0 ; i < 3 ; i++){
            for ( int j = 0 ; j < 3 ; j++ ){
                System.out.println("digite o numero que estara na linha "+ (i + 1) +  " coluna " + (j + 1));
                matriz[i][j] = sc.nextInt();
                somaTotal += matriz[i][j];

                if (i == 2) {
                    linha3 += matriz[i][j];  
                    
                }
                if (j == 1) {
                    coluna2 += matriz[i][j];
                }
                if (i == j){
                    diagonal += matriz[i][j];
                }
            }
        }

        System.out.println("Soma total dos elementos: " + somaTotal);
        System.out.println("Soma dos elementos da linha 3: " + linha3);
        System.out.println("Soma dos elementos da coluna 2: " + coluna2);
        System.out.println("Soma dos elementos da diagonal: " + diagonal);
    }
    
}
