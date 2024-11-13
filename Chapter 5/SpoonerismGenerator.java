import java.util.Scanner;

public class SpoonerismGenerator {

   
    private static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.next();
    }

        private static int vowelIndex(String word) {
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;     }

    
    private static void run() {
        String word1 = getWord("Input The first word: ");
        String word2 = getWord("Input The second word: ");

        
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

       
        if (vowelIndex1 > 0 && vowelIndex2 > 0) {
            String start1 = word1.substring(0, vowelIndex1);
            String start2 = word2.substring(0, vowelIndex2);
            String rest1 = word1.substring(vowelIndex1);
            String rest2 = word2.substring(vowelIndex2);

            String spoonerizedWord1 = start2 + rest1;
            String spoonerizedWord2 = start1 + rest2;

            System.out.println("Original words: " + word1 + ", " + word2);
            System.out.println("Spoonerized words: " + spoonerizedWord1 + ", " + spoonerizedWord2);
        } else {
            System.out.println("this words cannot be spoonarized.");
        }
    }

    public static void main(String[] args) {
        run();
    }
}
