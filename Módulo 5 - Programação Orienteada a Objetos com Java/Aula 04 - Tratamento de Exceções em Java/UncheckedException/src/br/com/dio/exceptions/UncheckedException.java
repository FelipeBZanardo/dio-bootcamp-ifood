package br.com.dio.exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        while(true) {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                break;
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Entrada inválida. Informe um número " + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Erro de lógica matemática. " + e.getMessage());

            } finally {
                System.out.println("Chegou no finally");
            }
        }



        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {return a/b;}
}
