import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class CheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("WELCOME");
        System.out.println("====================================");
        System.out.println("Palindrome Algorithm Performance Test");
        System.out.println("====================================");

        String word = "A man a plan a canal Panama";

        // Normalize string
        String normalized = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Run Stack Strategy
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeChecker stackChecker = new PalindromeChecker(stackStrategy);

        long startTime = System.nanoTime();
        boolean stackResult = stackChecker.checkPalindrome(normalized);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Run Deque Strategy
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        PalindromeChecker dequeChecker = new PalindromeChecker(dequeStrategy);

        startTime = System.nanoTime();
        boolean dequeResult = dequeChecker.checkPalindrome(normalized);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Display results
        System.out.println("\nInput String: \"" + word + "\"\n");

        System.out.println("Stack Strategy Result: " + stackResult);
        System.out.println("Execution Time (Stack): " + stackTime + " ns\n");

        System.out.println("Deque Strategy Result: " + dequeResult);
        System.out.println("Execution Time (Deque): " + dequeTime + " ns\n");

        // Compare performance
        if (stackTime < dequeTime) {
            System.out.println("Stack Strategy is faster.");
        } else if (dequeTime < stackTime) {
            System.out.println("Deque Strategy is faster.");
        } else {
            System.out.println("Both strategies have similar performance.");
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