class movie {
	String title;
	String director;
	int rating;

	void playIt(){
		System.out.println("Now playing this movie.");
	}
}
class movieTestDrive {
	public static void main(String[] args){
		movie one = new movie();
		one.title = "Fast and Furious 2";
		one.director = "KakiMan";
		one.rating = 5;

		movie two = new movie();
		two.title = "Witch of Oz";
		two.director = "LeviKimani";
		two.rating = 7;

		movie three = new movie();
		three.title = "Extraction";
		three.director = "GeeDat";
		three.rating = 9;

		System.out.println("The first one is called " + one.title + ", directed by the legendary " + one.director + ". It has a rating of " + one.rating + " on the movie charts.");
		one.playIt();
		System.out.println("The second one is called " + two.title + ", directed by the legendary " + two.director + ". It has a rating of " + two.rating + " on the movie charts.");
		two.playIt();
		System.out.println("The third one is called " + three.title + ", directed by the legendary " + three.director + ". It has a rating of " + three.rating + " on the movie charts.");
		three.playIt();
	}
}

