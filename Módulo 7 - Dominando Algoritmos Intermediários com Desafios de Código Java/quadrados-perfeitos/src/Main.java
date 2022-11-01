import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n + 1];

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.

        int qtd = (int) Math.sqrt(n);

        int[] quadrados = new int[qtd];
        int[] quantidades = new int[qtd];
        int[] somas = new int[qtd];

        for (int i = 0; i < qtd; i++){
            quadrados[i] = (i + 1) * (i + 1);
        }


        for (int i = 0; i < qtd; i++){
            int n2 = n;
            for (int j = qtd - 1 - i; j >= 0; j--){
                quantidades[j] = n2 / quadrados[j];
                n2 -= quantidades[j] * quadrados[j];
            }
            int soma = 0;
            for (int quantidade : quantidades)
                soma += quantidade;

            somas[i] = soma;
            quantidades[qtd - 1 - i] = 0;
        }

        Arrays.sort(somas);
        System.out.println(somas[0]);


    }
}