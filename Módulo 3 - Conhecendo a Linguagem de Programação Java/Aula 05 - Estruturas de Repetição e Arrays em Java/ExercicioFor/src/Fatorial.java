import java.util.Scanner;

public class Fatorial {

    public static void Fatorial(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int fatorial = 1;
        String resposta = "";

        for (int i = numero; i >= 1; i--){
            fatorial *= i;
            resposta += i;
            if (i != 1) resposta += ".";
        }

        System.out.println(numero + "! = " + resposta + " = " + fatorial);
    }
}
