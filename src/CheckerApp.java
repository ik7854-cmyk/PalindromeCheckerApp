public class CheckerApp {

    public static void main(String args[]) {

        System.out.println("=================================================");
        System.out.println("        WELCOME TO PALINDROME CHECKER");
        System.out.println("=================================================");
        System.out.println("This application checks whether a word is a palindrome.");
        System.out.println("Using Character Array & Two-Pointer Technique");
        System.out.println("=================================================");
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

        System.out.println("\nChecking word : " + word);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome");
        } else {
            System.out.println("Result : It is not a Palindrome");
        }

        System.out.println("=================================================");
    }
}