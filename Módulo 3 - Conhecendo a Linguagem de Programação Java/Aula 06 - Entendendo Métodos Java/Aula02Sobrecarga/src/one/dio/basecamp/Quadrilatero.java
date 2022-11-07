package one.dio.basecamp;

public class Quadrilatero {

    public static void calculaArea(double lado){
        System.out.println("Área do quadrado = " + (lado*lado) + " u²");
    }
    public static void calculaArea(double ladoMenor, double ladoMaior){
        System.out.println("Área do retângulo = " + (ladoMaior*ladoMenor) + " u²");
    }

    public static void calculaArea(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio = " + ((baseMaior + baseMenor)*(altura/2)) + " u²");
    }

    public static void calculaArea(float diagonalMaior, float diagonalMenor){
        System.out.println("Área do trapézio = " + (diagonalMaior * diagonalMenor/2) + " u²");
    }
}
