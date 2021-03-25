package ficheiros;

import java.io.*;
import java.util.StringTokenizer;

public class atividade5 {
    public static void main(String[] args) {
        int num;
        String nome;
        double nota;

        try{
            File f1 = new File("Lista de alunos.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f1));

            String linha = bufferedReader.readLine();
            System.out.println(" Lista de alunos ");

            while(linha != null){
                StringTokenizer st = new StringTokenizer(linha);

                num = Integer.parseInt(st.nextToken());
                nome = st.nextToken();
                nota = Float.parseFloat(st.nextToken());

                System.out.println("Nº Aluno: " + num);
                System.out.println("Nome: " + nome);
                System.out.println("Nota: " + nota);

                System.out.println("--------------");

                linha = bufferedReader.readLine();
            }
            bufferedReader.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
