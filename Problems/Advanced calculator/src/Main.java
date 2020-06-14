import java.util.Arrays;

/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        String[] numbers = Arrays.copyOfRange(args, 1, args.length);
        final long result;
        if ("MAX".equals(operator)) {
            result = max(numbers);
        } else if ("MIN".equals(operator)) {
            result = min(numbers);
        } else {
            result = sum(numbers);
        }
        System.out.println(result);
    }

    public static int max(String[] args) {
        int max = Integer.parseInt(args[0]);
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(String[] args) {
        int min = Integer.parseInt(args[0]);
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static long sum(String[] args) {
        long sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        return sum;
    }
}