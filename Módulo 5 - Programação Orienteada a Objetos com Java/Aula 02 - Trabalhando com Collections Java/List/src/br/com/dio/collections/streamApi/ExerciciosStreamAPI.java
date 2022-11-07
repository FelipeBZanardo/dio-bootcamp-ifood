package br.com.dio.collections.streamApi;

import java.util.Arrays;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elementos dessa lista: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme esta lista de string em númros inteiros");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Pegue os números pares e maiores que 2 e coloque numa lista");
        List<Integer> collectList2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i > 2 && i % 2 == 0))
                .collect(Collectors.toList());
        System.out.println(collectList2);

        System.out.println("Mostre a média dos números");
        double v = numerosAleatorios.stream()
                .mapToDouble(Double::parseDouble)
                .average()
                .orElse(0.0);
        System.out.println(v);

        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(i -> i % 2 == 1);
        System.out.println(numerosAleatoriosInteger);



    }
}
