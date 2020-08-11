/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Scanner;
import util.Calculator;

/**
 *
 * @author caiqu
 */
public class ProgramaRadius {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = Calculator.calcularCircuference(radius);
        System.out.printf("Circumference: %.2f \n", c);
        double v = Calculator.calcularVolume(radius);
        System.out.printf("Volume: %.2f \n", v);
        System.out.printf("PI value: %.2f \n", Calculator.PI);
    }

}
