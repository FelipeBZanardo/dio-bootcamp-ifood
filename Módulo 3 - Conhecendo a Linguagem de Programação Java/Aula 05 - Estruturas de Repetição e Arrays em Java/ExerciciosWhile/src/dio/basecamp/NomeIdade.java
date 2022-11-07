package dio.basecamp;

import java.util.Scanner;

public class NomeIdade {

    public static void NomeIdade(){

        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade = 0;

        while (!nome.equals("0")){
            System.out.println("Digite um nome: ");
            nome = sc.next();
            if (!nome.equals("0")){
                System.out.println("Digite a idade: ");
                idade = sc.nextInt();
            }
        }
        System.out.println("Fim do programa!");
    }

}
