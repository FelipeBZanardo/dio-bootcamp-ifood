import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.

        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }

        if (palavra.equals(palavraInvertida))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
