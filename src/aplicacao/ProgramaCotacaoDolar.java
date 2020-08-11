/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Scanner;
import util.CalculatorDollar;

/**
 *
 * @author caiqu
 */
public class ProgramaCotacaoDolar {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the dollar price: ");
        double dolPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dolCompra = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f ", CalculatorDollar.calcularDol(dolPrice, dolCompra));

    }
}
