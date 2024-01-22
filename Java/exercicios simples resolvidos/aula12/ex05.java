import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        // Lê os valores para construir a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprime a matriz original
        System.out.println("Matriz original:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%d ", elemento);
            }
            System.out.println();
        }

        // Verifica a existência de elementos negativos e substitui por 0
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprime a matriz modificada
        System.out.println("Matriz modificada:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%d ", elemento);
            }
            System.out.println();
        }

        scanner.close();
    }
}

