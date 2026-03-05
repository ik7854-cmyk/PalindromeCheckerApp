public class CheckerApp {

    static boolean isPalindrome(String word, int start, int end) {

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

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("WELCOME");
        System.out.println("====================================");
        System.out.println("Palindrome Checker - Case Insensitive");
        System.out.println("====================================");

        String word = "A man a plan a canal Panama";

        // Normalize string
        String normalized = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (isPalindrome(normalized, 0, normalized.length() - 1)) {
            System.out.println("\"" + word + "\"" + " is a Palindrome.");
        } else {
            System.out.println("\"" + word + "\"" + " is NOT a Palindrome.");
        }
    }
}