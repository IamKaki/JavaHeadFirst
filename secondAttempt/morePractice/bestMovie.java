class bestMovie {
	//declare the instance variables
	private String title;
	private String actor;
	private double rating;

	//create the public methods of setting and getting the private instance variables data
	public void setTitle(String newTitle){
		title = newTitle;
	}
	public String getTitle(){
		return title;
	}
	public void setActor(String newActor){
		actor = newActor;
	}
	public String getActor(){
		return actor;
	}
	public void setRating(double newRating){
		rating = newRating;
	}
	public double getRating(){
	       return rating;
	}
}

class bestMovieTestDrive {
	public static void main(String[] args){
		//creating the first object of type bestMovie
		bestMovie one = new bestMovie();

		//using the one object to set values for the instance variables
		one.setTitle("\"The first and the furious\"");
		one.setActor("Vin Diesel");
		one.setRating(9.0);

		//get and print the instance variables
		System.out.println("My best movie is " + one.getTitle() + ", acted by none other than " + one.getActor() + ".");
		System.out.println("It currently has a movie rating of " + one.getRating() + " on the IBM website.");
	}
}
