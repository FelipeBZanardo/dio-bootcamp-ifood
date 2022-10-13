public class Main {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;

        System.out.println(numero);

        final int ANO_NASCIMENTO = 1994;
        ANO_NASCIMENTO = 1999;      //não é possível alterar constantes
    }
}