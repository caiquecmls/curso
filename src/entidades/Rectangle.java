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
public class Rectangle {

    public double largura;
    public double altura;

    public double calcularArea() {
        return largura * altura;
    }

    public double perimetro() {
        return (largura + altura) * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }

    public String toString() {
        return "Area = "
                + String.format("%.2f", calcularArea()) + "\n"
                + "Perimetro = "
                + String.format("%.2f", perimetro()) + "\n"
                + "Diagonal = "
                + String.format("%.2f", diagonal());
    }
}
