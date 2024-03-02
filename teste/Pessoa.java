public class Pessoa {
    protected int rg = 0;
    protected int idade = 0;

    // private ArrayList nomeFamiliares;

    public Pessoa(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;
        // nomeFamiliares = new ArrayList<>();
    }

    public Pessoa(int rg) {
        this.rg = rg;
        this.idade = 0;
        // nomeFamiliares = new ArrayList<>();
    }

    public int getIdade() {
        return this.idade;
    }

    public int getRG() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

}