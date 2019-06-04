import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num;
        int i = 1;
        int fact = 1;

        System.out.println("Type a number: ");
        num = reader.nextInt();

        while (i <= num){
            fact*=i;
            i++;
        }

        System.out.println("Factorial is " + fact);

    }
}
