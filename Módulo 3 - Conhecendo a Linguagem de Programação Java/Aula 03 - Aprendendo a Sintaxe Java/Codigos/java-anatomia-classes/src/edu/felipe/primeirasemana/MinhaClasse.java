package edu.felipe.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String nome = "Felipe";
        String sobrenome = "Bueno";

        System.out.println(nomeCompleto(nome, sobrenome));
    }

    public static String nomeCompleto (String nome, String sobrenome){
        return nome + " " + sobrenome;
    }
}
