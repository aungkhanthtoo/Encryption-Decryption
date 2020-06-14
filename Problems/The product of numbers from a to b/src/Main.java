// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long products = 1;
        for (int i = a; i < b; i++) {
            products *= i;
        }
        System.out.println(products);
    }
}