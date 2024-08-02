class Dog {
	int size;

	void bark(int noOfBarks) {
		while (noOfBarks > 0) {
			if(size > 60) {
			System.out.println("Woof! Woof! Woof!");
			}
			else if (size > 30) {
			System.out.println("Ruuf! Ruuf! Ruuf!");
			}
			else{
			System.out.println("Yip! Yip!");
			}
			noOfBarks = noOfBarks - 1;
		}
	}
}
class DogTestDrive {
	public static void main(String[] args) {
		Dog popy = new Dog();
		popy.size = 25;
		
		Dog simba = new Dog();
		simba.size = 80;
		
		Dog bosco = new Dog();
		bosco.size = 50;

		popy.bark(10);
		bosco.bark(10);
		simba.bark(10);
	}
}
