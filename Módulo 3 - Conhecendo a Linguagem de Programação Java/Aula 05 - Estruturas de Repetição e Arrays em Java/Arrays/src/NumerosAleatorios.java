import java.util.Scanner;

public class NumerosAleatorios {

    public static void NumerosAleatorios(){

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];

        for (int i = 0; i < 20; i++){
            do{
                System.out.println("Digite o " + (i+1) + "º número(de 1 a 100): ");
                numeros[i] = sc.nextInt();
            }while(numeros[i] < 1 || numeros[i] > 100);
        }

        for (int num: numeros){
            System.out.println(num + " => " + (num+1));
        }
    }
}
