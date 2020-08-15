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
public class OutsorcedEmployee extends Employee {

    private double additionalCharge;

    public OutsorcedEmployee() {
    }

    public OutsorcedEmployee(String nome, Integer hours, Double valuePerHour, double additionalCharge) {
        super(nome, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + (additionalCharge * (1 + 0.10));
    }

}
