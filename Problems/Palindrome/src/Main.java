// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int middle = word.length() / 2;
        String leftToRight = word.substring(0, word.length() % 2 == 0 ? middle : middle + 1);
        String rightToLeft = new StringBuilder(word.substring(middle)).reverse().toString();
        if (leftToRight.equalsIgnoreCase(rightToLeft)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}