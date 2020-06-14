// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char[] number = scanner.next().toCharArray();
        int middle = number.length / 2;
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < number.length; i++) {
            int digit = Character.getNumericValue(number[i]);
            if (i < middle) {
                firstHalfSum += digit;
            } else {
                secondHalfSum += digit;
            }
        }

        if (firstHalfSum == secondHalfSum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}