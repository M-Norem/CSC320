public class RestaurantInfo {
    public static void main(String[] args) {
        // Define variables for restaurant information
        String restaurantName = "Sample Restaurant";
        String businessAddress = "123 Main Street";
        String city = "Denver";
        String state = "CO";
        String zipCode = "80202";

        // Print restaurant information
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Address: " + businessAddress);
        System.out.println("City, State, Zip Code: " + city + ", " + state + ", " + zipCode);
    }
}


/* OUTPUT: */

//"C:\Program Files\Java\jdk-22\bin\java.exe" --enable-preview "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.3.1\lib\idea_rt.jar=49222:C:\Program Files\JetBrains\IntelliJ IDEA 2023.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\m3nor\IdeaProjects\CSC320\out\production\CSC320 RestaurantInfo
//Restaurant Name: Sample Restaurant
//Address: 123 Main Street
//City, State, Zip Code: Denver, CO, 80202
//
//Process finished with exit code 0