public class CheckerApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("WELCOME");
        System.out.println("====================================");
        System.out.println("Palindrome Checker - Character Array Version");
        System.out.println("====================================");

        String word = "madam";
        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}