import java.util.ArrayList;

public class User {
	
	private String username;
	private String usertype; 
	private ArrayList<Double> carbonFootprintData;
	
	//constructor
	
	public  User (String username, String usertype){
		
		this.username = username;
		this.usertype = usertype; 
		this.carbonFootprintData = new ArrayList<>();
		
	}
	
	
	public double CarbonCalulator(double carEmission, double energyEmission, double wasteEmission) {
		
		double totalfootprint = carEmission + energyEmission + wasteEmission; 
		carbonFootprintData.add(totalfootprint);
		System.out.println("Total calculated Carbon footprint: " +totalfootprint +"kg Co2");
		
		return totalfootprint;  
	}
	
	public void showTips()
	{
        System.out.println("Carbon Footprint Reduction Tips:");
        System.out.println("1. Use public transportation or carpool whenever possible.");
        System.out.println("2. Switch to energy-efficient appliances.");
        System.out.println("3. Reduce, reuse, and recycle your waste.");
        System.out.println("4. Consider switching to renewable energy sources.");
        System.out.println("5. Minimize food waste by planning meals.");
	}
	
	
	public void progressTracker() {
		System.out.println("Tracking Progress... ");
		if(carbonFootprintData.isEmpty()) {
			System.out.println("System could not found any data. Please calculate the footprint data first");
			return; 
		}
		
		for ( int i=0; i< carbonFootprintData.size(); i++)
		{
			System.out.println("Entry " + (i + 1) + ": " + carbonFootprintData.get(i) + " kg CO2");
		}
		
		double newestfootprint = carbonFootprintData.get(carbonFootprintData.size()-1);
		double initialfootprint = carbonFootprintData.get(0);
		double reductions = initialfootprint - newestfootprint; 
		

			
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUsertype() {
		return usertype;
	}


	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}


	public ArrayList<Double> getCarbonFootprintData() {
		return carbonFootprintData;
	}


	public void setCarbonFootprintData(ArrayList<Double> carbonFootprintData) {
		this.carbonFootprintData = carbonFootprintData;
	}
	
	

}
