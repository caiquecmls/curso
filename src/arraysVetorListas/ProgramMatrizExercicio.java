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
public class ProgramMatrizExercicio {

    public static int retInteiro() {
        int n = sc.nextInt();
        return n;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        int m = retInteiro();
        System.out.print("Digite outro número inteiro: ");
        int n = retInteiro();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
//        System.out.println("aqui");
//        for (int i = 0; i < matriz.length -1; i++) {
//            for (int j = 0; j < matriz[i].length - 1; j++) {
//                System.out.println(matriz[i][j]);
//            }
//        }

        System.out.print("Digite um número que deseja buscar na matriz: ");
        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) { //linha
            for (int j = 0; j < matriz[i].length; j++) { //coluna
                if (x == matriz[i][j]) {
                    System.out.println("posição i: " + i + (", j: ") + j);
                    if (j > 0) {
                        System.out.println("left: " + matriz[i][j - 1]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                    if (i > 0) {
                        System.out.println("up: " + matriz[i - 1][j]);
                    }
                }
            }
        }
    }
}
