public class FootPrintCalculator {
    // Attributes for different emission sources
    private double transportEmissions;
    private double electricityEmissions;
    private double wasteEmissions;

    // Constructor
    public FootPrintCalculator(double transportEmissions, double electricityEmissions, double wasteEmissions) {
        this.transportEmissions = transportEmissions;
        this.electricityEmissions = electricityEmissions;
        this.wasteEmissions = wasteEmissions;
    }

    // Method to calculate total carbon footprint
    public double calculateTotalFootprint() {
        return transportEmissions + electricityEmissions + wasteEmissions;
    }

    // Getters and setters
    public double getTransportEmissions() {
        return transportEmissions;
    }

    public void setTransportEmissions(double transportEmissions) {
        this.transportEmissions = transportEmissions;
    }

    public double getElectricityEmissions() {
        return electricityEmissions;
    }

    public void setElectricityEmissions(double electricityEmissions) {
        this.electricityEmissions = electricityEmissions;
    }

    public double getWasteEmissions() {
        return wasteEmissions;
    }

    public void setWasteEmissions(double wasteEmissions) {
        this.wasteEmissions = wasteEmissions;
    }
}
