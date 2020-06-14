import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        final Time time = new Time();
        time.hour = 12;
        return time;
    }

    public static Time midnight() {
        return new Time();
    }

    public static Time ofSeconds(long seconds) {
        final Time time = new Time();
        final int days = (int) TimeUnit.SECONDS.toDays(seconds);

        time.hour = (int) (TimeUnit.SECONDS.toHours(seconds) - TimeUnit.DAYS.toHours(days));
        time.minute = (int) (TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.DAYS.toMinutes(days)
                - TimeUnit.HOURS.toMinutes(time.hour));
        time.second = (int) (TimeUnit.SECONDS.toSeconds(seconds) - TimeUnit.DAYS.toSeconds(days)
                - TimeUnit.HOURS.toSeconds(time.hour) - TimeUnit.MINUTES.toSeconds(time.minute));

        return time;
    }

    /*public static Time ofSeconds(long seconds) {
        long sec = seconds % (3600L * 24);
        int hour = (int) (sec / 3600L);
        sec %= 3600L;
        int minute = (int) (sec / 60L);
        sec %= 60L;
        int second = (int) sec;
        return Time.of(hour, minute, second);
    }*/

    public static Time of(int hour, int minute, int second) {
        boolean validHour = hour >= 0 && hour <= 23;
        boolean validMinute = minute >= 0 && minute <= 59;
        boolean validSecond = second >= 0 && second <= 59;
        if (validHour && validMinute && validSecond) {
            final Time time = new Time();
            time.hour = hour;
            time.minute = minute;
            time.second = second;
            return time;
        }
        return null;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}