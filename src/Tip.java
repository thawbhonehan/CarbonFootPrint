public class Tip {
    private String tipContent;
    private String category;

    // Constructor
    public Tip(String tipContent, String category) {
        this.tipContent = tipContent;
        this.category = category;
    }

    // Getters and setters
    public String getTipContent() {
        return tipContent;
    }

    public void setTipContent(String tipContent) {
        this.tipContent = tipContent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Display the tip content
    public void displayTip() {
        System.out.println("Category: " + category + " - Tip: " + tipContent);
    }
}
