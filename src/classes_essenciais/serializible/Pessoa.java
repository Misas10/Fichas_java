package classes_essenciais.serializible;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private static int nPessoas = 0;
    private String nome;
    private char genero;
    private int nCC;
    private int anoNasc;
    private int mesNasc;
    private int diaNasc;

    public Pessoa(){
        this(new String(), 0, 'o', 0,0,0);
    }

    public Pessoa(String nome, int nCC){
        this(nome, nCC, 'O', 0,0,0);
    }

    public Pessoa(String nome, int nCC, char genero, int anoNasc,
                  int mesNasc, int diaNasc){
        this.nome = nome;
        this.nCC = nCC;
        this.genero = genero;
        this.anoNasc = anoNasc;
        this.mesNasc = mesNasc;
        this.diaNasc = diaNasc;
    }

    public String getNome() {
        return nome;
    }

    public char getGenero() {
        return genero;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public int getDiasNasc() {
        return diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public int getnCC() {
        return nCC;
    }

    public static int getnPessoas() {
        return nPessoas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void setDiasNasc(int diasNasc) {
        this.diaNasc = diasNasc;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public void setnCC(int nCC) {
        this.nCC = nCC;
    }

    public static void setnPessoas(int nPessoas) {
        Pessoa.nPessoas = nPessoas;
    }

    @Override
    public String toString() {
        return "Pessoa[" +
                "nome='" + nome + '\'' +
                ", genero=" + genero +
                ", nCC=" + nCC +
                ", anoNasc=" + anoNasc +
                ", mesNasc=" + mesNasc +
                ", diasNasc=" + diaNasc +
                ']';
    }

    @Override
    public Object clone(){
        Pessoa p = new Pessoa(this.nome, this.nCC, this.genero, this.anoNasc, this.mesNasc, this.diaNasc);
        return p;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof Pessoa){
            return (this.nome == ((Pessoa)obj).nome &&
                    this.nCC== ((Pessoa)obj).nCC &&
                    this.genero== ((Pessoa)obj).genero &&
                    this.anoNasc== ((Pessoa)obj).anoNasc &&
                    this.mesNasc== ((Pessoa)obj).mesNasc &&
                    this.diaNasc== ((Pessoa)obj).diaNasc);
            }
            return false;
        }
    }


