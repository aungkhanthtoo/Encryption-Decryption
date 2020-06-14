// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long nextInt = scanner.nextLong();
        int mul = 1;
        int res = 1;

        while (res <= nextInt) { // n! > M.
            mul++;
            res *= mul;
        }
        System.out.print(mul);
    }
}