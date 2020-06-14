import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int squirrels = scanner.nextInt();
        final int nuts = scanner.nextInt();
        System.out.println(nuts % squirrels);
    }
}