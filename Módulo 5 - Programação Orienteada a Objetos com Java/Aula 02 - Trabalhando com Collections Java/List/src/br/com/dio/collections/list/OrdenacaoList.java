package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoList {
    public static void main(String[] args) {

        ArrayList<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jhon", 18,"preto"));
            add(new Gato("Simba", 6,"tigrado"));
            add(new Gato("Jhon", 12,"amarelo"));
        }};

        System.out.println("Exibir em ordem de inserção");
        System.out.println(gatos);

        System.out.println("Exibir em ordem de aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Exibir em ordem natural(ordem alfabética do nome)");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Ordem idade: ");
        Collections.sort(gatos, new ComparatorIdade());
        //gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Ordem cor: ");
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Ordem cor/idade/nome");
        Collections.sort(gatos, new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato gato1, Gato gato2) {

        System.out.println(Integer.compare(gato1.getIdade(), gato2.getIdade()));

        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0) return cor;

        return  Integer.compare(gato1.getIdade(), gato2.getIdade());

    }
}