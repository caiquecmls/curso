/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysVetorListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author caiqu
 */
public class ProgramLista_1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Caique");
        list.add(2, "Marco"); //adiciona no indice solicitado
        
        
        
        System.out.println(list.size()); //trás o tamanho da lista

        list.remove(1); //Indice ou elemento

        for (String nome : list) {
            System.out.println(nome);
        }
        list.removeIf(nome -> nome.charAt(0) == 'M'); //Remover multiplos itens
        // Pega o valor nome e retorna se charAt(0) == começa com M

        System.out.println("-----------");
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //quando encontra trás a posição/Indice
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //quando não encontra trás -1

        System.out.println("-----------");
        List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());
        
        //Filtrar todos que começa com a letra A, crio uma nova Lista, transformo em stream().filter (passo a condição/predicato
        //depois transformo novamente em lista com o collect(Collectors.toList());
        
        for (String nome : result) {
            System.out.println(nome);
        }
        System.out.println("-----------");
         String name = list.stream().filter(nome -> nome.charAt(0) == 'A').findFirst().orElse(null);
         // findFirst() vai pegar o primeiro elemento da Stream, se não existir ele retorna nulo
         System.out.println(name);
    }
}
