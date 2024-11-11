import java.util.Scanner;

public class CarbonFootPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an Admin user
        Admin admin = new Admin("AdminUser", "ADM001");

        // Create a public user
        User publicUser = new User("JohnDoe", "public");

        // Main program loop
        boolean running = true;
        while (running) {
            System.out.println("\nCarbon Footprint Calculator and Reducer");
            System.out.println("1. Calculate Carbon Footprint");
            System.out.println("2. View Reduction Tips");
            System.out.println("3. Track Progress");
            System.out.println("4. Admin Options");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Get inputs for footprint calculation
                    System.out.print("Enter transport emissions (kg CO2): ");
                    double transport = scanner.nextDouble();
                    System.out.print("Enter electricity emissions (kg CO2): ");
                    double electricity = scanner.nextDouble();
                    System.out.print("Enter waste emissions (kg CO2): ");
                    double waste = scanner.nextDouble();

                    // Use FootprintCalculator class
                    FootPrintCalculator calculator = new FootPrintCalculator(transport, electricity, waste);
                    double totalFootprint = calculator.calculateTotalFootprint();
                    publicUser.calculateFootprint(transport, electricity, waste);
                    System.out.println("Your total carbon footprint is: " + totalFootprint + " kg CO2");
                    break;

                case 2:
                    // Display reduction tips
                    publicUser.viewTips();
                    break;

                case 3:
                    // Track user progress
                    publicUser.trackProgress();
                    break;

                case 4:
                    // Admin options
                    if (publicUser.getUserType().equals("admin")) {
                        System.out.println("\nAdmin Options");
                        System.out.println("1. Add a Reduction Tip");
                        System.out.println("2. Update a Reduction Tip");
                        System.out.println("3. Delete a Reduction Tip");
                        System.out.println("4. View All Tips");
                        System.out.print("Select an option: ");
                        int adminChoice = scanner.nextInt();
                        scanner.nextLine();  // Consume newline

                        switch (adminChoice) {
                            case 1:
                                System.out.print("Enter a new tip: ");
                                String newTip = scanner.nextLine();
                                admin.addReductionTip(newTip);
                                break;
                            case 2:
                                admin.displayReductionTips();
                                System.out.print("Enter the index of the tip to update: ");
                                int updateIndex = scanner.nextInt();
                                scanner.nextLine();  // Consume newline
                                System.out.print("Enter the updated tip: ");
                                String updatedTip = scanner.nextLine();
                                admin.updateReductionTip(updateIndex - 1, updatedTip);
                                break;
                            case 3:
                                admin.displayReductionTips();
                                System.out.print("Enter the index of the tip to delete: ");
                                int deleteIndex = scanner.nextInt();
                                admin.deleteReductionTip(deleteIndex - 1);
                                break;
                            case 4:
                                admin.displayReductionTips();
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                    } else {
                        System.out.println("Access denied. Admins only.");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
