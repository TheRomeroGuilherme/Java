public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa(2021);
        Funcionario f1 = new Funcionario(2021, 19, 78987);
        System.out.println("Pessoa 1: O RG e:" + p1.getRG() + " A idade e: " + p1.getIdade());
        Pessoa p2 = new Pessoa(2020);
        Funcionario f2 = new Funcionario(2020, 17, 98779);
        System.out.println("Pessoa 2: O RG e:" + p2.getRG() + " A idade e: " + p2.getIdade());
    }
}