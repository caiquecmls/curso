/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Aluno;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramaAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.n1 = sc.nextDouble();
        aluno.n2 = sc.nextDouble();
        aluno.n3 = sc.nextDouble();

        double media = 0;
        media += aluno.n1 + aluno.n2 + aluno.n3;
        
        aluno.calcularMedia(media);
        
    }
}
