import java.util.Scanner;

public class Inversa {

    public static void Inversa(){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int contador = 1;

        for (int i = 4; i >= 0; i--){
            System.out.println("Entre com o " + contador + "º número: ");
            numeros[i] = sc.nextInt();
            contador++;
        }

        for (int i : numeros) {
            System.out.println(i);
        }

    }




}
