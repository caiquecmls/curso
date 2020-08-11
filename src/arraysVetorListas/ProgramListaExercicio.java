/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysVetorListas;

import entidades.Employees;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramListaExercicio {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Employees> list = new ArrayList<>();
        Employees emp = null;
        
        System.out.print("How many employees will be registered: ");
        int qtEmployees = sc.nextInt();

        for (int i = 0; i < qtEmployees; i++) {

            System.out.print("Employees #" + (i + 1) + ":");
            System.out.println("");

            System.out.print("Id: ");
            int id = sc.nextInt();
            
            while(hasId(list, id)){
                System.out.println("Id já existe, digite outro.");
            }

            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salary: ");
            double salario = sc.nextDouble();

            emp = new Employees(id, nome, salario);

            list.add(emp);
            System.out.println("");

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idUpSalary = sc.nextInt();

        Integer pos = position(list, idUpSalary);
        if (pos == null) {
            System.out.print("This id does not exist!");
            System.out.println("");
        } else {
            System.out.print("Enter the percentage: ");
            double porcentagem = sc.nextDouble();
            list.get(pos).aumentoSalario(porcentagem);
            System.out.println("");
        }

        for (Employees result : list) {
            System.out.println(result);
        }

//        list.stream().filter(aux -> aux.getId() == idUpSalary).findFirst().orElse(null);
//        if(emp == null){
//            System.out.print("This id does not exist!");
//        }
    }

    public static Integer position(List<Employees> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    
    public static boolean hasId(List<Employees> list, int id){
        Employees emp = list.stream().filter(elemento -> elemento.getId()==id).findFirst().orElse(null);
        return emp != null;
    }
}
