package br.com.dio.collections.set;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {

        System.out.println("Crie um Set e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0,8.5,9.3,5.0,7.0,0.0,3.6));
        System.out.println(notas);

        //System.out.println("Exibir a posição da nota 5");
        //System.out.println("Adicione na Lista a nota 8.0 na posição 4");
        //System.out.println("Substitua a nota 5.0 pela nota 6.0");
        //não há como com o método HasSet

        System.out.println("Confira se a nota 5.0 está no Set: " + notas.contains(5.0));

        //System.out.println("Exiba a terceira nota adicionada");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média dos valores: " + soma/ notas.size());

        System.out.println("Remova a nota 0.0");
        notas.remove(0.0);
        System.out.println(notas);

        //System.out.println("Remova a nota na posição 0");
        //não é possível. Set não trabalha com índice.

        System.out.println("Remova as notas menores que 7");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next2 = iterator2.next();
            if (next2 < 7) iterator2.remove();
        }
        System.out.println(notas);

        //System.out.println("Exiba as notas na ordem que foram informadas");
        //não é possível com HasSet, pois ela gurada os valores de forma aleatória. Usar LinkedHasSet

        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7.0,8.5,9.3,5.0,7.0,0.0,3.6));
        System.out.println(notas2);

        System.out.println("Apresentar a lista em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(Arrays.asList(7.0,8.5,9.3,5.0,7.0,0.0,3.6));
        System.out.println(notas3);

        System.out.println("Apague todo conjunto");
        notas.clear();
        System.out.println(notas);

        System.out.println("Conferir se o conjunto está vazio: " + notas.isEmpty());
    }
}
