public class While4{
	public static void main(String[] args){
		int x = 33;
		System.out.println("The value of x before the loop is " + x);

		while (x < 45){
			System.out.println("The value of x in the loop is " + x);
			x++;
		}

		System.out.println("The value of x after the loop is " + x);
	}
}
