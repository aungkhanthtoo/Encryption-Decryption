// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(string.subSequence(start, end + 1));
    }
}