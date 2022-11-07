import java.util.Scanner;

public class Tabuada {

    public static void Tabuada(){

        Scanner sc = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Digite um número entre 1 e 10: ");
            numero = sc.nextInt();
        }while (numero < 1 || numero > 10);

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }

    }
}
