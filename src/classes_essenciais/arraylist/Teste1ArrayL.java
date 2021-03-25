package classes_essenciais.arraylist;

import java.util.ArrayList;

public class Teste1ArrayL {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<String>();
        listaNomes.add("Misael");
        listaNomes.add("Diogo");
        listaNomes.add("António");

        System.out.println("A lista tem " + listaNomes.size() + " elesments");

        System.out.println("\n ------ Conteúdo da lista de Nomes -----");

        System.out.println(" \n" + listaNomes.toString());
        System.out.println();
        for (String listaNome : listaNomes) {
            System.out.println(listaNome);
        }
        System.out.println();

        for (String s:listaNomes){
            System.out.println(s);
        }
        listaNomes.remove(1);
        System.out.println("\n -- Após a remoção: " + listaNomes.toString());

        for (String s: listaNomes){
            System.out.println(s);
        }
        System.out.println();

        String s = "Misael";
        if(listaNomes.contains(s))
            System.out.println(s + " Existe na lista!!!");
        else
            System.out.println(s + "Não existe na lista!!!");

    }
}
