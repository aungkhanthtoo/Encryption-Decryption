import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        /*final Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }*/

        SomeClass instance = new SomeClass(300, "another-value");
        System.out.println(instance);
    }
}

class SomeClass {

    int val = 50;
    String str = "default";

    public SomeClass() {
        this(100);
    }

    public SomeClass(int val) {
        val = val;
    }

    public SomeClass(String str) {
        this();
        this.str = "some-value";
    }

    public SomeClass(int val, String str) {
        this(str);
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "val=" + val +
                ", str='" + str + '\'' +
                '}';
    }
}