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
public class Employee {

    private String nome;
    protected Integer hours;
    protected Double valuePerHour;

    public Employee() {
    }

    public Employee(String nome, Integer hours, Double valuePerHour) {
        this.nome = nome;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return hours * valuePerHour;
    }

    public String toString() {
        return nome + " - $" + String.format("%.2f", payment());
    }
}
