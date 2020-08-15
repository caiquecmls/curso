/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Employee;
import entidades.OutsorcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramEmployee {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Employee> list = new ArrayList();
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee emp;
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsorced (y/n)? ");
            char opcao = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (opcao == 'y') {
                System.out.println("Additional per hour: ");
                double additionalHour = sc.nextDouble();

                emp = new OutsorcedEmployee(name, hours, valuePerHour, additionalHour);

                list.add(emp);
            } else {
                emp = new Employee(name, hours, valuePerHour);
                list.add(emp);

            }

        }
        System.out.println("");
        System.out.println("PAYMENTS: ");

        for (Employee c : list) {
            System.out.println(c);
        }
    }
}
