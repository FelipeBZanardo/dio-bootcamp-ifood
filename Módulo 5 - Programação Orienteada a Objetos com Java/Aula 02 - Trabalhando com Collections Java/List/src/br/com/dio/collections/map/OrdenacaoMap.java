package br.com.dio.collections.map;

import java.util.*;
import java.util.function.Function;

public class OrdenacaoMap {
    public static void main(String[] args) {
        /*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
        crie um dicionário e ordene este dicionário:
        exibindo (Nome Autor - Nome Livro);
        Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
        Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
        Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meuslivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21",432));
        }};

        for(Map.Entry<String, Livro> livro : meuslivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meuslivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21",432));
        }};
        for(Map.Entry<String, Livro> livro1 : meuslivros1.entrySet()){
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meuslivros2 = new TreeMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21",432));
        }};
        for(Map.Entry<String, Livro> livro2 : meuslivros2.entrySet()){
            System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        //através de classe anônima:
        /*Set<Map.Entry<String, Livro>> meuslivros3 = new TreeSet<>(new Comparator<Map.Entry<String, Livro>>() {
            @Override
            public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
                return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
            }
        });*/
        //utilizando o reference method
        /*Set<Map.Entry<String, Livro>> meuslivros4 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<String, Livro>, String>() {
                    @Override
                    public String apply(Map.Entry<String, Livro> livro) {
                        return livro.getValue().getNome();
                    }
                }));*/
        Set<Map.Entry<String, Livro>> meuslivros5 = new TreeSet<>(Comparator.comparing(
                livro -> livro.getValue().getNome()));
        meuslivros5.addAll(meuslivros.entrySet());
        System.out.println(meuslivros5);

        //System.out.println("--\tOrdem número de página\t--");
    }
}

class Livro {
    String nome;
    Integer numeroPaginas;

    public Livro(String nome, Integer numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && numeroPaginas.equals(livro.numeroPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroPaginas);
    }
}

/*class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}*/

/*class ComparatorNome implements Comparator<Map<String,Livro>>{
    @Override
    public int compare(Map<String, Livro> livro1, Map<String, Livro> livro2) {
        for (Map.Entry<String, Livro> l1 : livro1.entrySet()) {
            for (Map.Entry<String, Livro> l2 : livro2.entrySet()) {
                return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
            }

        }
    }
}*/


