public class BottlesOfBeer{
	public static void main(String[] args){
		int bottles = 99;
		String phrase1 = " bottles of beer";
		String phrase2 = "Take one down and pass it around, ";

		while (bottles > 0){
			if (bottles == 1){
				phrase1 = " bottle of beer";
			}
		System.out.println(bottles + phrase1 + " on the wall, " + bottles + phrase1);
			bottles -=1; 
	       	System.out.println(phrase2 + bottles + phrase1 + " on the wall.");
		//System.out.print("\n");
			if (bottles == 0){
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
			}
	}

	}
}
