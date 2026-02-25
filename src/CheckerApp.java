import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class CheckerApp {

    public static void main(String args[]) {

        System.out.println("=================================================");
        System.out.println("        WELCOME TO PALINDROME CHECKER");
        System.out.println("=================================================");
        System.out.println("Demonstrating FIFO (Queue) vs LIFO (Stack)");
        System.out.println("=================================================");

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        for (int i = 0; i < word.length(); i++) {
            if (!queue.remove().equals(stack.pop())) {
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