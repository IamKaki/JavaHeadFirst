public class While2{
	public static void main(String[] args){
		int x = 25;

		System.out.println("Before the loop.");

		while (x > 22){
			System.out.println("Inside the loop");
			System.out.println("The value of x is now " + x);
			x--;
		}
		
		System.out.println("After the loop.");
	}
}
