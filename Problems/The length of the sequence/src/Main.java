// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int length = 0;
        int num;
        do {
            num = scanner.nextInt();
            if (num != 0) {
                length++;
            }
        } while (num != 0);

        System.out.println(length);
    }
}