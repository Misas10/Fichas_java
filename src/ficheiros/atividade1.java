package ficheiros;

import java.io.*;

public class atividade1 {
    public static void main(String[] args) throws FileNotFoundException {

        File pasta1 = new File("src/Pasta1");

        pasta1.mkdir();

        File pasta2 = new File("src/Pasta2");

        pasta1.renameTo(pasta2);


    }
}
