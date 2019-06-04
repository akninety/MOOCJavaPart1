
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int limit;
        int sum = 0;
        int i = 0;

        System.out.println("Until what?");
        limit = reader.nextInt();

        while (i <= limit){
            sum += i;
            i++;
        }

        System.out.println("Sum is " + sum);

    }
}
