public class Dog {
	int age;
	float height;
	String name;

	void bark(){
		System.out.println("Woff wooff wooff!");
	}
}
class DogTestDrive{
	public static void main(String[] args){
		Dog one = new Dog();
		one.name = "Poppy";
		one.age = 2;
		one.height = 0.3f;

		Dog two = new Dog();
		two.name = "Simba";
		two.age = 4;
		two.height = 0.6f;

		Dog three = new Dog();
		three.name = "Bike";
		three.age = 6;
		three.height = 0.9f;

		System.out.println("This dog's name is " + one.name + ", he is " + one.age + " years of age and has a height of " + one.height + ".");
		System.out.println("This dog's name is " + two.name + ", he is " + two.age + " years of age and has a height of " + two.height + ".");
		System.out.println("This dog's name is " + three.name + ", he is " + three.age + " years of age and has a height of " + three.height + ".");
	}
}
