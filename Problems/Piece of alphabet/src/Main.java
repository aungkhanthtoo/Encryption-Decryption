// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.next();
//        char[] chars = word.toCharArray();
//        boolean order = false;
//
//        for (int i = 1; i < chars.length; i++) {
//            if (chars[i] - chars[i - 1] == 1) {
//                order = true;
//            }else {
//                order = false;
//                break;
//            }
//        }
//
//        System.out.println(order);

        boolean flag = true;
        char prev = 0;

        for (char c : new Scanner(System.in).next().toCharArray()) {
            if (prev != 0 && c - 1 != prev) {
                flag = false;
                break;
            }
            prev = c;
        }

        System.out.println(flag);

    }
}