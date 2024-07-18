class MyFamily {
	//Creating private insatance variables
	private String name;
	private String position;
	private int age;

	//creating public set and get methods for accessing the private variables
	public void setName(String newName) {
		name = newName;
	}
	public String getName() { 
		return name;
	}
	public void setPosition(String newPosition) {
		position = newPosition;
	}
	public String getPosition() {
		return position;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public int getAge() {
		return age;
	}
}

class MyFamilyTestDrive {
	public static void main(String[] args) {
		//decalring an array named person of type MyFamily with an index of six
		MyFamily[] person = new MyFamily[6];

		//Creating first object and accessing the private variables using the public methods
		person[0] = new MyFamily();
		person[0].setName("Patric Gicovi Njeru");
		person[0].setPosition("Father");
		person[0].setAge(62);

		//Creating second object and accessing the private variables using the public methods
		person[1] = new MyFamily();
		person[1].setName("Fridah Wambugi Gicovi");
		person[1].setPosition("Mother");
		person[1].setAge(56);

		//Creating third object and accessing the private variables using the public methods
		person[2] = new MyFamily();
		person[2].setName("John Kariuki Gicovi");
		person[2].setPosition("First Born Son");
		person[2].setAge(33);
		
		//Creating fourth object and accessing the private variables using the public methods
		person[3] = new MyFamily();
		person[3].setName("Joy Mutitu Gicovi");
		person[3].setPosition("First Born Daughter");
		person[3].setAge(28);
		
		//Creating fifth object and accessing the private variables using the public methods
		person[4] = new MyFamily();
		person[4].setName("Mathew Waweru Gicovi");
		person[4].setPosition("Second Born Son");
		person[4].setAge(24);
		
		//Creating sixth object and accessing the private variables using the public methods
		person[5] = new MyFamily();
		person[5].setName("Fredrick Karani Gicovi");
		person[5].setPosition("Third Bord Son");
		person[5].setAge(19);

		//getting and printing the object instance varaibles
		System.out.println("The first person is " + person[0].getName() + ", our " + person[0].getPosition() + " and he is aged " + person[0].getAge());
		System.out.println("The second person is " + person[1].getName() + ", our " + person[1].getPosition() + " and he is aged " + person[1].getAge());
		System.out.println("The third person is " + person[2].getName() + ", our " + person[2].getPosition() + " and he is aged " + person[2].getAge());
		System.out.println("The fourth person is " + person[3].getName() + ", our " + person[3].getPosition() + " and he is aged " + person[3].getAge());
		System.out.println("The fifth person is " + person[4].getName() + ", our " + person[4].getPosition() + " and he is aged " + person[4].getAge());
		System.out.println("The sixth person is " + person[5].getName() + ", our " + person[5].getPosition() + " and he is aged " + person[5].getAge());
	}
}
