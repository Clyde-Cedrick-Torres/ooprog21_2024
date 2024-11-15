import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = input.nextLine();
        input.close();

        System.out.println(isPalindrome(text) ? "The word " + text + " is a Palindrome" : "This word is not a Palindrome");
    }

    public static boolean isPalindrome(String text) {
        for (int start = 0, end = text.length() - 1; start < end; start++, end--) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
        }
        return true;
    }
}


