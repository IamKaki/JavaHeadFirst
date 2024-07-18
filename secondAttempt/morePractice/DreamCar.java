class DreamCar {
	//Private variables for the calss DreamCar 
	private String brand;
	private String make;
	private int year;
	//public method to set the brand
	public void setBrand(String newBrand){
		brand = newBrand; 
	}
	//public method to get the brand
	public String getBrand(){
		return brand;
	}
	//public method to set the make
	public void setMake(String newMake){
		make = newMake;
	}
	//public method to get the make
	public String getMake(){
		return make;
	}
	//public method to set the year
	public void setYear(int newYear){
		year = newYear;
	}
	//public method to get the year
	public int getYear(){
		return year;
	}
}

class DreamCarTestDrive {
	public static void main(String[] args) {
		// create the first DreamCar object
		DreamCar first = new DreamCar();
		// using the first object to access the private variables using the public methods
		first.setBrand("Mercedees");
		first.setMake("G Wagon");
		first.setYear(2024);
		//get and print the private variables
		System.out.println("My dream car is a " + first.getBrand() + " " + first.getMake() + " manufactured in the year " + first.getYear() + ".");
	}
}
