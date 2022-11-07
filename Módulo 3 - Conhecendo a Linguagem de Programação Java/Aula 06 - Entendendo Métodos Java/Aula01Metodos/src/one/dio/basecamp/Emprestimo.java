package one.dio.basecamp;

public class Emprestimo {

    public static void emprestimo(double valor, int parcelas, float taxa){

        double resultado = valor * (1 + taxa);
        double valorParcela = resultado/parcelas;

        System.out.println("O valor final para um empréstimo de R$" + valor + "é de R$" + resultado);
        System.out.println("O valor de cada parcela é de R$" + valorParcela);
    }
}
