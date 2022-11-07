package br.com.dio.exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {
    public static void main(String[] args) {

        String nomeDoArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo: ");
        imprimirArquivoNoConsole(nomeDoArquivo);

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo)  {

        try{
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaArquivoException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }



    public static BufferedReader lerArquivo(String nomeArquivo) throws ImpossivelAberturaArquivoException{
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        }catch (FileNotFoundException e){
            throw new ImpossivelAberturaArquivoException(file.getName(), file.getPath());
        }
    }

}

class ImpossivelAberturaArquivoException extends Exception{
    private String  nomeArquivo;
    private String diretorio;

    /*@Override
    public String toString() {
        return "ImpossivelAberturaArquivoException{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }*/

    public ImpossivelAberturaArquivoException(String nomeArquivo, String diretorio) {
        super("O arquivo "+ nomeArquivo + " não foi enncontrado no diretório");
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }
}
