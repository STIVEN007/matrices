
package javaapplication2;

   import java.util.Scanner;

public class MATRICES {

   
    public static void main(String[] args) {
        //entrada de matricez 
         Scanner sc = new Scanner(System.in);
         int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matrizSuma = new int[3][3];
        //CICLOS FOR ANIDADOS
         System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        // Suma de matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Imprimir las tres matrices
        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);

        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);

        System.out.println("Matriz suma:");
        imprimirMatriz(matrizSuma);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
    

