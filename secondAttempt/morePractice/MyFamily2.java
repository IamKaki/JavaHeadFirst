class MyFamily2 {
	//Declaring private instance variables for the class
	private String name;
	private int age;

	//Creating methods to access and manipulate the private variables
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public int getAge() {
		return age;
	}
}

class MyFamily2Test {
	public static void main(String[] args) {
		//Declare an array named person of type MyFamily2 with an index of 6
		MyFamily2[] person = new MyFamily2[6];

		//Declare and initialize arrays to hold the names and ages of the person objects
		String name[] = {"Patrick", "Fridah", "John", "Joy", "Mathew", "Fredrick"};
		int age[] = {62,56,33,28,24,19};

		//populate the person array with objects and give each object its variables
		for (int i = 0; i < person.length; i++) {
			person[i] = new MyFamily2();
			person[i].setName(name[i]);
			person[i].setAge(age[i]);
		}

		//get and print the objects with respective variables
		for( int i = 0; i < person.length; i++) {
			System.out.println("Name is " + person[i].getName() + ", aged " + person[i].getAge() + ".");
		}
	}
}
