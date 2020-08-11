/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Funcionario;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramaFuncionario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.print("Name: ");
        func.nome = sc.nextLine();

        System.out.print("Sálario bruto: ");
        func.salario = sc.nextDouble();

        System.out.print("Taxa: ");
        func.taxa = sc.nextDouble();
        
        System.out.println("");
        System.out.print("Employee: ");
        System.out.println(func);
        
        System.out.println("");
        System.out.print("Which percentage to increase salary? ");
        double porcentagem = sc.nextDouble();
        func.CalculoSalarioPorcentagem(porcentagem);
        System.out.println("");
        System.out.println(func);
    }

}
