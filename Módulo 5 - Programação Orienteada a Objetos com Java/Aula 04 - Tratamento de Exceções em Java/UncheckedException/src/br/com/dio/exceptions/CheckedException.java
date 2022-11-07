package br.com.dio.exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try {
            String nomeDoArquivo = "romance-blake-crouch.txt";
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo " + e.getMessage());
        } catch (IOException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado");
        }
        finally {
            System.out.println("Chegou até o finally");
        }

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}


