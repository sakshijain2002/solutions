import java.util.Scanner;
public class Solution9 {
        public static boolean isSpecialInteger(int num) {
            if (num < 10 || num > 99) {
                return false; // Not a two-digit number
            }

            int sum = num / 10 + num % 10; // sum of individual digits
            int product = num / 10 * (num % 10); // product of digits

            return (sum + product) == num;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your integer :");
            int num = sc.nextInt();
            if (isSpecialInteger(num)) {
                System.out.println(num + " is a two-digit special integer.");
            } else {
                System.out.println(num + " is not a two-digit special integer.");
            }
        }
    }


