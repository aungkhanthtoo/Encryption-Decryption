// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        boolean ascending = false;
        boolean order = true;
        int counter = 0;
        int previous = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            if (counter == 1) {
                ascending = num >= previous;
            }

            if(order && counter > 1){
               order = ascending == num >= previous;
            }

            previous = num;

            counter++;
        }
        System.out.println(order);

    }
}