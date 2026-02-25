import java.util.Scanner;
public class CheckerApp {
    public static void main(String args[]) {
        System.out.println("=================================================");
        System.out.println(" WELCOME TO PALINDROME CHECKER");
        System.out.println("=================================================");
        System.out.println("This application checks whether a word is a palindrome.");
        System.out.println("Stay tuned for upcoming features!!!");
        String word = "madam";
        String reversed = " ";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        System.out.println("\nCheckiing word : " + word);
        if (word.equals(reversed)) {
            System.out.println("Result : It is a Palindrome");
        } else {
            System.out.println("Result : It is not a Palindrome");
        }
    }
}
