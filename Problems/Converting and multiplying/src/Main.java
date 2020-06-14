import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String newInput;
        while (!(newInput = scanner.nextLine()).equals("0")) {
            print(newInput);
        }
    }

    public static void print(String input) {
        try {
            final int num = Integer.parseInt(input);
            System.out.println(num * 10);
        } catch (NumberFormatException e) {
            System.out.println("Invalid user input: " + input);
        }
    }
}