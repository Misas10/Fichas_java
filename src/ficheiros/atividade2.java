package ficheiros;
import java.io.*;

public class atividade2 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("msg.txt");

        System.out.println("olá não é `àlgo");

        FileReader fileReader = new FileReader(f1);
        BufferedReader br = new BufferedReader(fileReader);

        while(br.ready()){
            String linha = br.readLine();
            System.out.println(linha);
        }
        System.out.println();

        fileReader.close();
        br.close();

    }
}
