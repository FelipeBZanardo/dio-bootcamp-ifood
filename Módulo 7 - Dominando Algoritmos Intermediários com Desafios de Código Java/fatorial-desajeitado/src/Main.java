import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;

        if (n == 0 || n == -1)
            res = 1;

        while (n > 0) {
            //TODO: Calcule o valor do fatorial de "n", atrinbuindo o retorno a "r".


           switch (cnt){
               case 1:
                   tmp *= n;
                   break;
               case 2:
                   tmp /= n;
                   break;
               case 3:
                   tmp += n;

                   break;
               case 4:
                   res += tmp;
                   tmp = -n;
                   cnt = 0;
                   break;
           }

            if (n == 1)
                res = res + tmp;

           cnt++;
           n--;
        }

        System.out.println(res);
    }
}
//10 * 9 / 8
 //tmp * n / (n - 1) + (n - 2)
 //(n - 0)  * (n - 1) * (n - 2) + (n - 3) - (n - 4) * (n - 5) / (n - 6)
/*
* 0 = 1
* 1 = 1
* 2 = 2 * 1 = 2
* 3 = 3 * 2 / 1 = 6
* 4 = 4 * 3 / 2 + 1 = 7
* 5 = 5 * 4 / 3 + 2 - 1 = 7
* 6 = 6 * 5 / 4 + 3 - 2 * 1 = 8
* 7 = 7 * 6 / 5 + 4 - 3 * 2 / 1 = 6
* 8 = 8 * 7 / 6 + 5 - 4 * 3 / 2 + 1 = 9
* 9 = 9 * 8 / 7 + 6 - 5 * 4 / 3 + 2 - 1 = 11
* 10 = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1 = 12
* 11 = 11 * 10 / 9 + 8 - 7 * 6 / 5 + 4 -3 * 2 / 1 = 10*/

//tmp  * n * (n - 1)