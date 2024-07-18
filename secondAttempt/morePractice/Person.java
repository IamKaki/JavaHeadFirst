class Person {
	//private variables
	private String name;
	private int age;

	//public method to set the name
	public void setName(String newName){
		name = newName; //update the private variable name
	}

	//public method to get the name
	public String getName(){
		return name; // return the value of the private variable name
	}

	//public method to set the age
	public void setAge(int newAge){
		age = newAge; //Update the private variable age
	}

	//public method to get the age
	public int getAge(){
		return age; // returns the value of the private variable age
	}
}

class PersonTestDrive {
	public static void main(String[] args) {
		// Create a new Person object
		Person one = new Person();

		// set the name and age using the public methods
		one.setName("Kaki");
		one.setAge(33);

		//Get and print the name and age using the public methods
		System.out.println("The first person's name is " + one.getName() + " and he is " + one.getAge() + " of age.");
	}
}

