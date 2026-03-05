import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class CheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("WELCOME");
        System.out.println("====================================");
        System.out.println("Palindrome Checker - Strategy Pattern");
        System.out.println("====================================");

        String word = "A man a plan a canal Panama";

        // Normalize string
        String normalized = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        if (checker.checkPalindrome(normalized)) {
            System.out.println("\"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome.");
        }
    }
}

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

// Stack-based implementation
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        for (char c : word.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque-based implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context class
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String word) {
        return strategy.isPalindrome(word);
    }
}