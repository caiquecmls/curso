/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Scanner;
import entidades.Produto;

/**
 *
 * @author caiqu
 */
public class ProgramaProduto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");

        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
//        System.out.print("Quantidade em estoque: ");
//        int quantidade = sc.nextInt();

        Produto prod = new Produto(nome, price);
        System.out.println("Upadated data: " + prod);
        prod.setNome("test");
        System.out.println("Updated: " + prod.getNome());

        System.out.println("Product data: " + prod);
        System.out.print("Enter the number of products to be added in stock: ");
        int quantidade = sc.nextInt();
        prod.adicionarProduto(quantidade);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantidade = sc.nextInt();

        prod.removerProduto(quantidade);

        System.out.println("Updated data: " + prod);

//        System.out.printf("Product data: %s, $%.2f %d unidades, Total: $ %.2f \n", prod.nome, prod.price, prod.quantidade, prod.valorTotal());
//
//        System.out.print("Digite a quantidade de número que deseja adicionar ao estoque: ");
//        int quantidade = sc.nextInt();
//        prod.adicionarProduto(quantidade);
//
//        System.out.printf("Update data: %s, $ %.2f %d unidades, Total: $ %.2f \n", prod.nome, prod.price, prod.quantidade, prod.valorTotal());
//
//        System.out.print("Digite a quantidade que deseja remover estoque: ");
//        quantidade = sc.nextInt();
//        prod.removerProduto(quantidade);
//
//        System.out.printf("Update data: %s, $ %.2f %d unidades, Total: $ %.2f \n", prod.nome, prod.price, prod.quantidade, prod.valorTotal());
    }
}
