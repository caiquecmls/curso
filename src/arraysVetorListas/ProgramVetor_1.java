/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysVetorListas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramVetor_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double soma = 0;
        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
            
            soma += vetor[i];
           
        }
        System.out.printf("Average Height: %.2f",soma/n);
    }
}
