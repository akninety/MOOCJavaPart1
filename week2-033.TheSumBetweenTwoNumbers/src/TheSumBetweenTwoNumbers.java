
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int first;
        int last;
        int sum = 0;

        System.out.println("First: ");
        first = reader.nextInt();

        System.out.println("Last: ");
        last = reader.nextInt();

        while (first <= last){
            sum+=first;
            first++;
        }

        System.out.println("The sum is " + sum);

    }
}
