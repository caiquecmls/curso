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
public class Calculator {

    public static final double PI = 3.14;

    public static double calcularCircuference(double radius) {
        return PI * radius * 2.0;
    }

    public static double calcularVolume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
