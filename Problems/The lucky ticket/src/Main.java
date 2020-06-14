// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        int firstSum = 0;
        int lastSum = 0;
        String[] digits = ticket.split("");

        for (int i = 0; i < digits.length ; i++) {
            int digit = Integer.parseInt(digits[i]);
            if (i < 3){
                firstSum += digit;
            }else {
                lastSum += digit;
            }
        }

        if (firstSum == lastSum) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}