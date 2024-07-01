class Dog {
	int size;
	String name;
	
	void bark(){
	if (size > 60) {
	System.out.println("Woff! Woff! Woff!");
	}
	else if (size > 30) {
	System.out.println("Ruff! Ruff! Ruff!");
	}
	else {
	System.out.println("Yip! Yip! Yip!");
	}	
	}
}
class DogTestDrive {
	public static void main (String[] args) {
	Dog dog1 = new Dog();
	dog1.name = "Poppy";
	dog1.size = 33;
	
	Dog dog2 = new Dog();
	dog2.name = "Simba";
	dog2.size = 12;
	
	Dog dog3 = new Dog();
	dog3.name = "Snoop";
	dog3.size = 65;

	dog1.bark();
	dog2.bark();
	dog3.bark();
	}
}
