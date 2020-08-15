/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Account;
import entidades.BusinessAccount;
import entidades.SavingAccount;

/**
 *
 * @author caiqu
 */
public class ProgramAccount {

    public static void main(String[] args) {
        Account acc = new Account(4001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
        acc1.getBalance();

        // DOWNCASTING 
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
        
        Account acc6 = new Account(1001, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());
        
        Account acc7 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());
        
    }

}
