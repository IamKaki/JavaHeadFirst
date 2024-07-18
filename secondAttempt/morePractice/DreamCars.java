class DreamCars {
	//Declaring private instance variables
	private String brand;
	private int year;

	//Creating public setter and getter methods to access the private variables
	public void setBrand(String newBrand) {
		brand = newBrand;
	}
	public String getBrand() {
		return brand;
	}
	public void setYear(int newYear) { 
		year = newYear;
	}
	public int getYear() {
		return year;
	}
}

class DreamCarsTestDrive {
	public static void main(String[] args) {
		//Declaring an array named babies of type DreamCars with an index of 3
		DreamCars[] babies  = new DreamCars[3];

		//Creating three babies objects of type DreamCars
		babies[0] = new DreamCars();
		babies[1] = new DreamCars();
		babies[2] = new DreamCars();

		//using the three objects to set the variables for each of the three objects
		babies[0].setBrand("Mercedees Gwagon");
		babies[0].setYear(2024);

		babies[1].setBrand("BMW Convertible");
		babies[1].setYear(2023);

		babies[2].setBrand("Audi Convertible");
		babies[2].setYear(2025);

		//getting and printing the new variables for each of the objects
		System.out.println("My personal machine is a " + babies[1].getBrand() + " of " + babies[1].getYear() + ".");
		System.out.println("My wife's vehicle is an " + babies[2].getBrand() + ", manufactured in " + babies[2].getYear() + ".");
		System.out.println("Our family car is the capable " + babies[0].getBrand() + " of " + babies[0].getYear() + ".");
	}
}
