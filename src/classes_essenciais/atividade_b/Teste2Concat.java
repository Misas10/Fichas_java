package classes_essenciais.atividade_b;

import java.util.Scanner;

public class Teste2Concat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu primeiro nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu apelido nome: ");
        String apelido = scanner.nextLine();

        String nomeCompleto = nome + "" + apelido;

        System.out.println("Olá " +  nomeCompleto + "! Tem um apelido interessante: " + apelido);
    }
}
