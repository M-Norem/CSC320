import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;


public class AutoMobileInventory {
    public static void main(String[] args) {
        try {
            //Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage").
            Automobile car = new Automobile("Mazda", "CX-30", "Gray", 2022, 36000);

            //Then call the method to list the values. Loop through the array and print to the screen.
            String[] vehicleInfo = car.listVehicleInformation();
            System.out.print("Current Vehicle Info:\n");
            for (String info : vehicleInfo) {
                System.out.println("\t"+ info);
            }

            // Call the remove vehicle method to clear the variables.
            System.out.println(car.removeVehicle()); // Print return value

            // Add a new vehicle && Print return value
            System.out.println(car.addNewVehicle("Nissan", "Versa", "Blue", 2022, 4000));

            // Call the list method and print the new vehicle information to the screen.
            vehicleInfo = car.listVehicleInformation();
            System.out.print("Current Vehicle Info:\n");
            for (String info : vehicleInfo) {
                System.out.println("\t"+ info);
            }

            // Update the vehicle
            System.out.println(car.updateVehicleAttributes("Jeep", "Gladiator", "Gray", 2019, 47000));

            // Call the listing method and print the information to the screen.
            vehicleInfo = car.listVehicleInformation();
            System.out.print("Current Vehicle Info:\n");
            for (String info : vehicleInfo) {
                System.out.println("\t"+ info);
            }

            // Display a message asking if the user wants to print the information to a file (Y or N)
            Scanner scanner = new Scanner(System.in);
            System.out.print("Do you want to print the information to a file? (Y or N): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("Y")) {
                printToFile("C:\\Temp\\Autos.txt", vehicleInfo);
            } else {
                System.out.println("File will not be printed.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to print vehicle information to a file
    public static void printToFile(String filePath, String[] vehicleInfo) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile(); // Creates a new file if it doesn't exist
            }
            try (FileWriter writer = new FileWriter(filePath)) {
                for (String info : vehicleInfo) {
                    writer.write(info + "\n");
                }
                System.out.println("Information printed to file successfully.");
            }
        } catch (IOException e) {
            System.out.println("Failed to print to file: " + e.getMessage());
        }
    }
}