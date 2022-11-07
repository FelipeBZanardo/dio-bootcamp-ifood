package dio.basecamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do mês: ");
        int mes = sc.nextInt();

        if (mes == 1){
            System.out.println("Janeiro");
            System.out.println("Férias");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        }else if (mes == 3) {
            System.out.println("Março");
        }else if (mes == 4) {
            System.out.println("Abril");
        }else if (mes == 5) {
            System.out.println("Maio");
        }else if (mes == 6) {
            System.out.println("Junho");
        }else if (mes == 7) {
            System.out.println("Julho");
            System.out.println("Férias");
        }else if (mes == 8) {
            System.out.println("Agosto");
        }else if (mes == 9) {
            System.out.println("Setembro");
        }else if (mes == 10) {
            System.out.println("Outubro");
        }else if (mes == 11) {
            System.out.println("Novembro");
        }else if (mes == 12) {
            System.out.println("Dezembro");
            System.out.println("Férias");
        }

        System.out.println("Digite o dia da semana: ");
        String diaSemana = sc.next();

        switch (diaSemana){
            case ("Domingo"):
                System.out.println(1);
                break;
            case ("Segunda"):
                System.out.println(2);
                break;
            case ("Terça"):
                System.out.println(3);
                break;
            case ("Quarta"):
                System.out.println(4);
                break;
            case ("Quinta"):
                System.out.println(5);
                break;
            case ("Sexta"):
                System.out.println(6);
                break;
            case ("Sábado"):
                System.out.println(7);
                break;
            default:
                System.out.println("Dia inexistente");
                break;
        }

        System.out.println("Digite um número: ");
        int variavel = sc.nextInt();

        switch (variavel){
            case (1):
            case (2):
            case (3):
                System.out.println("Certo");
                break;
            case (4):
                System.out.println("Errado");
                break;
            case (5):
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
        }

    }
}
