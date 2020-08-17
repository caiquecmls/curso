/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramTryCatch {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        } catch (InputMismatchException e){
            System.out.println("Input error");
        }
        System.out.println("End of program");
    }   
}
