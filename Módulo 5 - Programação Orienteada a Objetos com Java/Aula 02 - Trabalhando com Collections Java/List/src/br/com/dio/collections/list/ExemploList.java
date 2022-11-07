package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {

    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Crie uma lista e adicone as sete notas");
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.8);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exibir a posição da nota 5.8: " + notas.indexOf(5.8));

        System.out.println("Adicionar o elemento 8.0 na posição 4");
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("Substituir a nota 5.8 por 6.0");
        notas.set(notas.indexOf(5.8), 6.0);
        System.out.println(notas);

        System.out.println("Verificar se há a nota 5.0 na lista: " + notas.contains(5.0));

        System.out.println("Exibir as notas em ordem que foram adicionadas");
        for(Double nota : notas) System.out.println(nota);

        System.out.println("Exibir a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exibir a menor nota: " + Collections.min(notas));

        System.out.println("Exibir a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator  = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exibir a média das nots: " + (soma/notas.size()));

        System.out.println("Remover a nota 5.8");
        notas.remove(8.0);
        System.out.println(notas);

        System.out.println("Remover a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remover as notas menores que 7");
        Iterator<Double> iterator2  = notas.iterator();
        while(iterator2.hasNext()){
            Double next2 = iterator2.next();
            if(next2 < 7) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);


    }
}
