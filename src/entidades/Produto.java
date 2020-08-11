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
public class Produto {

    private String nome;
    private double price;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, double price, int quantidade) {
        this.nome = nome;
        this.price = price;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double valorTotal() {
        return price * quantidade;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade = this.quantidade - quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantidade
                + " units, Total: $"
                + valorTotal();
    }

}
