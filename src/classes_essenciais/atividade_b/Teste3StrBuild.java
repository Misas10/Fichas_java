package classes_essenciais.atividade_b;

import java.util.Scanner;

public class Teste3StrBuild {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder nome = new StringBuilder();

        System.out.println("Digite o seu primeiro nome: ");
        nome.append(scanner.nextLine());

        nome.append(" ");

        System.out.println("Digite o seu apelido nome: ");
        nome.append(scanner.nextLine());

        int tamanho = nome.length();
        System.out.println("Olá " +  nome.substring(0, tamanho) + "! Tem um apelido interessante: "
                + nome.substring(tamanho));

    }
}
