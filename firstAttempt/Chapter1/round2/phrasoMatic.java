public class phrasoMatic {
	public static void main(String[] args){
		String[] string1 = {"hang", "classroom", "salon", "orbit", "carve", "critical", "sight", "responsibility", "wildm", "worry"};
		String[] string2 = {"doubt", "tension", "host", "retired", "aisle", "mean", "arrest", "acute", "economy", "jurisdiction"};
		String[] string3 = {"corruption", "snuggle", "place", "product", "ceremony", "differ", "ambiguity", "bread", "intensify", "bomber"};

		int length1 = string1.length;
		int length2 = string2.length;
		int length3 = string3.length;
		
		java.util.Random randomWord = new java.util.Random();
		int random1 = randomWord.nextInt(length1);
		int random2 = randomWord.nextInt(length2);
		int random3 = randomWord.nextInt(length3);

		String phrase = string1[random1] + " " + string2[random2] + " " + string3[random3];

		System.out.println("What we need is a " + phrase + "?");
	}
}
