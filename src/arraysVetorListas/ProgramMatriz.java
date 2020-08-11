/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysVetorListas;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramMatriz {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");

        }
        System.out.println("");
        System.out.print(matriz[0][0] + " " + matriz[1][0] + " " + matriz[2][0]);

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][0] + " ");

        }

        System.out.println("");

        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println("Negative numbers = " + cont);
    }
}
