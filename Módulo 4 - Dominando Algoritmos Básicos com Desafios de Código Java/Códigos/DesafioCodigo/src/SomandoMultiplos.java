import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int N = scanner.nextInt();

        int soma = 0;
        for (int i = A; i <= N; i += A){
            soma += i;
        }
        System.out.println(soma);
    }
}
