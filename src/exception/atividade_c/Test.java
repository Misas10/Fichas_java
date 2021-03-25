package exception.atividade_c;

public class Test {
    public static void explode() throws Bomba{
        throw new Bomba();
    }

    public static void main(String[] args) {
        try{
            explode();

        }catch (RuntimeException e){
            System.out.println("RuntimeExplode " + e.getMessage());

        }catch (Bomba b){
            System.out.println("Bomba");
        }
    }
}
