// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        String max = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }

        System.out.println(max);
    }
}