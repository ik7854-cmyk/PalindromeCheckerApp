public class CheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("WELCOME");
        System.out.println("====================================");
        System.out.println("Palindrome Checker - OOP Version");
        System.out.println("====================================");

        String word = "A man a plan a canal Panama";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(word)) {
            System.out.println("\"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome.");
        }
    }
}

// Encapsulated class containing palindrome logic
class PalindromeChecker {

    public boolean checkPalindrome(String word) {

        // Normalize string (ignore spaces, punctuation, case)
        String normalized = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return isPalindrome(normalized, 0, normalized.length() - 1);
    }

    private boolean isPalindrome(String word, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare characters
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(word, start + 1, end - 1);
    }
}