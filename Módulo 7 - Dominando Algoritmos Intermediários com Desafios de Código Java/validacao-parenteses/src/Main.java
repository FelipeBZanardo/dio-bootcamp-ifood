import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.

        boolean resposta = false;

        if (s.isEmpty())
            resposta = true;
        else {
            switch (s.charAt(0)){
                case '(':
                    if (s.charAt(1) == ')')
                        resposta = true;
                    break;
                case '[':
                    if (s.charAt(1) == ']')
                        resposta = true;
                    break;
                case '{':
                    if (s.charAt(1) == '}')
                        resposta = true;
                    break;
            }
        }
        return resposta;
    }
}