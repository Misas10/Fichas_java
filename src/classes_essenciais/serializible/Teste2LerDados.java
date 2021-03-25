package classes_essenciais.serializible;

import java.io.*;

public class Teste2LerDados {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(new File("s10-pessoas.dat"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Pessoa p = new Pessoa("Ivo", 7476069, 'M',1962,5,6);
            oos.writeObject(p);
            oos.flush();
            oos.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("s10-pessoas.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Pessoa pp;
            pp = (Pessoa) ois.readObject();
            System.out.println(pp.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
