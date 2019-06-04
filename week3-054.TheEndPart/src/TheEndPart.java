import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList

        System.out.println("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of the end part: ");
        int end = reader.nextInt();

        int length = word.length();

        System.out.println("Result: " + word.substring(length-end));

    }
}
