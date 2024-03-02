public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa(1, 2);
        System.out.println("Pessoa 1: O RG e:" + p1.getRG() + " A idade e: " + p1.getIdade());
        Pessoa p2 = new Pessoa(2);
        System.out.println("Pessoa 2: O RG e:" + p2.getRG() + " A idade e: " + p2.getIdade());
    }
}