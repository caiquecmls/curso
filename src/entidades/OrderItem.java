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
public class OrderItem {

    private Integer quantidade;
    private double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantidade, double price) {
        this.quantidade = quantidade;
        this.price = price;

    }

    public OrderItem(Integer quantidade, double price, Product product) {
        this.quantidade = quantidade;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrice() {
        return price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double subTotal() {
        return quantidade * price;

    }

    public String toString() {
        return product.getName() + ", $" + String.format("%.2f", price) + " Quantity: " + quantidade + " Subtotal: $" + subTotal()+"\n";
    }
}
