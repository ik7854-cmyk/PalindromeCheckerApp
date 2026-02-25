import java.util.Stack;

public class CheckerApp {

    public static void main(String args[]) {

        System.out.println("=================================================");
        System.out.println("        WELCOME TO PALINDROME CHECKER");
        System.out.println("=================================================");
        System.out.println("This application checks whether a word is a palindrome.");
        System.out.println("Using Stack (LIFO) Technique");
        System.out.println("=================================================");

        String word = "madam";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("\nChecking word : " + word);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome");
        } else {
            System.out.println("Result : It is not a Palindrome");
        }

        System.out.println("=================================================");
    }
}