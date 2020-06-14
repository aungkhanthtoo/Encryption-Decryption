import java.util.*;

public class Main {

    // write a method here

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    private static void addValueByIndex(long[] array, int index, long value) {
        if (array.length == 0 || index > array.length) {
            return;
        }

        array[index] = array[index] + value;
    }
}