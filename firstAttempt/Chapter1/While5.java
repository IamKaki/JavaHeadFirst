public class While5{
	public static void main(String[] args){
		int i = 55;
		System.out.println("The value of i before the loop i " + i);

		while (i == 55){
			System.out.println("The value of i in the loop is " + i);
			i -= 5;
		}
		
		System.out.println("The value of i after the loop is " + i);
	}
}
