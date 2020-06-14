// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        System.out.println(((input + 1) * input + 2) * input + 3);
    }
}