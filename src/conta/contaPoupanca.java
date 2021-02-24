package conta;

public class contaPoupanca implements conta{
    double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void Deposita(double saldo) {

    }

    @Override
    public void Levanta(double saldo) {

    }
}
