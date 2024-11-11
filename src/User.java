import java.util.ArrayList;

public class User {
    // Attributes
    private String username;
    private String userType;  // Either "public" or "admin"
    private ArrayList<Double> footprintData;  // Stores user’s past carbon footprint data

    // Constructor
    public User(String username, String userType) {
        this.username = username;
        this.userType = userType;
        this.footprintData = new ArrayList<>();
    }

    // Method to calculate carbon footprint based on user inputs
    public double calculateFootprint(double transportEmissions, double electricityEmissions, double wasteEmissions) {
        double totalFootprint = transportEmissions + electricityEmissions + wasteEmissions;
        footprintData.add(totalFootprint);  // Save the calculated footprint
        System.out.println("Carbon footprint calculated: " + totalFootprint + " kg CO2");
        return totalFootprint;
    }

    // Method to display reduction tips
    public void viewTips() {
        System.out.println("Carbon Footprint Reduction Tips:");
        System.out.println("1. Use public transportation or carpool whenever possible.");
        System.out.println("2. Switch to energy-efficient appliances.");
        System.out.println("3. Reduce, reuse, and recycle your waste.");
        System.out.println("4. Consider switching to renewable energy sources.");
        System.out.println("5. Minimize food waste by planning meals.");
    }

    // Method to track and display user's footprint progress over time
    public void trackProgress() {
        System.out.println("Tracking Progress:");
        if (footprintData.isEmpty()) {
            System.out.println("No data available yet. Calculate your footprint to begin tracking progress.");
            return;
        }
        
        for (int i = 0; i < footprintData.size(); i++) {
            System.out.println("Entry " + (i + 1) + ": " + footprintData.get(i) + " kg CO2");
        }
        
        double latestFootprint = footprintData.get(footprintData.size() - 1);
        double initialFootprint = footprintData.get(0);
        double reduction = initialFootprint - latestFootprint;
        
        System.out.println("Initial footprint: " + initialFootprint + " kg CO2");
        System.out.println("Latest footprint: " + latestFootprint + " kg CO2");
        System.out.println("Total reduction: " + reduction + " kg CO2");
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public ArrayList<Double> getFootprintData() {
        return footprintData;
    }
}
