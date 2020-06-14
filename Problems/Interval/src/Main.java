// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean firstInterval = input > -15 && input <= 12;
        boolean secondInterval = input > 14 && input < 17;
        boolean thirdInterval = input >= 19;

        if (firstInterval || secondInterval || thirdInterval) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}