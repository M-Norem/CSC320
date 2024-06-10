import java.util.ArrayList;
class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Add a new vehicle
    public String addNewVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully.";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    // List out vehicle information
    public String[] listVehicleInformation() {
        try {
            String[] info = { "Make: " + this.make, "Model: " + this.model, "Color: " + this.color, "Year: " + this.year, "Mileage: " + this.mileage };
            return info;
        } catch (Exception e) {
            return new String[]{ "Failed to list vehicle information: " + e.getMessage() };
        }
    }

    // Remove a vehicle
    public String removeVehicle() {
        try {
            this.make = "Unknown";
            this.model = "Unknown";
            this.color = "Unknown";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    // Update the vehicle attributes
    public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }
}