public class While3{
	public static void main(String[] args){
		int x = 33;
		System.out.println("The value of x before loop is " + x);

		while (x > 25){
			System.out.println("The value of x in the loop is " + x);
			x--;
		}

		System.out.println("Now the value of x after the loop is " + x);
	}
}
