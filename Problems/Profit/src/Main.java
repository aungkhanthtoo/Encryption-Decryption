import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        double money = scanner.nextInt();
        final int interest = scanner.nextInt();
        final int expectedMoney = scanner.nextInt();

        int years = 0;
        while (money < expectedMoney) {
            money = money + (money * (interest / 100f));
            years++;
        }
        System.out.println(years);

        float f = (float) (20d + 20.02f); // 1
        long n = 10 + 2L;       // 2
        byte b = (byte) (n + 5);
    }
}