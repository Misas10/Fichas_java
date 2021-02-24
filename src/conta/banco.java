package conta;

import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contaCorrente contaCorrente = new contaCorrente();
        contaPoupanca contaPoupanca = new contaPoupanca();
        double saldo;
        int resp;

        String msg = "Selecione a sua opção\n" +
                "1 - Deposita Dinheiro\n" +
                "2 - Levanta Dinheiro\n" +
                "3 - Verifica Saldo\n";

        do{
            System.out.println("Escolha a conta a Gerir\n" +
                "1 - Conta Corrente\n" +
                "2 - Conta Poupança");
            resp = sc.nextInt();

            System.out.println("Quando quer depositar? ");
            saldo = sc.nextDouble();

             if(resp == 1) {
                 contaCorrente.setSaldo(saldo);

             }else if(resp == 2){
                 contaPoupanca.setSaldo(saldo);

             }


        int resp2 = sc.nextInt();

        }while(resp != 0);
    }
}
