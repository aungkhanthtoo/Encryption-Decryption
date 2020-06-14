// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        StringBuilder output = new StringBuilder();
//        int repetition = 0;
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//
//            if (output.length() == 0) {
//                output.append(c);
//                repetition = 1;
//            } else if (c != output.charAt(output.length() - 1)) {
//                output.append(repetition);
//                output.append(c);
//                repetition = 1;
//            } else {
//                repetition++;
//            }
//
//            if (i == input.length() - 1) output.append(repetition);
//        }
//
//        System.out.println(output);

        char[] chars = input.toCharArray();
        String result = "";
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]){
                count++;
            } else {
                result = result.concat(String.valueOf(chars[i - 1]));
                result = result.concat(String.valueOf(count));
                count = 1;
            }
        }

        result = result.concat(String.valueOf(chars[chars.length - 1]));
        result = result.concat(String.valueOf(count));
        System.out.println(result);
    }
}