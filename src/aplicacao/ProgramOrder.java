/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Client;
import entidades.Order;
import entidades.OrderItem;
import entidades.Product;
import entidades.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramOrder {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        
        
        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int qt = sc.nextInt();

        for (int i = 0; i < qt; i++) {
            System.out.println("Enter #" + (i + 1) + " items data: ");
            System.out.print("Product name: ");
            String nameProduct = sc.next();
            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();
            
            Product product = new Product(nameProduct, priceProduct);
            OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);     
            
            order.addItem(orderItem);
        }
        
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
    }
}
