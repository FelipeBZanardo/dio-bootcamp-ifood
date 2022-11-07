import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        if (num % 3 == 0){
            if (num % 5 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        } else if (num % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);



    }
}
