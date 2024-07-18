class DreamCars2 {
	//Declare private instance variables
	private String brand;
	private int year;

	//create public setter and getter methods which will access amd modify the private variables
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

class DreamCars2TestDrive {
	public static void main(String[] args) {
		//decare an array of type dreamcars named cars with an index of 3
		DreamCars2[] cars = new DreamCars2[3];

		//create new object and use public method to access and manipulate the instance variable
		cars[0] = new DreamCars2();
		cars[0].setBrand("Mercedees Gwagon");
		cars[0].setYear(2024);
		
		//create second object and use public method to access and manipulate the instance variable
		cars[1] = new DreamCars2();
		cars[1].setBrand("Mercedees Convertible");
		cars[1].setYear(2025);
		
		//create third object and use public method to access and manipulate the instance variable
		cars[2] = new DreamCars2();
		cars[2].setBrand("Ford Mustang");
		cars[2].setYear(2026);

		//get and print the objects with their new states
		System.out.println("My car number one will be a " + cars[0].getBrand() + " manufactured in the year: " + cars[0].getYear());
		System.out.println("My car number two will be a " + cars[1].getBrand() + " manufactured in the year: " + cars[1].getYear());
		System.out.println("My car number three will be a " + cars[2].getBrand() + " manufactured in the year: " + cars[2].getYear());
	}
}
