/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author caiqu
 */


//final na classe impede que ela tenha herança 
//public final class SavingAccount extends Account        
public  class SavingAccount extends Account {

    private Double interestRate;

    public SavingAccount() {
    }

    public SavingAccount(Integer number, String holder, double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    //public final void withdraw(double amount) com final o metodo não pode ser sobreposto 
    public final void withdraw(double amount) {
        balance -= amount;
    }

}
