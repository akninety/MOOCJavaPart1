
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num;
        int i = 0;
        int sumOfPower = 0;

        System.out.println("Type a number: ");
        num = reader.nextInt();

        while (i <= num) {
            int result = (int) Math.pow(2, i);
            sumOfPower+=result;
            i++;
        }

        System.out.println("The result is: " + sumOfPower);

    }
}
