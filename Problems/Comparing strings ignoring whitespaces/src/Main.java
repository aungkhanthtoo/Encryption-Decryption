// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().trim().replace(" ", "");
        String second = scanner.nextLine().trim().replace(" ", "");
        System.out.println(first.equals(second));

    }
}