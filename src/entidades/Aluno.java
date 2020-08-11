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
public class Aluno {

    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public void calcularMedia(double media) {
        if (media > 60) {
            System.out.println("FINAL GRADE = " + String.format("%.2f", media));
            System.out.println("PASS");
        } else {
            System.out.println("FINAL GRADE = " + String.format("%.2f", media));
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", 60 - media) + " POINTS");

        }
    }
}
