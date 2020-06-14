// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int line = scanner.nextInt();

        if ((line % length == 0 || line % width == 0) && line <= length * width) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}