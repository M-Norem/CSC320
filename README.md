# Automobile Class

## Class Definition
- Define a class named `Automobile`.

## Member Variables
- `make`: String
- `model`: String
- `autoYear`: int
- `trimPackage`: String
- `vin`: String

## Constructor
- Initialize the member variables with the values passed as parameters.

## Methods

### addVehicle
1. Start
2. Accept parameters: make, model, autoYear, trimPackage, VIN
3. Set member variables to these parameters
4. End

### removeVehicle
1. Start
2. Accept parameters: vin
3. Check if the VIN matches the stored VIN
4. If VIN matches, remove vehicle information and return success message
5. Else, return a message indicating a mismatch
6. End

### getVehicleInfoByVIN
1. Start
2. Accept parameters: vin
3. Check if the VIN matches the stored VIN
4. If VIN matches, return the vehicle information
5. Else, return a message indicating no vehicle found with the given VIN
6. End

### getVehicleInfo
1. Start
2. Return the vehicle information as a formatted string
3. End
