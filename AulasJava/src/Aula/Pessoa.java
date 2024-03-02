package Aula;

import java.util.ArrayList;

public class Pessoa {

    protected int rg = 0;
    protected int idade = 0;

    // private ArrayList nomeFamiliares;

    public Pessoa(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;
        // nomeFamiliares = new ArreayList<>();

    }

    public Pessoa(int rg) {
        this.rg = rg;
        this.idade = 0;
        // nomeFamiliares = new ArreayList<>();
    }

    public int getRG() {
        return rg;
    }

    public void setRG(int rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

}
