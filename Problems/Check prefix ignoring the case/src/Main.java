// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String j = "J";
        String first = string.substring(0, 1);
        System.out.println(first.equalsIgnoreCase(j));
    }
}