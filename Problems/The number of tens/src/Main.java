// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int tens = (number % 100) / 10;
        System.out.println(tens);
    }
}