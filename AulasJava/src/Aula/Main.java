package Aula;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(2022, 4);
        Pessoa p2 = new Pessoa(2024);
        System.out.println("Pessoa1: " + p1.getRG());
        System.out.println("Pessoa2: " + p1.getIdade());
        System.out.println("Pessoa3: " + p2.getRG());
    }
}
