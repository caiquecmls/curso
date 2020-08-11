/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author caiqu
 */
public class CalculatorDollar {

    public static final double IOF = 0.06;

    public static double calcularDol(double price, double dolPagar) {
        return price * dolPagar * (1 + IOF);
    }

}
