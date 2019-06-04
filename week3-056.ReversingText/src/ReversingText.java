
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int length = text.length()-1;
        String emptyString = "";

        while(0 <= length){
            char cVar = text.charAt(length);
            emptyString+=cVar;
            length--;
        }

        return emptyString;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
