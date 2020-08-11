/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysVetorListas;

import entidades.Pensionato;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramPensionato {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Pensionato[] vetor = new Pensionato[9];

        System.out.print("How many rooms will be rented? ");
        int qtQuarto = sc.nextInt();

        for (int i = 0; i < qtQuarto; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            System.out.println("");

            vetor[quarto] = new Pensionato(nome, email, quarto);

        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println(vetor[i]);
            }
        }
    }
}
