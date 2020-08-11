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
public class Funcionario {

    public String nome;
    public double salario;
    public double taxa;

    public double descSalario() {
        return salario - taxa;
    }

    public void CalculoSalarioPorcentagem(double porcentagem) {

        this.salario += salario / porcentagem;
    }

    public String toString() {
        return nome
                + ", $ " 
                + String.format("%.2f", descSalario());
    }
}
