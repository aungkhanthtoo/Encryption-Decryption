// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numOfBridges = scanner.nextInt();

        int bridgeHeight;
        int crashBridge = -1;
        for (int i = 0; i < numOfBridges; i++) {
            bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight){
                crashBridge = i;
            }
        }

        if (crashBridge == -1) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + crashBridge);
        }
    }
}