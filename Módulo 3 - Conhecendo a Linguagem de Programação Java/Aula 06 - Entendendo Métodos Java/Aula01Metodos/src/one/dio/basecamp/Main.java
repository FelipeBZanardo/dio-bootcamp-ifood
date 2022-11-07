package one.dio.basecamp;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculadora(2,3): ");
        System.out.println("soma: ");
        Calculadora.soma(2,3);
        System.out.println("subtração: ");
        Calculadora.subtracao(2,3);
        System.out.println("multiplicação: ");
        Calculadora.multiplicacao(2,3);
        System.out.println("divisão: ");
        Calculadora.divisao(2,3);

        System.out.println("Mensagem: ");
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(1);

        System.out.println("Emprétimo: ");
        Emprestimo.emprestimo(1000,3,0.5f);
        Emprestimo.emprestimo(1000,2,0.3f);
    }
}
