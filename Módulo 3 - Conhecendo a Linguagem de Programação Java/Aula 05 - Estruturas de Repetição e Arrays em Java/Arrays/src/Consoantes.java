import java.util.Scanner;

public class Consoantes {

    public static void Consoantes(){

        Scanner sc = new Scanner(System.in);

        char[] letras = new char[6];

        for (int i = 0; i < 6; i++){
            System.out.println("Digite a " + (i+1) + "ª letra: ");
            letras[i] = sc.next().charAt(0);
        }

        int qtdConsoantes = 0;

        for (char letra : letras){
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u'){
                qtdConsoantes += 1;
                System.out.println(letra);
            }
        }
        System.out.println("Quantidade consoantes: " + qtdConsoantes);
    }
}
