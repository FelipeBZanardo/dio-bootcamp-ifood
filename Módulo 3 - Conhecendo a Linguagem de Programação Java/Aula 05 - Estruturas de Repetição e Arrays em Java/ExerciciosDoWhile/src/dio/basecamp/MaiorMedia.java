package dio.basecamp;

import java.util.Scanner;

public class MaiorMedia {

    public static void MaiorMedia(){

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int maior = 0;
        int numero;
        double soma = 0;

        do {
            System.out.println("Digite o " + (n+1) + "º número: ");
            numero = sc.nextInt();
            if (n == 0 || numero > maior) {
                maior = numero;
            }
            soma += numero;
            n++;
        }while (n < 5);

        System.out.println("Maior número digitado foi: " + maior);
        System.out.println("Média dos números digitados: " + (soma/5));
    }
}
