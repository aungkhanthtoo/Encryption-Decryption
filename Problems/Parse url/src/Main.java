// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String query = url.split("\\?")[1];
        String[] params = query.split("&");
        String password = "";
        for (String param: params) {
            String[] entry = param.split("=");
            System.out.println(String.format(
                    "%s : %s", entry[0], entry.length == 1 ? "not found" : entry[1]));
            if (entry[0].equals("pass")) {
                password = entry[1];
            }
        }

        if (!password.isEmpty()){
            System.out.println("password : " + password);
        }
    }
}