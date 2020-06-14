// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int square = 1;
        int i = 1;
        while (square <= number) {
            System.out.println(square);
            i++;
            square = i * i;
        }
    }
}