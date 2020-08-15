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
public class ImportedProduct extends Products {

    private double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $" + String.format("%.2f", customsFee)+")";
    }

    public double totalPrice() {
        return price + customsFee;
    }

    @Override
    public String toString() {
        return priceTag();
    }
}
