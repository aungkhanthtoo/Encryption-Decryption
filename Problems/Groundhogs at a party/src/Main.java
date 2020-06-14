// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean goodForWeekDays = cups >= 10 && cups <= 20 && !isWeekend;
        boolean goodForWeekend = cups >= 15 && cups <= 25 && isWeekend;

        System.out.println(goodForWeekDays || goodForWeekend);
    }
}