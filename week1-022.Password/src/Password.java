
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
        System.out.println("Type the password: ");
        String value = reader.nextLine();

            if (value.equals("carrot")) {
                System.out.println("Right!");
                break;
            } else
                System.out.println("Wrong!");
        }

        System.out.println("Don't be a dingus.");

    }
}
