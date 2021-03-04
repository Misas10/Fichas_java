package ficheiros;

import java.io.File;
import java.io.IOException;

public class atividade4 {

        public static void main(String[] args) {
            File pasta= new File("Pasta");
            pasta.mkdir();

            File ficheiro= new File("Pasta/ficheiro.txt");

            try{
                ficheiro.createNewFile();
            }

            catch(IOException e){
                System.out.println("Ficheiro não criado");
            }
        }
}
