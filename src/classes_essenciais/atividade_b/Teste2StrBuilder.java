package classes_essenciais.atividade_b;

public class Teste2StrBuilder {
    public static void main(String[] args) {
        String test = "";
        System.gc();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            test += "abc";
        }
        System.out.println("Intervalo de tempo usando  '+=': " +
                (System.currentTimeMillis() - start) + " milisegundos");

        System.gc();
        start = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder(" ");
        for(int i = 0; i < 50000; i++){
            builder.append("abc");
        }
        System.out.println("intervalo de tempo usando StringBuilder: " +
                (System.currentTimeMillis() - start) + " milissegundos");
    }
}
