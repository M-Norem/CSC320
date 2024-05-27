public class AutoMobile {
    // Member Variables
    private String make;
    private String model;
    private int autoYear;
    private String trimPackage;
    private String vin;

    // Constructor
    public Automobile(String make, String model, int autoYear, String trimPackage, String vin) {
        this.make = make;
        this.model = model;
        this.autoYear = autoYear;
        this.trimPackage = trimPackage;
        this.vin = vin;
    }

    // Method to add vehicle information
    public void addVehicle(String make, String model, int autoYear, String trimPackage, String vin) {
        this.make = make;
        this.model = model;
        this.autoYear = autoYear;
        this.trimPackage = trimPackage;
        this.vin = vin;
    }

    // Method to remove vehicle information by VIN
    public String removeVehicle(String vin) {
        if (this.vin.equals(vin)) {
            this.make = "";
            this.model = "";
            this.autoYear = 0;
            this.trimPackage = "";
            this.vin = "";
            return "Vehicle information removed successfully.";
        } else {
            return "Mismatch: VIN not found.";
        }
    }

    // Method to get vehicle information by VIN
    public String getVehicleInfoByVIN(String vin) {
        if (this.vin.equals(vin)) {
            return getVehicleInfo();
        } else {
            return "No vehicle found with the given VIN.";
        }
    }

    // Method to get vehicle information
    public String getVehicleInfo() {
        return "Make: " + make + "\nModel: " + model + "\nYear: " + autoYear + "\nTrim Package: " + trimPackage + "\nVIN: " + vin;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of Automobile
        Automobile myCar = new Automobile("Mazda", "CX-30", 2022, "Turbo-Premium", "1234567890ABCDE");

        // Add vehicle information
        myCar.addVehicle("Mazda", "CX-50", 2022, "Premium", "ABCDEFGHIJKLMNO");

        // Print vehicle information
        System.out.println(myCar.getVehicleInfo());

        // Try to remove vehicle information by VIN
        System.out.println(myCar.removeVehicle("ABCDEFGHIJKLMNO"));

        // Print vehicle information again
        System.out.println(myCar.getVehicleInfo());

        // Try to get vehicle information by VIN
        System.out.println(myCar.getVehicleInfoByVIN("1234567890ABCDE"));
    }
}
