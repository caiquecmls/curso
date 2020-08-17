/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.ImportedProduct;
import entidades.Products;
import entidades.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class ProgramProducts {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        Products product;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Products> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char opcoes = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (opcoes == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            } else if (opcoes == 'c') {
                product = new Products(name, price);
                list.add(product);
            } else if (opcoes == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                product = new UsedProduct(name, price, manufactureDate);
                list.add(product);
            }
        }
        System.out.println("");
        System.out.println("PRICE TAGS: ");
        for (Products c : list) {
            System.out.println(c.priceTag());
        }

    }
}
