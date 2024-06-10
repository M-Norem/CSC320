# CSC320 Assignments Repository

Welcome to the CSC320 Assignments Repository! This repository is used to store all the assignments for the CSC320 class.

## Branch Final-Program

### AutoMobile Class

1. Start
2. Define class `Automobile` with the following private attributes:
    - String `make`
    - String `model`
    - String `color`
    - int `year`
    - int `mileage`
3. Define a default constructor to initialize attributes with default values.
4. Define a parameterized constructor to initialize attributes with provided values.
5. Define a method `addNewVehicle(String make, String model, String color, int year, int mileage)`:
    - Try:
        - Set the attributes to the provided values.
        - Return success message.
    - Catch:
        - Return failure message.
6. Define a method `listVehicleInformation()`:
    - Try:
        - Create a String array with vehicle information.
        - Return the String array.
    - Catch:
        - Return failure message.
7. Define a method `removeVehicle()`:
    - Try:
        - Set all attributes to default values.
        - Return success message.
    - Catch:
        - Return failure message.
8. Define a method `updateVehicleAttributes(String make, String model, String color, int year, int mileage)`:
    - Try:
        - Update the attributes with provided values.
        - Return success message.
    - Catch:
        - Return failure message.

### AutoMobile Inventory Class

1. Start
2. Define class `AutomobileInventory`
3. Define `main` method:
    - Create a try block:
        - Create an instance of `Automobile` using the parameterized constructor with values ("Mazda", "CX-30", "Gray", 2020, 15000).
        - Call `listVehicleInformation` method.
        - Loop through the returned array and print each value.
        - Call `removeVehicle` method and print the return value.
        - Call `addNewVehicle` method with new values ("Honda", "Civic", "Blue", 2022, 5000) and print the return value.
        - Call `listVehicleInformation` method and print the new vehicle information.
        - Call `updateVehicleAttributes` method with updated values ("Honda", "Accord", "Black", 2022, 4000) and print the return value.
        - Call `listVehicleInformation` method and print the updated vehicle information.
        - Display message "Do you want to print the information to a file? (Y or N)".
        - Use `Scanner` to capture user response.
        - If response is "Y":
            - Call a method `printToFile(String filePath, String[] vehicleInfo)`:
                - Try:
                    - Write vehicle information to file at specified path.
                    - Print success message.
                - Catch:
                    - Print failure message.
        - If response is "N":
            - Print message "File will not be printed."
    - Catch block:
        - Print the error message to the console.
4. Define `printToFile` method:
    - Try:
        - Check if file exists
          - if it doesn't, create the file.
        - Write vehicle information to the file.
        - Return success message.
    - Catch:
        - Return failure message.
5. End


