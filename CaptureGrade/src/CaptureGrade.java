import java.util.Scanner;
public class CaptureGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize variables for sum, maximum, minimum, and number of grades
        double sum = 0;
        double maximum = Double.MIN_VALUE; // Initialize to smallest possible value
        double minimum = Double.MAX_VALUE; // Initialize to largest possible value
        int numOfGrades = 10;
        // Prompt user to enter grades and calculate sum, maximum, and minimum
        System.out.println("Enter ten grades:");
        for (int i = 0; i < numOfGrades; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            // Increment sum
            sum += grade;

            if (grade > maximum) {
                maximum = grade;
            } else if (grade < minimum) {
                minimum = grade;
            }
        }
        // Calculate average grade
        double average = sum / numOfGrades;
        // Print statistics
        System.out.println("Average Grade: " + average);
        System.out.println("Maximum Grade: " + maximum);
        System.out.println("Minimum Grade: " + minimum);
    }
}




