package dio.basecamp;

import java.util.Scanner;

public class Nota {

    public static void Nota(){

        Scanner sc = new Scanner(System.in);

        double nota;

        while (true){
            System.out.println("Digite uma nota: ");
            nota = sc.nextDouble();
            if(nota < 0 || nota > 10){
                System.out.println("Nota inválida! \nDigite uma nota entre 0 e 10");
                continue;
            }
            System.out.println("Nota " + nota + " válida");
        }
    }

}
