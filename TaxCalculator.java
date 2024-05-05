import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weekly income: $");
        double income = scanner.nextDouble();

        double taxRate;

        // Determine tax rate based on income range
        switch ((int) income / 500) {
            case 0:
                taxRate = 0.10; // 10%
                break;
            case 1:
                taxRate = 0.15; // 15%
                break;
            case 2:
                taxRate = 0.20; // 20%
                break;
            default:
                taxRate = 0.30; // 30%
        }

        double taxWithholding = income * taxRate;
        System.out.println("Your weekly tax withholding: $" + taxWithholding);
    }
}
