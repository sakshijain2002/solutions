import java.util.Scanner;

public class Solution8 {


    public static String convertSeconds(long seconds) {
        long days = seconds / (24 * 3600);
        seconds %= (24 * 3600);
        long hours = seconds / 3600;
        seconds %= 3600;
        long minutes = seconds / 60;
        seconds %= 60;
        return days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long seconds = sc.nextLong();
        String result = convertSeconds(seconds);
        System.out.println(result);
    }
}


