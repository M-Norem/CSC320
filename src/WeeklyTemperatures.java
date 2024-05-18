import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        // Initialize ArrayLists to store days and temperatures
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Days of the week
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Loop through each day of the week to collect temperatures
        for (String day : weekDays) {
            System.out.println("Enter the average temperature for " + day + ": ");
            double temp = readValidTemperature(scanner);
            days.add(day);
            temperatures.add(temp);
        }

        // Loop for user commands
        while (true) {
            System.out.println("Enter a day of the week to see the temperature or 'week' to see the weekly average (type 'exit' to quit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("week")) {
                double sum = 0;
                System.out.println("Temperatures for the week:");
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i) + "°C");
                    sum += temperatures.get(i);
                }
                double average = sum / temperatures.size();
                System.out.println("Weekly average temperature: " + average + "°C");
            } else if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                boolean found = false;
                for (int i = 0; i < days.size(); i++) {
                    if (days.get(i).equalsIgnoreCase(input)) {
                        System.out.println(days.get(i) + ": " + temperatures.get(i) + "°C");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Invalid day. Please enter a valid day of the week.");
                }
            }
        }

        scanner.close();
    }

    // Method to read a valid temperature from the user
    private static double readValidTemperature(Scanner scanner) {
        double temp;
        while (true) {
            temp = scanner.nextDouble();
            if (temp >= -100 && temp <= 100) { // Assuming temperatures are within the range of -100°C to 100°C
                break;
            } else {
                System.out.println("Please enter a valid temperature within the range of -100°C to 100°C.");
            }
        }
        return temp;
    }
}
