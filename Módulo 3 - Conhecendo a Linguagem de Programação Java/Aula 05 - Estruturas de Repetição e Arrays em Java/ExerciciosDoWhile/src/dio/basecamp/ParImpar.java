package dio.basecamp;

import java.util.Scanner;

public class ParImpar {
    public static void ParImpar(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int n = scan.nextInt();

        int i = 0;
        int qtdPares = 0;
        int qtdImpares = 0;

        do{
            System.out.println("Digite o " + (i+1) + "º número: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0){
                qtdPares++;
            }else {
                qtdImpares++;
            }
            i++;

        }while (i < n);

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);
    }
}
