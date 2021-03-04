package atividade3;

import java.io.*;
import java.util.Scanner;

public class empresa {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        empregado emp1 = new empregado();

        System.out.println("Como se chama? :");
          String nome = sc.nextLine();
          emp1.setNome(nome);

        System.out.println("Quando é o seu salário? :");
        double salario = sc.nextDouble();
        emp1.setSalario(salario);

        File f1 = new File("salario.txt");

        if(!f1.exists()){
            f1.createNewFile();

        }else {

            // Escrever ficheiro
            FileWriter fw = new FileWriter(f1, true);
            BufferedWriter bw = new BufferedWriter(fw);

            try{
                bw.write(emp1.toString());
                bw.newLine();
                bw.newLine();
                bw.close();
                System.out.println("Dados inseridos com sucesso");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
