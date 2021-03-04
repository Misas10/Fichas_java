package atividade3;

import java.text.NumberFormat;

public class empregado {
    private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double setSalarioliquido(){
        return (this.salario + (this.salario * 0.05) - (this.salario * 0.07));
    }

    @Override
    public String toString() {
        NumberFormat formato = NumberFormat.getCurrencyInstance();
        return "empregado{" +
                "\n\tnome = '" + nome + '\'' +
                "\n\tsalário bruto = " + formato.format(salario) +
                "\n\tsalário líquido = " + formato.format(setSalarioliquido()) + "\n" +
                '}';
    }
}
