/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Rectangle;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramaRectangle {

    public static void main(String[] args) {
        Rectangle retangulo = new Rectangle();  //membro static sempre com classe static
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();
        
        System.out.println(retangulo);

    }

}
