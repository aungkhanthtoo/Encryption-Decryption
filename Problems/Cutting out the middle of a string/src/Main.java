// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int middle = word.length() / 2;

        String first;
        if (word.length() % 2 == 0) {
            first = word.substring(0, middle - 1);
        } else {
            first = word.substring(0, middle);
        }

        String second = word.substring(middle + 1);
        System.out.println(first + second);
    }
}