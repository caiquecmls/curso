/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysVetorListas;

import entidades.ProdutoVetor;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramVetor_2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        ProdutoVetor[] vetor = new ProdutoVetor[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new ProdutoVetor(nome, price);
        }
        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i].getValor();
        }
        System.out.printf("Everage Price = %.2f", soma / vetor.length);
    }
}
