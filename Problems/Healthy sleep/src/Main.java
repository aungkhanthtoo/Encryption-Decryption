// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int minimum = scanner.nextInt();
        int maximum = scanner.nextInt();
        int actual = scanner.nextInt();

        if (actual < minimum){
            System.out.println("Deficiency");
        } else if (actual > maximum){
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}