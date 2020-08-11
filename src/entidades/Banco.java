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
public class Banco {

    private int numeroConta;
    private String nomeTitular;
    private double dinheiroConta;

    public Banco(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Banco(int numeroConta, String nomeTitular, double initialDeposit) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(initialDeposit);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getDinheiroConta() {
        return dinheiroConta;
    }

    public void deposito(double valor) {
        this.dinheiroConta += valor;
    }

    public void saque(double valor) {
        this.dinheiroConta = (this.dinheiroConta - valor) - 5;
    }

    public String toString() {
        return "Account "
                + +numeroConta
                + ", Holder: "
                + nomeTitular
                + ", Balance: $"
                + dinheiroConta;
    }
}
