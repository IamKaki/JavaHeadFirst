class Bottles {
	public static void main(String[] args){
		int numberOfBottles = 99;
		String sing = " bottles of beer";

		while (numberOfBottles > 1){
			System.out.println(numberOfBottles + sing + " on the wall");
			System.out.println(numberOfBottles + sing);
			System.out.println("Take one down, pass it around. ");
			System.out.println();
			numberOfBottles = numberOfBottles - 1;
		}
		
		System.out.println(numberOfBottles + sing + " on the wall");
		System.out.println();

		if (numberOfBottles >= 1){
			sing = "bottle of beer";
			System.out.println("One " + sing + " on the wall");
			System.out.println("One " + sing);
		}

		System.out.println("Take one down, pass it around,");
		System.out.println("No more bottles of beer on the wall,");
		System.out.println("No more bottles of beer.");
	}
}
