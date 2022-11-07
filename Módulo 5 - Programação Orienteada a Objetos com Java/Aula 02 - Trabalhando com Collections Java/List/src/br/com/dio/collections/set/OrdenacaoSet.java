package br.com.dio.collections.set;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("Exibir em ordem aleatória: ");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("Dark","drama", 60));
            add(new Serie("That 70s show", "comédia", 25));
        }};
        System.out.println(series);
        for (Serie serie: series){
            System.out.print("nome: " + serie.getNome());
            System.out.print(" - gênero: " + serie.getGenero());
            System.out.print(" - Tempo do episódio(min): " + serie.getTempoEpisodio());
            System.out.println();
        }

        System.out.println("Exibir em ordem de inserção: ");
        Set<Serie> series1 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("That 70s show","comédia",25));
        }};
        for (Serie serie: series1){
            System.out.print("nome: " + serie.getNome());
            System.out.print(" - gênero: " + serie.getGenero());
            System.out.print(" - Tempo do episódio(min): " + serie.getTempoEpisodio());
            System.out.println();
        }

        System.out.println("Exibir em ordem natural tempoEpisodio: ");
        Set<Serie> series2 = new TreeSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("That 70s show","comédia",25));
        }};
        for (Serie serie: series2){
            System.out.print("nome: " + serie.getNome());
            System.out.print(" - gênero: " + serie.getGenero());
            System.out.print(" - Tempo do episódio(min): " + serie.getTempoEpisodio());
            System.out.println();
        }

        System.out.println("Exibir em ordem Nome/Gênero/TempoEpisodio: ");
        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        series3.addAll(series);
        for (Serie serie: series3){
            System.out.print("nome: " + serie.getNome());
            System.out.print(" - gênero: " + serie.getGenero());
            System.out.print(" - Tempo do episódio(min): " + serie.getTempoEpisodio());
            System.out.println();
        }


    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    private Integer tempoEpisodio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        int genero = this.getGenero().compareTo(serie.getGenero());

        if(tempoEpisodio != 0) return tempoEpisodio;
        return genero;
    }
}

class ComparatorNomeGeneroTempo implements Comparator<Serie>{


    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareToIgnoreCase(serie2.getNome());
        if (nome != 0) return nome;
        int genero = serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
        if (genero != 0) return genero;
        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
    }
}
