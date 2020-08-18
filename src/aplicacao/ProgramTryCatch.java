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
        method1();
        System.out.println("End of program");
    }   
    public static void method1(){
        System.out.println("---METHOD1 START---");
        method2();
        System.out.println("---METHOD1 END---");
    }
    
    public static void method2(){
        System.out.println("---METHOD2 START---");      
        
        try {
            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e){
            System.out.println("Input error");
        }
        System.out.println("---METHOD2 END---");
    }
}
