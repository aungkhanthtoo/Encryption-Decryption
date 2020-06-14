// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            result = result.concat(String.valueOf(word.charAt(i)).repeat(2));
        }

        System.out.println(result);
    }
}