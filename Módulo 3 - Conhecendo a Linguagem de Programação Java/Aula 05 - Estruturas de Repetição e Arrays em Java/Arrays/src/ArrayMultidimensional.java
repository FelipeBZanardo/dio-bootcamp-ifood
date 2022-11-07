import java.util.Scanner;

public class ArrayMultidimensional {

    public static void Matriz(){

        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[4][4];
        int menor = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                do{
                    System.out.println("numeros[" + i + "]["+ j + "] = (entre 0 e 9)");
                    numeros[i][j] = sc.nextInt();
                }while (numeros[i][j] < 0 || numeros[i][j] > 9);

                if ((i == 0 && j == 0) || numeros[i][j] < menor){
                    menor = numeros[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Menor número da matriz: " + menor + " linha: " + linha + " coluna: " + coluna);
    }
}
