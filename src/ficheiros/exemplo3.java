package ficheiros;

import java.io.File;
import java.io.IOException;

public class exemplo3 {
    public static void main(String[] args) {

        File f1 = new File("exemplo.txt");

        try{
            f1.createNewFile();

        }catch (IOException e){
            System.out.println("O ficheiro não foi criado");
            e.printStackTrace();
        }
    }
}
