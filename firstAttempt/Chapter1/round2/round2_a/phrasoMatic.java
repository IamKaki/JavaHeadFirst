class phrasoMatic{
	public static void main(String[] args){
		String[] wordlist1 = {"relative", "reserve", "meeting", "reinforce", "achievement", "compact", "player", "bus", "shift", "toss"};
		String[] wordlist2 = {"object","choice","plant","respect","ignore","oppose","deadly","temptation","crack","route"};
		String[] wordlist3 = {"bait","consider","reconcile","sink","create","content","era","concern","experience","fat"};

		int length1 = wordlist1.length;
		int length2 = wordlist2.length;
		int length3 = wordlist3.length;

		java.util.Random randomWord = new java.util.Random();
		int random1 = randomWord.nextInt(length1);
		int random2 = randomWord.nextInt(length2);
		int random3 = randomWord.nextInt(length3);

		String phrase = wordlist1[random1] + " " + wordlist2[random2] + " " + wordlist3[random3];

		System.out.println("What we really need is a " + phrase + "?");
	}
}
