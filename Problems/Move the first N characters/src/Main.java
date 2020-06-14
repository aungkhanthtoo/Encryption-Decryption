import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        final String text = scanner.next();
        final int shiftKey = scanner.nextInt();

        final String result;
        if (shiftKey >= text.length()) {
            result = text;
        } else {
            result = text.substring(shiftKey) + text.substring(0, shiftKey);
        }
        System.out.println(result);
    }
}