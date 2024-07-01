public class Phrase_O_Matic1 {
	public static void main (String[] args) {
		//1 make three sets of words to choose from. Add your own!
		String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};
		String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloudnative", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};
		String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "servicemesh", "architecture", "perspective", "design", "orientation"};
		//2 find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		//3 generate three random numbers
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);

		//4 now build a phrase
		String phrase = wordListOne[rand1] + " " +
		wordListTwo[rand2] + " " + wordListThree[rand3];

		//5 print out the phrase
		System.out.println("What we need is a " + phrase);
	}
}
