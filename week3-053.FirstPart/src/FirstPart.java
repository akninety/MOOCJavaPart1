
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of the first part: ");
        int length = reader.nextInt();
        int start = 0;

        System.out.println("Result: " + word.substring(start,length));

    }
}
