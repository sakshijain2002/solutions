import java.util.Scanner;

public class Solution7 {
        public static double calculateCompoundedInflation(double rateOfInflation, int years) {
            // Convert rate of inflation to decimal
            double decimalRate = rateOfInflation / 100.0;

            // Calculate compounded inflation using compound interest formula
            double compoundedInflation = Math.pow(1 + decimalRate, years);

            return compoundedInflation;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input rate of inflation
            System.out.print("Enter the rate of retail inflation (in percentage): ");
            double rateOfInflation = scanner.nextDouble();

            // Input number of years
            System.out.print("Enter the number of years: ");
            int years = scanner.nextInt();

            // Calculate compounded inflation
            double compoundedInflation = calculateCompoundedInflation(rateOfInflation, years);

            // Display the result
            double finalInflation = (compoundedInflation - 1) * 100;
            System.out.printf("Compounded retail inflation after %d years: %.2f%%\n", years, finalInflation);

            scanner.close();
        }
    }
