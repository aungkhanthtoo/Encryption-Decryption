// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstHour = scanner.nextInt();
        int firstMin = scanner.nextInt();
        int firstSec = scanner.nextInt();

        int secondHour = scanner.nextInt();
        int secondMin = scanner.nextInt();
        int secondSec = scanner.nextInt();

        int firstSeconds = firstSec + ((firstHour * 60) + firstMin) * 60;
        int secondSeconds = secondSec + ((secondHour * 60) + secondMin) * 60;
        System.out.println(secondSeconds - firstSeconds);
    }
}