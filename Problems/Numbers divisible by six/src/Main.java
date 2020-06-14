// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < numbers; i++) {
            int input = scanner.nextInt();
            if (input % 6 == 0){
                sum += input;
            }
        }
        System.out.println(sum);
    }
}