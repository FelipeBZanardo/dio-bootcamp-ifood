import java.util.Scanner;

public class ChamadaRecursiva {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println(somatorio(numero.nextInt()));
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
