package atividade_a;

public class DivZero {
    public static void main(String[] args) {
        int a = 1, b = 0;

        try{
            System.out.println(a/b);

        }catch (Exception e){
            e.printStackTrace();

        }
        finally {
            System.out.println("Fim do programa");
        }
    }
}
