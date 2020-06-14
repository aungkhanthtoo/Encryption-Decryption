// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        while (scanner.hasNext()) {
            number = scanner.nextInt();
            if (number == 0) {
                System.out.println(sum);
                break;
            }

            sum += number;
            if (sum >= 1000){
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}