/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Banco;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramaBanco {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Banco banco;
        
        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        
        System.out.print("Is there na initial deposit (y/n)? ");
        char opcao = sc.next().charAt(0);

        if (opcao == 'y') {
            System.out.print("Enter initial deposit value: ");
            double valor = sc.nextDouble();
            banco = new Banco(numeroConta, nomeTitular, valor);
            
        }else {
            banco = new Banco(numeroConta, nomeTitular);
        }
        
        System.out.println("Account data:");
        System.out.println(banco);
        System.out.println("");
        
        System.out.print("Enter a deposit value: ");
        double valor =sc.nextDouble();
        banco.deposito(valor);
        System.out.println("Update account data:");
        System.out.println(banco);
        System.out.println("");
        
        System.out.print("Enter a withdraw value: ");
        valor=sc.nextDouble();
        banco.saque(valor);
        System.out.println(banco);

    }
}
