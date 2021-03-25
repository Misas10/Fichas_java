package stream;

import java.io.*;

public class Teste1LerText {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream(new File("s10-pessoas.txt"));
            PrintWriter pw = new PrintWriter(fos);
            pw.println("Diogo Valério");
            pw.println("Stefan Freire");
            pw.println("Rúben Almeida");
            pw.println("Rodrigo Tavares");
            pw.println("Joel Rodrigues");

            pw.flush();
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            FileReader fis = new FileReader("s10-pessoas.txt");
            BufferedReader br = new BufferedReader(fis);
            String s = br.readLine();
            String r = "";
            while ( s!= null){
                r += "\n" + s;
                s = br.readLine();
            }
            System.out.println("Conteúdo: " + r);
            br.close();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
