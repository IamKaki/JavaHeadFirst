class Umbwa {
	int size;
	String name;

	public void bark() {
		if (size > 10){
			System.out.println("Woof! Woof! Woof!");
		}
		else if (size > 5){
			System.out.println("Ruff! Ruff! Ruff!");
		}
		else {
			System.out.println("Yip! Yip! Yip!");
		}
	}
}
class UmbwaTestDrive {
	public static void main(String[] args){
	Umbwa[] pets = new Umbwa[3];

	pets[0] = dog1 Umbwa();
	dog1.name = "Poppy";
	dog1.size = 12;

	pets[1] = dog2;
	dog2.name = "Sam";
	dog2.size = 7;

	pets[2] = dog3;
	dog3.name = "Jim";
	dog3.size = 3;

	dog3.bark();
	dog2.bark();
	dog1.bark();
	}
}
