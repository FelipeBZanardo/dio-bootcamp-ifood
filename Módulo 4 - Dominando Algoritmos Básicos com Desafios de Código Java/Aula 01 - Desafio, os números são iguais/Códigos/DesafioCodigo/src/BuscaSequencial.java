import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int valorBuscado = scanner.nextInt();

        System.out.println(buscaSequencial(valorBuscado, elementos));

    }

    public static String buscaSequencial (int valorBuscado, int[] elementos) {

        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == valorBuscado){
                return "Achei " + elementos[i] + " na posição " + i;
            }
        }

        return "Numero " + valorBuscado + " nao encontrado!";

    }
}
