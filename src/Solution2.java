import java.util.Scanner;
public class Solution2 {

        public static double calculateGrossPrice(double netPrice, double taxRate) {
            // Calculate the gross price before taxes using the formula: gross = net / (1 + taxRate)
            return netPrice / (1 + taxRate);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input net price including taxes
            System.out.print("Enter the net price including taxes: ");
            double netPrice = scanner.nextDouble();

            // Input tax rate
            System.out.print("Enter the tax rate (in decimal): ");
            double taxRate = scanner.nextDouble();

            // Calculate gross price before taxes
            double grossPrice = calculateGrossPrice(netPrice, taxRate);

            // Display the result
            System.out.println("Gross price before taxes: " + grossPrice);

        }
    }


