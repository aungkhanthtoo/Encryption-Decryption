import java.util.*;

public class Main {
    final static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] chars = scanner.nextLine().toCharArray();
        process(chars);
    }

    private static void process(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length - 2; i++) {
            boolean isInARow = isVowel(chars[i]) && isVowel(chars[i + 1]) && isVowel(chars[i + 2]) ||
                            isConsonant(chars[i]) && isConsonant(chars[i + 1]) && isConsonant(chars[i + 2]);
            if (isInARow) {
                count++;
                i += 1;
            }
        }
        System.out.println(count);
    }

    private static boolean isConsonant(char c) {
        return Arrays.binarySearch(vowels, c) < 0;
    }

    private static boolean isVowel(char c) {
        return Arrays.binarySearch(vowels, c) >= 0;
    }
}