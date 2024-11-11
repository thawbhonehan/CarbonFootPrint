import java.util.ArrayList;

public class Admin extends User {
    // Additional attribute for admin ID
    private String adminID;

    // Collection to store tips
    private ArrayList<String> reductionTips;

    // Constructor
    public Admin(String username, String adminID) {
        super(username, "admin");  // Call the User constructor with "admin" as userType
        this.adminID = adminID;
        this.reductionTips = new ArrayList<>();
        
        // Add default tips
        addDefaultTips();
    }

    // Method to add a new reduction tip
    public void addReductionTip(String tip) {
        reductionTips.add(tip);
        System.out.println("New tip added: " + tip);
    }

    // Method to update an existing tip
    public void updateReductionTip(int index, String updatedTip) {
        if (index >= 0 && index < reductionTips.size()) {
            reductionTips.set(index, updatedTip);
            System.out.println("Tip updated at index " + index + ": " + updatedTip);
        } else {
            System.out.println("Invalid index. Unable to update tip.");
        }
    }

    // Method to delete a tip
    public void deleteReductionTip(int index) {
        if (index >= 0 && index < reductionTips.size()) {
            System.out.println("Tip removed: " + reductionTips.get(index));
            reductionTips.remove(index);
        } else {
            System.out.println("Invalid index. Unable to delete tip.");
        }
    }

    // Method to display all reduction tips
    public void displayReductionTips() {
        System.out.println("Reduction Tips:");
        for (int i = 0; i < reductionTips.size(); i++) {
            System.out.println((i + 1) + ". " + reductionTips.get(i));
        }
    }

    // Method to add default tips
    private void addDefaultTips() {
        reductionTips.add("Use public transportation or carpool whenever possible.");
        reductionTips.add("Switch to energy-efficient appliances.");
        reductionTips.add("Reduce, reuse, and recycle your waste.");
        reductionTips.add("Consider switching to renewable energy sources.");
        reductionTips.add("Minimize food waste by planning meals.");
    }

    // Getters and setters for adminID
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
}
