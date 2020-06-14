class Problem {

    public static void main(String[] args) {
        // Write your code here
        for (int i = 0; i < args.length; i+=2) {
            System.out.println(format(args[i], args[i + 1]));
        }
    }

    public static String format(String param, String value) {
        return String.format("%s=%s", param, value);
    }
}